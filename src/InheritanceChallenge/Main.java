package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee claudio = new HourlyEmployee("Claudio Hernesto",
                "14/08/1975", "19/06/2007");

        System.out.println(claudio.name + " is " + claudio.getAge() + " years old.");
        System.out.println(claudio.name + " collected $" + claudio.collectPay() + " payment");

        System.out.println(claudio.name + " collected holiday pay: $" + claudio.getDoublePay());
        System.out.println(claudio);

        SalariedEmployee bob = new SalariedEmployee("Bob Builder", "30/03/1988",
                "21/04/2001", 58000);
        System.out.println("Bob's Paycheck is: " + bob.collectPay());
        bob.retire();
        System.out.println("Bob's pension check is: $"+bob.collectPay());
    }
}
