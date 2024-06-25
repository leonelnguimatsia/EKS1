package de.thk.eks.prakt.schablonenmethode;

public class Main {
    public static void main(String[] args) {
        Leuchte l;
        // Strategie 1: Zufallsfarbe
        System.out.println("\nStrategie 1: Zufallsfarbe");
        l = new ZufallsLeuchte();
        l.einschalten();
        // Strategie 2: feste Farbe
        System.out.println("\nStrategie 2: feste Farbe");
        l = new FesteLeuchte();
        l.einschalten();
        // Strategie 3: zyklische Farbe
        System.out.println("\nStrategie 3: zyklische Farbe");
        l = new ZyklischeLeuchte();
        l.einschalten();
    }
}

