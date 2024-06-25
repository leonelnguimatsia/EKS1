/*************************************************
 * @author svevog                                *
 * @author leonel Nguimatsia Tsobguim            *
 * @version 1.0                                  *
 * @since 20-11-2022                             *
 *************************************************/

package de.thk.eks.prakt.composite.test;

import de.thk.eks.prakt.composite.blatt.Mitarbeiter;
import de.thk.eks.prakt.composite.composite.Abteilung;

public class Client {

    public static void main(String[] args) {
        // Init Abteilung firma
        Abteilung firma = new Abteilung("Best Software Development", new Mitarbeiter("Chef", "1"));

        //      Init Abteilung Projekte
        Abteilung projekte = new Abteilung("Projekte", new Mitarbeiter("Meier", "3400"));
        projekte.addAbteilung(new Mitarbeiter("Kerstin", "1000"));
        projekte.addAbteilung(new Mitarbeiter("Peter", "1200"));

        //      Init Abteilung Entwicklung
        Mitarbeiter petersen = new Mitarbeiter("Petersen", "5566");
        Abteilung entwicklung = new Abteilung("Entwicklung", petersen);
        entwicklung.addAbteilung(new Mitarbeiter("Hansen", "6789"));
        entwicklung.addAbteilung(new Mitarbeiter("Müller", "9876"));
        //          Init Abteilung Entwicklung-Test
        Abteilung test = new Abteilung("Test", new Mitarbeiter("Jensen", "5544"));
        test.addAbteilung(new Mitarbeiter("Wagner", "2929"));
        test.addAbteilung(new Mitarbeiter("Goethe", "2345"));

        entwicklung.addAbteilung(test);
        //      ENDE Abteilung Entwicklung

        //      Init Abteilung Finanzen
        Abteilung finanzen = new Abteilung("Finanzen", new Mitarbeiter("Knete", "3200"));
        finanzen.addAbteilung(new Mitarbeiter("Michael", "2100"));
        finanzen.addAbteilung(new Mitarbeiter("Stefanie", "2200"));
        //          Init Abteilung Finanzen-Buchhaltung
        Abteilung buchhaltung = new Abteilung("Buchhaltung", new Mitarbeiter("Dieter", "3300"));
        buchhaltung.addAbteilung(new Mitarbeiter("Sabrina", "4300"));
        buchhaltung.addAbteilung(new Mitarbeiter("Torsten", "4400"));
        //          Init Abteilung Finanzen-Buchhaltung
        Abteilung controlling = new Abteilung("Controlling", new Mitarbeiter("Petra", "5400"));
        controlling.addAbteilung(new Mitarbeiter("Detlef", "5600"));
        Mitarbeiter silke = new Mitarbeiter("Silke", "5700");
        controlling.addAbteilung(silke);

        finanzen.addAbteilung(buchhaltung);
        finanzen.addAbteilung(controlling);
        //      ENDE Abteilung Finanzen

        firma.addAbteilung(projekte);
        firma.addAbteilung(entwicklung);
        firma.addAbteilung(finanzen);
        // ENDE Abteilung Firma

        // Aufrufe
        System.out.println("\nAnzahl Mitarbeiter für Firma Best Software Development: " + firma.getMitarbeiterAnzahl());
        firma.print("");
        System.out.println("\nAnzahl Mitarbeiter für Abteilung Entwicklung: " + entwicklung.getMitarbeiterAnzahl());
        entwicklung.print("");
        System.out.println("\nAnzahl Mitarbeiter für Abteilung Finanzen: " + finanzen.getMitarbeiterAnzahl());
        finanzen.print("");
        System.out.println("\nAnzahl Mitarbeiter für Mitarbeiterin Silke: " + silke.getMitarbeiterAnzahl());
        silke.print("");
        System.out.println("\nAnzahl Mitarbeiter für Mitarbeiterin Petersen: " + petersen.getMitarbeiterAnzahl());
        petersen.print("");
    }
}
