package de.thk.eks.prakt.strategie;

public class BearbeiteArray {
    private final int[] intArray;
    Strategie strategie;

    public BearbeiteArray(int[] intArray) {
        this.intArray = intArray;
    }

    public void verarbeiteArray() {
        this.strategie.gebeWerteAus(this.intArray);
    }

    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }
}
