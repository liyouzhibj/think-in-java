class Letter{
    char c;
}

public class PassObject{
    static void f(Letter letter){
        letter.c = 'z';
    }
    
    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.c = 'a';
        f(letter);
        System.out.println(letter.c);
    }
}