package de.thkoeln.eks.lehre.datenhaltung.api;

public interface Pruefungssystem {
    public void pruefungErstellen(Integer id, int teilnehmer);
    public int anzahlTeilnehmer(Integer id);
    public void setPruefbar(Integer id, boolean pruefbar);
    public boolean istPruefbar(Integer id);
}
