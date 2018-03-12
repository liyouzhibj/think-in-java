public class WhoCalled{
    static void f(){
        try {
            throw new Exception();
        } catch (Exception e) {
            //TODO: handle exception
            for(StackTraceElement ste : e.getStackTrace()){
                System.out.println(ste.getMethodName());
                System.out.println(ste);
                // System.out.println(ste.getClassName());
            }
        }
    }

    static void g(){
        f();
    }

    static void h(){
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("-----------------------------");
        g();
        System.out.println("-----------------------------");
        h();
    }
}