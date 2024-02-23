package InheritanceChallenge;

import java.time.Year;

public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int yearBorn = Integer.parseInt(birthDate.split("/")[2]);
        return Year.now().getValue() - yearBorn;
    }

    public double collectPay() {
        return 0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
        System.out.println("Contract terminated in " + endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
