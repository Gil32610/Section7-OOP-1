package InheritanceChallenge;

import java.util.Calendar;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate,
                            String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire(){
        super.terminate(Calendar.getInstance().getTime().toString());
        this.isRetired=true;
        System.out.println(name+ " is now retired");

    }

    @Override
    public double collectPay(){
        double paycheck = annualSalary/26;
        double adjustedPaycheck = (isRetired)? paycheck*0.9:paycheck;
        return (int) adjustedPaycheck;
    }
}
