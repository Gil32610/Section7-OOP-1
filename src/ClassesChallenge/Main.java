package ClassesChallenge;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();



        account.depositFunds(5000);
        System.out.println(account);
        System.out.println("-".repeat(20));
        account.withdrawFunds(4500);
        System.out.println(account);

        Account gilAccount = new Account("Gil","gil@emai;.com" , "9999999");
        System.out.println(gilAccount);
    }
}
