package gehaelter;

public class GehaltAbteilungsleiter {
    public double berechneGehalt(double grundgehalt, int anzahlMitarbeiter, int bonus) {
        double faktorMitarbeiter = anzahlMitarbeiter / 40.0;
        double faktorBonus = bonus / 100.0;
        double faktor = faktorBonus + faktorMitarbeiter;
        double ergebnis3 = grundgehalt + grundgehalt * faktor;
        return ergebnis3;
    }
}
