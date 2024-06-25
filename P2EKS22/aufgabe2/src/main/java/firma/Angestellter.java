package firma;

import annotationen.BaseSalary;
import annotationen.EmplName;
import annotationen.NumberOvertimeHours;
import annotationen.RecruitmentYear;

public class Angestellter {
    private double grundgehalt;
    private int anzahlUeberstunden;
    private int einstellungsJahr;
    private String angName;

    public Angestellter(String name, double grundgehalt, int anzahlUeberstunden, int einstellungsJahr) {
        this.grundgehalt = grundgehalt;
        this.anzahlUeberstunden = anzahlUeberstunden;
        this.einstellungsJahr = einstellungsJahr;
        this.angName = name;
    }

    @EmplName
    public String getAngName() {
        return angName;
    }

    public void setAngName(String angName) {
        this.angName = angName;
    }

    @BaseSalary
    public double getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(double grundgehalt) {
        this.grundgehalt = grundgehalt;
    }

    @NumberOvertimeHours
    public int getAnzahlUeberstunden() {
        return anzahlUeberstunden;
    }

    public void setAnzahlUeberstunden(int anzahlUeberstunden) {
        this.anzahlUeberstunden = anzahlUeberstunden;
    }

    @RecruitmentYear
    public int getEinstellungsJahr() {
        return einstellungsJahr;
    }

    public void setEinstellungsJahr(int einstellungsJahr) {
        this.einstellungsJahr = einstellungsJahr;
    }
}
