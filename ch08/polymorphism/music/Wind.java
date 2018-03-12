package polymorphism.music;

import polymorphism.music.*;

public class Wind extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}