package InheritanceChallenge;

public class HourlyEmployee extends Employee {

    private double payRate;

    public HourlyEmployee(String name, String birthDate, String hireDate) {
        super(name, birthDate, hireDate);
        this.payRate = 0.15;
    }

    @Override
    public double collectPay(){
     double payment = super.collectPay();
     return payment*payRate;
    }
    public void getDoublePay() {
        this.payRate*=2;
        System.out.println(name+ " is now getting double payment");
    }
}
