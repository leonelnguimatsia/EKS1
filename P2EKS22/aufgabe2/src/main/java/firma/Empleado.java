package firma;

import annotationen.BaseSalary;
import annotationen.EmplName;
import annotationen.NumberOvertimeHours;
import annotationen.RecruitmentYear;

public class Empleado {
    private int horasExtraordinarias;
    private double salarioBase;
    private int anoReclutamiento;
    private String emplNombre;

    public Empleado(String nombre, double salarioBase, int horasExtraordinarias, int anoReclutamiento) {
        this.salarioBase = salarioBase;
        this.horasExtraordinarias = horasExtraordinarias;
        this.anoReclutamiento = anoReclutamiento;
        this.emplNombre = nombre;
    }

    @EmplName
    public String getEmplNombre() {
        return emplNombre;
    }

    public void setEmplNombre(String emplNombre) {
        this.emplNombre = emplNombre;
    }

    @BaseSalary
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @NumberOvertimeHours
    public int getHorasExtraordinarias() {
        return horasExtraordinarias;
    }

    public void setHorasExtraordinarias(int horasExtraordinarias) {
        this.horasExtraordinarias = horasExtraordinarias;
    }

    @RecruitmentYear
    public int getAnoReclutamiento() {
        return anoReclutamiento;
    }

    public void setAnoReclutamiento(int anoReclutamiento) {
        this.anoReclutamiento = anoReclutamiento;
    }
}
