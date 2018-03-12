class Tank{
    int level;
}

public class Assignment{
    public static void main(String[] args) {
        Tank tank = new Tank();
        Tank tank2 = new Tank();

        tank.level = 1;
        tank2.level = 10;

        System.out.println(tank.level);
        System.out.println(tank2.level);

        tank = tank2;
        System.out.println(tank.level);
        System.out.println(tank2.level);

        tank.level = 20;
        System.out.println(tank.level);
        System.out.println(tank2.level);

        tank2.level = 30;
        System.out.println(tank.level);
        System.out.println(tank2.level);
    }
}