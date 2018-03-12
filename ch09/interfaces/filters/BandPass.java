package interfaces.filters;

import interfaces.filters.Fillter;

public class BandPass extends Fillter{
    double lowCutoff, highCutoff;
    public BandPass(double lowCutoff, double highCutoff){
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return super.process(input);
    }
}
