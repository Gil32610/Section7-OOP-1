package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee claudio = new HourlyEmployee("Claudio Hernesto",
                "14/08/1975",4412l,"19/06/2007");

        System.out.println(claudio.name + " is " + claudio.getAge() + " years old.");
        System.out.println(claudio.name + " collected $"+ claudio.collectPay()+ " payment");
        claudio.getDoublePay();
    }
}
