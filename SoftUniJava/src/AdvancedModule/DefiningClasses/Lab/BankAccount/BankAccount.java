package AdvancedModule.DefiningClasses.Lab.BankAccount;

public class BankAccount {

    private int id;
    private double balance;
    private static double interest = 0.02;
    private static int bankAccountCount = 1;

BankAccount(){
    this.id = bankAccountCount++;
}
//CONSTRUCTORA BACE


//METHODS
 void deposit(double amount){
    this.balance += amount;
 }

    public static void setInterest(double interest) {
        BankAccount.interest = interest;
    }

    double getInterest(int years){
    return BankAccount.interest *years+this.balance;
 }
}

