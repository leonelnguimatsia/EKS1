import java.lang.reflect.Field;

public class AnwesenheitsAusgeber {
    public static void gebeAus(AnwesenheitsKlasse anwesenheitsKlasse) throws IllegalAccessException {
        Class<?> c = anwesenheitsKlasse.getClass();
        for (Field f: c.getDeclaredFields()) {
            f.setAccessible(true);
            if(f.isAnnotationPresent(Plus.class))
                System.out.println("Plus: " + ((Integer)f.get(anwesenheitsKlasse) + 5));
            if(f.isAnnotationPresent(Minus.class))
                System.out.println("Minus: " + ((Integer) f.get(anwesenheitsKlasse) - 6));
            f.setAccessible(false);
        }
    }
}
