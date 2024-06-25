package firma;

import annotationen.Addition;
import annotationen.BaseSalary;
import annotationen.ManagerName;
import annotationen.NumberEmployees;

public class Abteilungsleiter {
    private double grundgehalt;
    private int anzahlMitarbeiter;
    private int bonus;
    private String seinName;

    public Abteilungsleiter(String name, double grundgehalt, int anzahlMitarbeiter, int bonus) {
        this.seinName = name;
        this.grundgehalt = grundgehalt;
        this.anzahlMitarbeiter = anzahlMitarbeiter;
        this.bonus = bonus;
    }

    @ManagerName
    public String getSeinName() {
        return seinName;
    }

    public void setSeinName(String seinName) {
        this.seinName = seinName;
    }

    @BaseSalary
    public double getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(double grundgehalt) {
        this.grundgehalt = grundgehalt;
    }

    @NumberEmployees
    public int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        this.anzahlMitarbeiter = anzahlMitarbeiter;
    }

    @Addition
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
