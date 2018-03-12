public class BasicThreads{
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        // t.run();
        System.out.println("waiting for LiftOff");
    }
}