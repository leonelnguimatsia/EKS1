package de.thk.eks.prakt.composite.blatt;

import de.thk.eks.prakt.composite.component.AbteilungComponent;

public class Mitarbeiter extends AbteilungComponent {
    private String telefon;

    public Mitarbeiter() {
        super();
    }

    /**
     * <h2>Konstruktor</h2>
     *
     * @param name    String
     * @param telefon String
     */
    public Mitarbeiter(String name, String telefon) {
        super(name);
        this.telefon = telefon;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


    /**
     * <h2>print</h2>
     * <p>Gibt der Name und Telefon des Mitarbeiters aus.</p>
     *
     * @param tab String
     */
    @Override
    public void print(String tab) {
        System.out.println(tab + "Mitarbeiter: " + this.getName() + ", Telefon " + this.getTelefon());
    }

    /**
     * <h2>getMitarbeiterAnzahl</h2>
     * <p>Gibt Wert 1 für diesen Mitarbeiter zurück.</p>
     *
     * @return anzahlMitarbeiter int
     */
    @Override
    public int getMitarbeiterAnzahl() {
        return 1;
    }
}
