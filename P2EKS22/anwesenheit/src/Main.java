public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        AnwesenheitsKlasse objekt1, objekt2;
        objekt1 = new AnwesenheitsKlasse(11, 12, 13);
        objekt2 = new AnwesenheitsKlasse(14, 15, 16);
        System.out.println("Objekt 1");
        AnwesenheitsAusgeber.gebeAus(objekt1);
        System.out.println("===================");
        System.out.println("Objekt 2");
        AnwesenheitsAusgeber.gebeAus(objekt2);
    }
}
