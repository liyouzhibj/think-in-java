class Base{}
class Drived extends Base{}

public class FamilyVsExactType{
    static void test(Object x){
        System.out.println("Testing x fo type " + x.getClass());
        System.out.println("x instanceof Base " + (x instanceof Base));
        System.out.println("x instanceof Drived " + (x instanceof Drived));    
    }

    public static void main(String[] args) {
        test(new Base());
        test(new Drived());
    }
}

