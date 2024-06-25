package gehaelter;

import annotationen.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.NumberFormat;

public class GehaltFirma {
    private final GehaltAbteilungsleiter gehaltLeiter;
    private final GehaltAngestellter gehaltMitarbeiter;

    public GehaltFirma(GehaltAbteilungsleiter gehaltLeiter, GehaltAngestellter gehaltMitarbeiter) {
        this.gehaltLeiter = gehaltLeiter;
        this.gehaltMitarbeiter = gehaltMitarbeiter;
    }

    public void berechneGehaelter(Object[] alleMitarbeiter) throws InvocationTargetException, IllegalAccessException {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        int addition = 0, numberEmployees = 0, numberOvertimeHours = 0, recruitmentYear = 0;
        double baseSalary = 0;
        String managerName = "", employeeName = "";
        boolean isManager;
        for (Object o : alleMitarbeiter) {
            Class<?> c = o.getClass();
            isManager = false;
            for (Method m : c.getDeclaredMethods()) {
                if (m.isAnnotationPresent(Addition.class))
                    addition = (int) m.invoke(o);
                if (m.isAnnotationPresent(BaseSalary.class))
                    baseSalary = (double) m.invoke(o);
                if (m.isAnnotationPresent(EmplName.class))
                    employeeName = (String) m.invoke(o);
                if (m.isAnnotationPresent(NumberEmployees.class))
                    numberEmployees = (int) m.invoke(o);
                if (m.isAnnotationPresent(NumberOvertimeHours.class))
                    numberOvertimeHours = (int) m.invoke(o);
                if (m.isAnnotationPresent(RecruitmentYear.class))
                    recruitmentYear = (int) m.invoke(o);
                if (m.isAnnotationPresent(ManagerName.class)) {
                    managerName = (String) m.invoke(o);
                    isManager = true;
                }
            }
            if (isManager)
                System.out.println("Gehalt vom Abteilungsleiter " + managerName + " : " + currencyFormat.format(gehaltLeiter.berechneGehalt(baseSalary, numberEmployees, addition)).replace("€", "").trim() + ";");
            else
                System.out.println("Gehalt vom Angestellten " + employeeName + " : " + currencyFormat.format(gehaltMitarbeiter.berechneGehalt(baseSalary, numberOvertimeHours, recruitmentYear)).replace("€", "").trim() + ";");
        }
    }
}
