class Plus{
    int i = 0;
    int a = (i++);
    int b = i;

    void print(){
        System.out.println("i = " + i + " ; a = " + a + " ; b = " + b + " ;") ;
    }
}


public class DoublePlus{

    public static void main(String[] args) {
        Plus plus = new Plus();
        plus.print();        
    }
}