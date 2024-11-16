package Account;

public class BankAccount {
    //using private instace variable
    private int accountNumber;
    private String accountHolderName;
    private int balance;

    //using constructor to initalize the private variables
    public BankAccount(int accountNumber, String accountHolderName, int balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    //using getter to read the private variables
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public int getBalance(){
        return balance;
    }
   
    public void deposit(int depositAmount){
        if (depositAmount<0) {
            System.out.println("Amount should be positive.");
        } else {
            balance += depositAmount;
            System.out.println("Your amount is deposited.");
        }
    }
    public void withdraw(int withdrawAmount){
        if (withdrawAmount<0) {
            System.out.println("Amount should be positive.");
        } else if(withdrawAmount>balance){
            System.out.println("this amount is not in your account.");
        }
        else {
            balance -= withdrawAmount;
            System.out.println("Amount is withdraw.");
        }
    }
}
