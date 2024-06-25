package de.thkoeln.eks.lehre.fachlogik.fall78;

import de.thkoeln.eks.lehre.datenhaltung.api.Modul;
import de.thkoeln.eks.lehre.datenhaltung.api.Pruefungssystem;
import de.thkoeln.eks.lehre.datenhaltung.api.VeranstaltungsListe;

public class Fall78Impl {
    private VeranstaltungsListe liste;
    private Pruefungssystem pruefsystem;

    public void neuesModulPruefungErstellen(String titel, String dozent, int teilnehmer) {
        if (liste.existiertModul(titel)) {
            return;
        }

        String neuerTitel = "Modul" + titel;
        Modul neuesModul = new Modul(neuerTitel, dozent);
        neuesModul.setId(null);
        Integer id = liste.createModul(neuesModul);
        liste.setBelegbar(id, false);
        pruefsystem.setPruefbar(id, false);
        Modul diesesModul = liste.get(id);
        String modultitel = diesesModul.getTitel();
        if (modultitel.equals(neuerTitel)) {
            liste.existiertModul(modultitel);
            liste.setBelegbar(id, true);
            if (liste.istBelegbar(id)) {
                pruefsystem.pruefungErstellen(id, teilnehmer);
            }
        }
        int registrierteAnzahl = pruefsystem.anzahlTeilnehmer(id);
        if (registrierteAnzahl == teilnehmer) {
            pruefsystem.setPruefbar(id, true);
            pruefsystem.istPruefbar(id);
        }
    }
}
