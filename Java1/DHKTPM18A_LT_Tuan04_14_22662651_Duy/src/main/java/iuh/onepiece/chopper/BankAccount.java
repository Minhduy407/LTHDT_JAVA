/*
@class java.lang.String 9/2/2023
@11:06 AM
@version 4.0
@author Huynh Le Minh Duy
@Copyright by ChopperTeam.
*/
package iuh.onepiece.chopper;

import org.jetbrains.annotations.NotNull;

import java.util.InputMismatchException;

public class BankAccount {
    /**
     * @param accountNumber
     * @param ownerName
     * @param balance
     */
    private String accountNumber = "0000-0000-0000";
    private String ownerName = "No name";
    private double balance = 0.0;
    public BankAccount(){
        this("0000-0000-0000","No name",0.0);
    }
    public BankAccount(String accountNumber, String ownerName, double balance){
        setAccountNumber(accountNumber);
        setOwnerName(ownerName);
        if(balance < 0){
            throw new IllegalArgumentException("Balance must be greater than or equal to 0");
        }
        this.balance = balance;
    }

    /**
     * @return double return the balance
     * @param amount
     */
    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        this.balance += amount;
    }

    /**
     * Withdraw money from account
     * @param amount
     */
    public void withdraw(double amount){
        if(amount <=0 || amount > this.balance){
            throw new IllegalArgumentException("Amount must be greater than 0 and less than or equal to balance");
        }
        this.balance -= amount;
    }

    /**
     * Get the balance of the account
     * @return
     */
    public double getBalance(){
        return balance;
    }
    /**
     * Transfer money from this account to other account
     * @param other
     * @param amount
     */
    public void transfer(BankAccount other, double amount){
        this.withdraw(amount);
        other.deposit(amount);
    }

    /**
     * return String return the accountNumber
     *
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        if(accountNumber == null || accountNumber.trim().equals("")){
            throw new IllegalArgumentException("The account number must not be null");
        }
        this.accountNumber = accountNumber;
    }
    /**
     * Get the account number
     *
     * @return
     */
    public String getAccountNumber(){
        return accountNumber;
    }
    /**
     * @return String return the ownerName
     *
     * @param ownerName
     */
    public void setOwnerName(String ownerName){
        if(ownerName == null || ownerName.trim().equals("")){
            throw new IllegalArgumentException("The owner name must not be null");
        }
        this.ownerName = ownerName;
    }
    /**
     * Get the owner name
     * @return
     */
    public void getOwnerName(){
        System.out.println("Owner name: " + ownerName);
    }
    /**
     * Return a string representation of this object
     * @return
     */
    public String toString(){
        final var s = "Account number: " + accountNumber + " Owner name: " + ownerName + " Balance: " + balance;
        return s;
    }

}
