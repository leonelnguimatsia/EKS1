package firma;

import annotationen.Addition;
import annotationen.BaseSalary;
import annotationen.ManagerName;
import annotationen.NumberEmployees;

public class Gerente {
    private int numeroEmpleados;
    private double salarioBase;
    private int prima;
    private String gerenteNombre;

    public Gerente(String nombre, int numeroEmpleados, double salarioBase, int prima) {
        this.numeroEmpleados = numeroEmpleados;
        this.salarioBase = salarioBase;
        this.prima = prima;
        this.gerenteNombre = nombre;
    }

    @ManagerName
    public String getGerenteNombre() {
        return gerenteNombre;
    }

    public void setGerenteNombre(String gerenteNombre) {
        this.gerenteNombre = gerenteNombre;
    }

    @NumberEmployees
    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    @BaseSalary
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Addition
    public int getPrima() {
        return prima;
    }

    public void setPrima(int prima) {
        this.prima = prima;
    }
}
