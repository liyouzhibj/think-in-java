import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class SimpleRead {
    public static BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803"));

    public static void main(String[] args) {
        try {
            System.out.println("What is your name?");
            String name = input.readLine(); 
            System.out.println(name);      
            String numbers = input.readLine();
            System.out.println(numbers);    
        } catch (IOException e) {
            //TODO: handle exception
        }
    }   
}