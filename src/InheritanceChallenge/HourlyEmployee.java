package InheritanceChallenge;

public class HourlyEmployee extends Employee {

    private double payRate;

    public HourlyEmployee(String name, String birthDate, String hireDate) {
        super(name, birthDate, hireDate);
        this.payRate = 15;
    }

    @Override
    public double collectPay(){
     return 40*payRate;
    }
    public double getDoublePay() {
        return 2*collectPay();
    }
}
