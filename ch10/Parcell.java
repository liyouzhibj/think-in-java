public class Parcell {
    class Contenets {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination{
        private String label;
        
        Destination(String WhereTo){
            label = WhereTo;
        }

        String readLabel(){
            return label;
        }
    }

    public void ship(String dest){
        Contenets con = new Contenets();
        Destination des = new Destination(dest);
        System.out.println(con.value());
        System.out.println(des.label);
    }

    public static void main(String[] args) {
        Parcell p = new Parcell();
        p.ship("Tasmania");
    }
}