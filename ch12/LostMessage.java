class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } catch (Exception e) {
                System.out.println(e);
            }
            finally {
                //TODO: handle exception
                lm.dispose();
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}