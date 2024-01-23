/*
@class java.lang.String 9/4/2023
@3:45 PM
@version 4.0
@author Huynh Le Minh Duy
@Copyright by ChopperTeam.
*/
package iuh.onepiece.chopper;

import java.util.Scanner;

public class BankTester {
    public static void main(String[] args) {
        Bank bank = new Bank("IUH Bank", 100);
        System.out.println("Welcome to " + bank.getBankName());
        int chon = 0;
        Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Menu");
                System.out.println("1. Open new account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. The total balance of all bank accounts in the bank");
                System.out.println("6. Print all bank accounts");
                System.out.println("7. Exit");
                System.out.println("Enter your choice: ");
                chon = sc.nextInt();
                sc.nextLine();
                switch (chon) {
                    case 1:
                        System.out.println("Add new account");
                        System.out.println("\nEnter account number: ");
                        String accountNumber = sc.nextLine();
                        System.out.println("\nEnter account name: ");
                        String accountName = sc.nextLine();
                        System.out.println("\nEnter balance: ");
                        double balance = sc.nextDouble();
                        bank.addNew(accountNumber,accountName,balance);
                        break;

                    case 2:
                        System.out.println("Deposit");
                        System.out.println("\nEnter account number: ");
                        String accountNumber1 = sc.nextLine();
                        BankAccount account = bank.find(accountNumber1);
                        if(account == null){
                            System.out.println("Account not found");
                            break;
                        }
                        System.out.println("\nEnter amount: ");
                        double amount = sc.nextDouble();
                        account.deposit(amount);
                        break;

                    case 3:
                        System.out.println("Withdraw");
                        System.out.println("\nEnter account number: ");
                        String accountNumber2 = sc.nextLine();
                        BankAccount account1 = bank.find(accountNumber2);
                        if(account1 == null){
                            System.out.println("Account not found");
                            break;
                        }
                        System.out.println("\nEnter amount: ");
                        double amount1 = sc.nextDouble();
                        account1.withdraw(amount1);
                        break;

                    case 4:
                        System.out.println("Transfer");
                        System.out.println("\nEnter account number to transfer from: ");
                        String accountNumber4 = sc.nextLine();
                        System.out.println("\nEnter account number to transfer to");
                        String accountNumber3 = sc.nextLine();
                        BankAccount account3 = bank.find(accountNumber4);
                        BankAccount account2 = bank.find(accountNumber3);
                        if(account3 == null || account2 == null){
                            System.out.println("Account not found");
                            break;
                        }
                        System.out.println("\nEnter amount: ");
                        double amount3 = sc.nextDouble();
                        account3.transfer(account2,amount3);
                        break;

                    case 5:
                        System.out.println("Total balance: " + bank.getTotalBalance());
                        break;

                    case 6:
                        BankAccount[] accounts = bank.getAccounts();
                        for (int i = 0;i < bank.getNumberOfAccounts();i++){
                            System.out.println(accounts[i]);
                        }
                        break;
                    case 7:
                        System.out.println("Goodbye");
                        break;
                }
            }while(chon> 0 && chon < 8);
    }
}
