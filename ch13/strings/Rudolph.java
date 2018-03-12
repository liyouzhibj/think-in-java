public class Rudolph{
    public static void main(String[] args) {
        for(String pattern : new String[]{"Rudolph", "[rR]udolph", "[A-Z]udolph", "\\w+", "R.*"}){
            System.out.println("Rudolph".matches(pattern));
        }
    }
}