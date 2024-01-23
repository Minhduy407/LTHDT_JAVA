package onepiece.chopper.iuh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DienVATTest {

    @Test
    void tiendien() {
        int money = DienVAT.tiendien(6638,7298);
        int expected = 1892110;
        assertEquals(expected,money);
    }
    @Test
    void tiendien1() {
        int money = DienVAT.tiendien(5689,6638);
        int expected = 2850579;
        assertEquals(expected,money);
    }
    @Test
    void tiendien2(){
        int money = DienVAT.tiendien(5640,5689);
        int expected = 93140;
        assertEquals(expected,money);
    }
    @Test
    void tiendien3(){
        int money = DienVAT.tiendien(5467,5640);
        int expected = 359813;
        assertEquals(expected,money);
    }
    @Test
    void tiendien4(){
        int money = DienVAT.tiendien(5467,5467);
        int expected = 0;
        assertEquals(expected,money);
    }
    @Test
    void tiendien5(){
        int money = DienVAT.tiendien(5417,5467);
        int expected = 95040;
        assertEquals(expected,money);
    }
}