package de.thk.eks.prakt.strategie;

public class Gerade extends Strategie {
    @Override
    public void gebeWerteAus(int[] intArray) {
        System.out.print("\nGERADE Werte: ");
        for (int wert : intArray)
            if (wert % 2 == 0) System.out.print(wert + "; ");
    }
}
