import firma.*;
import gehaelter.GehaltAbteilungsleiter;
import gehaelter.GehaltAngestellter;
import gehaelter.GehaltFirma;

import java.lang.reflect.InvocationTargetException;

public class MainClass {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Angestellter max = new Angestellter("Max", 1900, 3, 2020);
        Gerente jorge = new Gerente("Jorge", 4, 7000, 20);
        Empleado fernando = new Empleado("Fernando", 5000, 5, 1990);
        Manager john = new Manager("John", 40, 200, 6000);
        Abteilungsleiter michael = new Abteilungsleiter("Michael", 4400, 10, 5);
        Employee jim = new Employee("Jim", 2000, 15, 2500);


        Object[] alleMitarbeiter = {max, jorge, fernando, john, michael, jim};

        GehaltAbteilungsleiter gehaltLeiter = new GehaltAbteilungsleiter();
        GehaltAngestellter gehaltMitarbeiter = new GehaltAngestellter();
        GehaltFirma gehaelter = new GehaltFirma(gehaltLeiter, gehaltMitarbeiter);
        gehaelter.berechneGehaelter(alleMitarbeiter);
    }
}
