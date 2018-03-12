class Candy {
    static {
        System.out.println("loading Candy");
    }
}

class Gum {
    static {
        System.out.println("loading Gum");
    }
}

class Cookie{
    static{
        System.out.println("Loading Cookie");
    }
}

public class SweetShop{
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            //TODO: handle exception
            System.out.println("Couldn't found Gum");
        }

        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}