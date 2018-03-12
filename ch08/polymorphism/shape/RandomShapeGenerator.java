package polymorphism.shape;

import java.util.Random;

import polymorphism.shape.*;

public class RandomShapeGenerator {
    private Random random = new Random(47);

    public Shape next() {
        switch (random.nextInt(2)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
        }
    }
}