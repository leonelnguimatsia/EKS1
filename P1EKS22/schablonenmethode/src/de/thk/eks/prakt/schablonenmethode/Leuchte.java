package de.thk.eks.prakt.schablonenmethode;

public abstract class Leuchte {
    private final String[] FARBEN = new String[]{"rot", "gelb", "grün", "blau", "weiß"};
    private String sFarbe;

    public Leuchte() {
    }

    protected abstract void farbeWechseln();

    public String getFarbe() {
        return this.sFarbe;
    }

    public void setFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public String[] getArrayFarben() {
        return FARBEN;
    }

    /**
     * <h2>einschalten</h2>
     * <p>Schablonenmethode</p>
     */
    public void einschalten() {
        for (int i = 0; i < 10; i++) {
            this.farbeWechseln();
            System.out.println("Farbe: " + this.sFarbe);
        }
    }
}
