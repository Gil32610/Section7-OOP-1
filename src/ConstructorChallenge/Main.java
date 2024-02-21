package ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        Customer gil = new Customer("Gil", "gil@email.com");
        System.out.println("Customer Name: " + gil.getName() + " Customer Email: " + gil.getEmailAddress());


        Customer noOne = new Customer();
        System.out.println("Customer Name: " + noOne.getName() + " Customer Email: " + noOne.getEmailAddress() + " Customer Credit Limit: " + noOne.getCreditLimit());
    }
}
