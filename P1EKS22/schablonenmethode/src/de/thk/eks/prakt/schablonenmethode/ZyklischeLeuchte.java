package de.thk.eks.prakt.schablonenmethode;

public class ZyklischeLeuchte extends Leuchte {
    public ZyklischeLeuchte() {
        super();
    }

    @Override
    protected void farbeWechseln() {
        int newIndex = 0;
        for (int i = 0; i < this.getArrayFarben().length; i++)
            if (this.getArrayFarben()[i].equals(this.getFarbe()))
                newIndex = i + 1;
        if (newIndex >= this.getArrayFarben().length) newIndex = 0;
        this.setFarbe(this.getArrayFarben()[newIndex]);
    }
}
