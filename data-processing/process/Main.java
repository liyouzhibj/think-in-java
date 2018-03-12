package process;

import java.io.*;
import java.nio.CharBuffer;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Key{
    private String key;

    public Key(String key){
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

class Detail{
    private String key;
    private String file;
    private String lineNumber;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }
}

public class Main {

    private static Set<String> keys = new HashSet<>();
//    public static void read(File file){
//        Reader reader = null;
//        try {
//            // 一次读一个字符
//            reader = new InputStreamReader(new FileInputStream(file));
//            int tempchar;
//            int lineLength = 0;
//            int linenum = 1;
//            char[] line = new char[1024];
//
//            while ((tempchar = reader.read()) != -1) {
//                char min = '\u4e00';
//                char max = '\u9fa5';
//
//                line[lineLength++] = (char) tempchar;
//                if(((char)tempchar) == '\n' || ((char)tempchar) == '\r'){
//                    System.out.println("行号：" + linenum + "行长度：" + lineLength);
//                    System.out.println(Arrays.copyOfRange(line, 0, lineLength));
//
//                    int wordLength =
//
//                    lineLength = 0;
//                    linenum++;
//                }
//
//
//
////                if(tempchar >= min && tempchar <= max){
//////                    System.out.print((char) tempchar);
////                    tempArray[flag++] = (char) tempchar;
////                    continue;
////                }
//            }
//            reader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    public static void read(File file) {
        BufferedReader reader = null;
        try {
//            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                getWord(tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

    public static void getWord(String str){
        str = str.replaceAll("(?<!:)\\/\\/.*|\\/\\*(\\s|.)*?\\*\\/", "");

        String reg = "[\u4e00-\u9fa5]+";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
            System.out.println(str.substring(m.start(), m.end()));
            keys.add(str.substring(m.start(), m.end()));
        }
    }

    public static void traversal(String path){
        int fileNum = 0, folderNum = 0;
        File file = new File(path);
        if (file.exists()) {
            LinkedList<File> list = new LinkedList<File>();
            File[] files = file.listFiles();
            for (File file2 : files) {
                if (file2.isDirectory()) {
                    System.out.println("文件夹:" + file2.getAbsolutePath());
                    list.add(file2);
                    folderNum++;
                } else {
                    System.out.println("文件:" + file2.getAbsolutePath());
                    read(file2);
                    fileNum++;
                }
            }
            File temp_file;
            while (!list.isEmpty()) {
                temp_file = list.removeFirst();
                files = temp_file.listFiles();
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        list.add(file2);
                        folderNum++;
                    } else {
                        System.out.println("文件:" + file2.getAbsolutePath());
                        read(file2);
                        fileNum++;
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        System.out.println("文件夹共有:" + folderNum + ",文件共有:" + fileNum);
    }

    public static void saveCSV(){
        
    }


    public static void main(String[] args){
        String path = "/Users/liyouzhi/Documents/code/github/data-processing/data";

        traversal(path);

        for (String str : keys){
            System.out.println(str);
        }

    }
}
