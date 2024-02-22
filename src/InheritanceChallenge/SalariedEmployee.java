package InheritanceChallenge;

import java.util.Calendar;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId,
                            String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire(){
        super.terminate(Calendar.getInstance().getTime().toString());
        this.isRetired=true;
        System.out.println("Salaried Employee is now retired");
    }
}
