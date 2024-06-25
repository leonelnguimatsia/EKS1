package de.thk.eks.prakt.schablonenmethode;

public class ZufallsLeuchte extends Leuchte {
    public ZufallsLeuchte() {
        super();
    }

    @Override
    protected void farbeWechseln() {
        int iRandom = (int) (Math.random() * this.getArrayFarben().length);
        if(iRandom == this.getArrayFarben().length)iRandom--;
        this.setFarbe(this.getArrayFarben()[iRandom]);
    }
}
