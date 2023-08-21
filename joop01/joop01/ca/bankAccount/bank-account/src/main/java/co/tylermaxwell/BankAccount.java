package co.tylermaxwell;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts

    public BankAccount() {
        accounts++;
    }


    // GETTERS
    // for checking, savings, accounts, and totalMoney

    public static int getAccounts(){
        return accounts;
    }

    public static double getTotalMoney(){
        return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    
    public void deposit(double amount, String acctType){
        if(acctType.toLowerCase().startsWith("c")){
            this.setCheckingBalance(this.getCheckingBalance() + amount);
        } else {
            this.setSavingsBalance(this.getSavingsBalance() + amount);
        }

        
    }
    // withdraw
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdraw(double amount, String acctType){


    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance(){
        System.out.printf("Your balance is: $%.2f\n", this.getCheckingBalance() + this.getSavingsBalance());

    }



    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }




}
