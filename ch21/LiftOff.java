public class LiftOff implements Runnable{
    protected int countDown = 10;
    private int taskCount = 0;
    private int id = taskCount++;
    //private int id = ++taskCount;
    //private int id = taskCount + 1;
    private int id1 = taskCount;

    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "# " + id + " " + id1 + " (" + (countDown > 0 ? countDown : "Listoff!") + "). ";
    }

    public void run(){
        while(countDown-- > 0){
            //id1++;
            System.out.print(status());
            Thread.yield();
        }
    }

}