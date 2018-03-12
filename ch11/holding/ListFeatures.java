import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Integer> intlist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intlist.add(random.nextInt(10));
        }
        System.out.println("1: " + intlist);

        System.out.println("2: " + intlist.contains(1));

        intlist.remove(1);

        System.out.println("3: " + intlist);

        

    }
}