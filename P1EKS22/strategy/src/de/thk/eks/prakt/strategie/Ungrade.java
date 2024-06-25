package de.thk.eks.prakt.strategie;

public class Ungrade extends Strategie {
    @Override
    public void gebeWerteAus(int[] intArray) {
        System.out.print("\nUNGERADE Werte: ");
        for (int wert : intArray)
            if (wert % 2 != 0) System.out.print(wert + "; ");
    }
}
