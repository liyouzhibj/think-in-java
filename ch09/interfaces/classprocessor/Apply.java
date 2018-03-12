import java.util.Arrays;

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){
        return input;
    }
}

class Upcase extends Processor{
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor{
    String process(Object input){
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply{
    public static void pro(Processor p, Object o){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(o));
    }

    public static String s = "Disagreemnet with beliefs is by definition incorrect";

    public static void main(String[] args) {
        pro(new Upcase(), s);
        pro(new Downcase(), s);
        pro(new Splitter(), s);
    }
}
