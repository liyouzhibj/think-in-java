class Value{
    int i;

    Value(int i){
        this.i = i;
    }
}

public class EqualMethod{
    public static void main(String[] args) {
        String s1 = new String("123");
        String s2 = new String("123");

        if(s1 == s2){
            System.out.println("s1 == s2");
        }

        if(s1.equals(s2)){
            System.out.println("s1 equals s2");
        }

        Value v1 = new Value(1);
        Value v2 = new Value(1);

        System.out.println(v1.i);
        
        if(v1.equals(v2)){
            System.out.println("v1 equals v2");
        }
    }
}