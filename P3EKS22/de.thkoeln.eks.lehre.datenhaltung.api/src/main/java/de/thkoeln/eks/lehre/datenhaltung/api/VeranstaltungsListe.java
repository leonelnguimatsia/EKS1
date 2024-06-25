package de.thkoeln.eks.lehre.datenhaltung.api;

public interface VeranstaltungsListe {
    public Modul get(Integer id);
    public Integer createModul(Modul modul);
    public void setBelegbar(Integer id, boolean belegbar);
    public boolean istBelegbar(Integer id);
    public boolean existiertModul(String title);
}
