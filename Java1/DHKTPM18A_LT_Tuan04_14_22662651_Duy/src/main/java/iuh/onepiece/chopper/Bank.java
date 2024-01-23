/*
@class java.lang.String 9/2/2023
@1:07 PM
@version 4.0
@author Huynh Le Minh Duy
@Copyright by ChopperTeam.
*/
package iuh.onepiece.chopper;

public class Bank {
    /**
     * Bank
     * @param name
     * @param accounts
     */
    private String name;
    private BankAccount[] accounts;
    private int totalAccount = 0;

    /**
     * Add new accounts to bank
     */
    public Bank(){
        this("No name",100);
    }
    /**
     * Add new accounts to bank
     * @param name
     * @param numberOfAccounts
     */
    public Bank(String name, int numberOfAccounts){
        setBankName(name);
        if(numberOfAccounts <= 0){
            throw new IllegalArgumentException("Number of accounts must be greater than 0");
        }

        this.accounts = new BankAccount[numberOfAccounts];
        this.totalAccount = 0;
    }

    /**
     * Add new account to bank
     * @param accountNumber
     * @param accountName
     * @param balance
     */
    public void addNew(String accountNumber, String accountName, double balance){
        if(find(accountNumber) != null){
            throw new IllegalArgumentException("Account number already exists");
        }
        if(totalAccount == accounts.length){
            throw new IllegalArgumentException("Bank is full");
        }
        BankAccount account = new BankAccount(accountNumber, accountName, balance);
        accounts[totalAccount++] = account;
    }

    /**
     * Find account by account number
     * @param accountNumber
     * @return
     */
    public BankAccount find(String accountNumber){
        for(int i = 0;i < totalAccount;i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return null;
    }

    /**
     * Get total balance of all accounts
     * @return
     */
    public double getTotalBalance(){
        double total = 0;
        for(int i = 0;i < totalAccount;i++){
            total += accounts[i].getBalance();
        }
        return total;
    }

    /**
     * Get number of accounts
     * @return
     */
    public int getNumberOfAccounts(){
        return totalAccount;
    }

    /**
     * Get all accounts
     * @return
     */
    public BankAccount[] getAccounts(){
        return accounts;
    }

    /**
     * Set bank name
     * @param name
     */
    public void setBankName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("The bank name must not be null");
        }
        this.name = name;
    }

    /**
     * Get bank name
     */
    public String getBankName(){
        return name;
    }
}

