package gehaelter;

public class GehaltAngestellter {
    public double berechneGehalt(double grundgehalt, int ueberstunden, int einstellungsjahr) {
        int jahreMitarbeit = 2022 - einstellungsjahr + 1;
        double faktor1 = jahreMitarbeit / 40.0;
        double faktor2 = 1 / 20.0 + faktor1;
        double ergebnis = grundgehalt + (ueberstunden * faktor2) * grundgehalt;
        return ergebnis;
    }
}
