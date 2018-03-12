import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return counter;
    }
}

class Orage {
}

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        // apples.add(new Orage());

        for (int i = 0; i < apples.size(); i++) {
            long id = apples.get(i).id();
            System.out.println(id);
        }

    }
}