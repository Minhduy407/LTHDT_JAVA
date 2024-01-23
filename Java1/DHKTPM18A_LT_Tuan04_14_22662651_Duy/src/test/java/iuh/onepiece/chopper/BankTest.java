package iuh.onepiece.chopper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void addNew1() {
        Bank bank = new Bank("One Piece",2);
        bank.addNew("0984-2456-1234","Franky",125000);
        String expection = "0984-2456-1234";
        assertEquals(expection,bank.find("0984-2456-1234").getAccountNumber());
    }
    @Test
    void expectionAddNew1(){
        Bank bank = new Bank("One Piece",2);
        bank.addNew("1234-4567-8910","Chopper",10000);
        Exception exception = assertThrows(IllegalArgumentException.class,()->{
            bank.addNew("1234-4567-8910","Luffy", 10000);
        });
    String expected = "Account number already exists";
    assertEquals(expected,exception.getMessage());
    }
    @Test
    void expectionAddNew2(){
        Bank bank = new Bank("One Piece",1);
        bank.addNew("1234-4567-8910","Chopper",10000);
        Exception exception = assertThrows(IllegalArgumentException.class,()->{
            bank.addNew("0912-4376-4325","Luffy2", 10000);
        });
        String expected = "Bank is full";
        assertEquals(expected,exception.getMessage());
    }
    @Test
    void setBankNameTest() {
        Bank bank = new Bank("One piece",2);
        bank.setBankName("One Piece 3");
        String expected = "One Piece 3";
        assertEquals(expected,bank.getBankName());
    }
    @Test
    void expectedSetBankNameTest(){
        Bank bank = new Bank("One piece",2);
        Exception exception = assertThrows(IllegalArgumentException.class,()->{
            bank.setBankName("");
        });
        String expected = "The bank name must not be null";
        assertEquals(expected,exception.getMessage());
    }

}