package de.thk.eks.prakt.schablonenmethode;

public class FesteLeuchte extends Leuchte {
    public FesteLeuchte() {
        super();
    }

    @Override
    protected void farbeWechseln() {
        this.setFarbe(this.getArrayFarben()[3]);
    }
}
