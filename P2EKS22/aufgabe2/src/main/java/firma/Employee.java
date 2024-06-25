package firma;

import annotationen.BaseSalary;
import annotationen.EmplName;
import annotationen.NumberOvertimeHours;
import annotationen.RecruitmentYear;

public class Employee {
    private int recruitmentYear;
    private int numberOvertimeHours;
    private double baseSalary;
    private String emplName;

    public Employee(String name, int recruitmentYear, int numberOvertimeHours, double baseSalary) {
        this.recruitmentYear = recruitmentYear;
        this.numberOvertimeHours = numberOvertimeHours;
        this.baseSalary = baseSalary;
        this.emplName = name;
    }

    @EmplName
    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    @RecruitmentYear
    public int getRecruitmentYear() {
        return recruitmentYear;
    }

    public void setRecruitmentYear(int recruitmentYear) {
        this.recruitmentYear = recruitmentYear;
    }

    @NumberOvertimeHours
    public int getNumberOvertimeHours() {
        return numberOvertimeHours;
    }

    public void setNumberOvertimeHours(int numberOvertimeHours) {
        this.numberOvertimeHours = numberOvertimeHours;
    }

    @BaseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
