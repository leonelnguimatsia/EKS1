package de.thk.eks.prakt.strategie;

public class Client {
    public static void main(String[] args) {
        int[] intArray = {3, 78, 45, 120, 43, 87, 987, 35, 64};
        BearbeiteArray bearbeiteArray = new BearbeiteArray(intArray);
        bearbeiteArray.setStrategie(new Gerade());
        bearbeiteArray.verarbeiteArray();
        bearbeiteArray.setStrategie(new Ungrade());
        bearbeiteArray.verarbeiteArray();
    }
}
