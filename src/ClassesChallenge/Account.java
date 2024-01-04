package ClassesChallenge;

public class Account {
    private int accountNumber;

    private double balance;

    private String customerName;

    private String email;

    private String phoneNumber;


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if(balance<0)balance =0;
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        if(customerName==null)customerName="Unspecified";
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        if(email==null)customerName="Unspecified";
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber==null)customerName="Unspecified";
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        if(amount<0) System.out.println("Invalid amount!");
        else{
            this.balance+=amount;
            System.out.println("Deposit concluded successfully");
        }
    }

    public void withdrawFunds(double amount){
        if(amount>balance) System.out.println("Not enough funds!");
        else {
            this.balance-=amount;
            System.out.println("Withdraw concluded successfully");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "\naccountNumber=" + accountNumber +
                ", \nbalance=" + balance +
                ", \ncustomerName='" + customerName + '\'' +
                ", \nemail='" + email + '\'' +
                ", \nphoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
