package ClassesChallenge;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        account.setAccountNumber(461313);
        account.setCustomerName("Gil Araújo");
        account.setEmail("gilaraujo417@gmail.com");
        account.setPhoneNumber("(00)00000-0000");

        account.depositFunds(5000);
        System.out.println(account);
        System.out.println("-".repeat(20));
        account.withdrawFunds(4500);
        System.out.println(account);
    }
}
