import hello.Print;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception{
//        Print p = new Print();
//        p.print();

//        List<String> list = new ArrayList<>();
//        list.add("hello");
//        list.add("world");
//        System.out.println(list);

        String str = "a你好1";
        byte[] bytes = str.getBytes();
        byte[] bytes1 = str.substring(0,1).getBytes();
        byte[] bytes2 = str.substring(1,3).getBytes();
        System.out.println(str + ": " + bytes.length);
        System.out.println(str.substring(0,1) + ": " + bytes1.length);
        System.out.println(str.substring(1,3) + ": " + bytes2.length);
        System.out.println(str.length());

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        BufferedWriter writer = new BufferedWriter(new FileWriter(""));
        writer.write();
    }
}
