package Account;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bank Account !");
        System.out.print(" Enter Account Number: ");
        int acc_Num = input.nextInt();
        input.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = input.nextLine();
        System.out.print("Enter Balance: ");
        int balance = input.nextInt();
        if(balance<=0){
            System.out.println("Balance should be positive and more than zero.");
            System.out.print("Enter balance: ");
            balance = input.nextInt();
        }
        // Creating object of BankAccount class 
        BankAccount customer = new BankAccount(acc_Num, accountHolderName,balance);
        System.out.println("Account Created Successfully ! ");
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose Option: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter your amount to be deposit: ");
                    int depositAmount = input.nextInt();
                    customer.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter your amount to be withdraw: ");
                    int withdrawAmount = input.nextInt();
                    customer.withdraw(withdrawAmount);
                    break; 
                case 3:
                    int currentBalance = customer.getBalance();
                    System.out.println("Your current Balance is: "+currentBalance);
                    break;
                case 4:
                    System.out.print("Thank You! For using Bank Account. ");
                    return;
                default:
                    System.out.println("Invalid choice! ");
                    break;
            }
        }
        
    }
}
