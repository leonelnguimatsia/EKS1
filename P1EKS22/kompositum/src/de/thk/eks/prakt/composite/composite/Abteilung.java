package de.thk.eks.prakt.composite.composite;

import de.thk.eks.prakt.composite.blatt.Mitarbeiter;
import de.thk.eks.prakt.composite.component.AbteilungComponent;

import java.util.ArrayList;

public class Abteilung extends AbteilungComponent {
    /**
     * static Tab String realised with 4 blanks
     */
    private static final String BLANKTAB = "    ";
    //ArrayList AbteilungComponent zur Realisierung des Kompositums
    private ArrayList<AbteilungComponent> abteilungen;
    private Mitarbeiter leiter;

    public Abteilung() {
        super();
        abteilungen = new ArrayList<>();
    }

    /**
     * Konstruktor "Abteilung" mit Parameter
     *
     * @param name        String
     * @param mitarbeiter Mitarbeiter
     */
    public Abteilung(String name, Mitarbeiter mitarbeiter) {
        super(name);
        this.leiter = mitarbeiter;
        abteilungen = new ArrayList<>();
    }

    public Mitarbeiter getLeiter() {
        return leiter;
    }

    public void setLeiter(Mitarbeiter leiter) {
        this.leiter = leiter;
    }

    public ArrayList<AbteilungComponent> getAbteilungen() {
        return abteilungen;
    }

    public void setAbteilungen(ArrayList<AbteilungComponent> abteilungen) {
        this.abteilungen = abteilungen;
    }

    /**
     * Methode addAbteilung() : Hinzufügen einer Struktur zu einer Abteilung (also Unter-Abteilungen und/oder Mitarbeiter)
     *
     * @param abteilung AbteilungComponent
     */
    public void addAbteilung(AbteilungComponent abteilung) {
        abteilungen.add(abteilung);
    }

    /**
     * Methode delAbteilung() : Entfernen einer Struktur zu einer Abteilung (also Unter-Abteilungen und/oder Mitarbeiter)
     *
     * @param abteilung AbteilungComponent
     */
    public void delAbteilung(AbteilungComponent abteilung) {
        abteilungen.remove(abteilung);
    }

    /**
     * <h2>print</h2>
     * <p>Gibt Eigenschaften dieser Abteilung und Unterabteilungen aus.</p>
     *
     * @param tab String
     */
    @Override
    public void print(String tab) {
        System.out.println(tab + "Abteilung: " + getName() + ", Leiter: " + leiter.getName() + ", Telefon: " + leiter.getTelefon());
        for (AbteilungComponent abteilung : abteilungen)
            abteilung.print(tab + BLANKTAB);
    }

    /**
     * <h2>getMitarbeiterAnzahl</h2>>
     * <p>Berechnung der Anzahl Mitarbeiter pro Abteilung</p>
     *
     * @return mitarbeiterAnzahl int
     */
    @Override
    public int getMitarbeiterAnzahl() {
        int mitarbeiterAnzahl = 0;
        if (this.leiter != null) mitarbeiterAnzahl = 1;
        for (AbteilungComponent abteilung : abteilungen)
            mitarbeiterAnzahl += abteilung.getMitarbeiterAnzahl();
        return mitarbeiterAnzahl;
    }
}
