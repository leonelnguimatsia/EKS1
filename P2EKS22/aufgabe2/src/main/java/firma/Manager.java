package firma;

import annotationen.Addition;
import annotationen.BaseSalary;
import annotationen.ManagerName;
import annotationen.NumberEmployees;

public class Manager {
    private int addition;
    private int numberEmployees;
    private double baseSalary;
    private String managerName;

    public Manager(String name, int addition, int numberEmployees, double baseSalary) {
        this.addition = addition;
        this.numberEmployees = numberEmployees;
        this.baseSalary = baseSalary;
        this.managerName = name;
    }

    @ManagerName
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Addition
    public int getAddition() {
        return addition;
    }

    public void setAddition(int addition) {
        this.addition = addition;
    }

    @NumberEmployees
    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @BaseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
