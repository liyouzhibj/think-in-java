import java.util.Random;

public class RandomDoubles {
    private static Random rand = new Random();

    public double next() {
        return rand.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles rDoubles = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.print(rDoubles.next() + " ");
        }
        System.out.println();
    }
}