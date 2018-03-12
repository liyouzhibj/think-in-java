package interfaces.filters;

import interfaces.filters.Waveform;

public class Filter{
    public String name(){
        return getClass().getName();
    }

    public Waveform process(Waveform input){
        return input;
    }
}
