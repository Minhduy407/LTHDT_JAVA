package iuh.onepiece.chopper;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit1() {
        BankAccount account = new BankAccount("1234-4567-8910","Chopper",10000);
        account.deposit(10000);
        double expected = 20000;
        assertEquals(expected,account.getBalance());
    }
    @Test
    void depositException(){
        BankAccount account = new BankAccount("5674-2134-2456","Luffy",0);
        Exception exception = assertThrows(IllegalArgumentException.class,()->{
            account.deposit(-10000);
        });
        String expected = "Amount must be greater than 0";
        assertEquals(expected,exception.getMessage());
        }

    @Test
    void withdraw1() {
        BankAccount account = new BankAccount("1234-4567-8910","Chopper",10000);
        account.withdraw(10000);
        double expected = 0;
        assertEquals(expected,account.getBalance());
    }
    @Test
    void withdrawException(){
        BankAccount account = new BankAccount("5674-2134-2456","Luffy",0);
        Exception exception = assertThrows(IllegalArgumentException.class,()->{
            account.withdraw(-10000);
        });
        String expected = "Amount must be greater than 0 and less than or equal to balance";
        assertEquals(expected,exception.getMessage());
    }

    @Test
     void transferTest() {
        BankAccount a1 = new BankAccount("1234-4567-8910","Chopper",10000);
        BankAccount a2 = new BankAccount("5674-2134-2456","Luffy",10000);
        a1.transfer(a2,10000);
        double expected1 = 0;
        double expected2 = 20000;
        assertEquals(expected1,a1.getBalance());
        assertEquals(expected2,a2.getBalance());
    }
}