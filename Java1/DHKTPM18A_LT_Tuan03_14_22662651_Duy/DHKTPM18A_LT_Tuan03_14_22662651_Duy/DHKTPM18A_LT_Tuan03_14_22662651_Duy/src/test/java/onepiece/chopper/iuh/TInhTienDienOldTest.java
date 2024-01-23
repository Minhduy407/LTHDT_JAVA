package onepiece.chopper.iuh;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TInhTienDienOldTest {

    @Test
    void tinhTienDien() {
        int actual = TInhTienDienOld.tiendien(6638,7298);
        int expected = 1670020;
        assertEquals(expected,actual);
    }
    @Test
    void tinhTienDien1() {
        int actual = TInhTienDienOld.tiendien(5689,6638);
        int expected = 2515923;
        assertEquals(expected,actual);
    }
    @Test
    void tinhTienDien2(){
        int actual = TInhTienDienOld.tiendien(5640,5689);
        int expected = 82222;
        assertEquals(expected,actual);
    }
    @Test
    void tinhTienDien3(){
        int actual = TInhTienDienOld.tiendien(5467,5640);
        int expected = 317622;
        assertEquals(expected,actual);
    }
    @Test
    void tinhTienDien4(){
        int actual = TInhTienDienOld.tiendien(5467,5467);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void tinhTienDien5(){
        int actual = TInhTienDienOld.tiendien(5417,5467);
        int expected = 83900;
        assertEquals(expected,actual);
    }
}