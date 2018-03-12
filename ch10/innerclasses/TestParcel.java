class Parcel{
    private class PContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    private class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo){
            this.label = whereTo;
        }
        @Override
        public String readLable() {
            return label;
        }
    }

    public Contents contents(){
        return new PContents();
    }

    public Destination destination(String s){
        return new PDestination(s);
    }
}

public class TestParcel{
    public static void main(String[] args) {
        Parcel p = new Parcel();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        System.out.println(c.value());
        System.out.println(d.readLable());
    }
}