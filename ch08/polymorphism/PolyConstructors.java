class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before");
        draw();
        System.out.println("Glyph() after");
    }
}

class RoundGlyph extends Glyph{
    private static int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph().radius = " + radius);
    }

    void draw(){
        System.out.println("RoundGlyph.draw().radius = " + radius);
    }
}

public class PolyConstructors{
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

