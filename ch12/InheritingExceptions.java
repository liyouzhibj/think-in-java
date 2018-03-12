class SimpleException extends Exception{
    public SimpleException(){
        System.out.println("SimpleException()");
    }
}

public class InheritingExceptions{
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions inheritingExceptions = new InheritingExceptions();
        try {
            inheritingExceptions.f();           
        } catch (SimpleException e) {
            //TODO: handle exception
            System.out.println("Catch it!");
        }
    }
}