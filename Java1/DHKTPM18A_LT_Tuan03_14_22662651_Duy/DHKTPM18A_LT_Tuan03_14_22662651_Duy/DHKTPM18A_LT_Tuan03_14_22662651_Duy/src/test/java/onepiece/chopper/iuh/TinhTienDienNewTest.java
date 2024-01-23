package onepiece.chopper.iuh;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TinhTienDienNewTest {
    @Test
    void TestgetTienDien(){
        int actual = TinhTienDienNew.getTienDien(6638,7298);
        int expect = 1892110;
        assertEquals(expect,actual);
    }
    @Test
    void TestgetTienDien1(){
        int actual = TinhTienDienNew.getTienDien(5689,6638);
        int expect = 2850579;
        assertEquals(expect,actual);
    }
    @Test
    void TestgetTienDien2(){
        int actual = TinhTienDienNew.getTienDien(5640,5689);
        int expect = 93140;
        assertEquals(expect,actual);
    }
    @Test
    void TestgetTienDien3(){
        int actual = TinhTienDienNew.getTienDien(5467,5640);
        int expect = 359813;
        assertEquals(expect,actual);
    }
    @Test
    void TestgetTienDien4(){
        int actual = TinhTienDienNew.getTienDien(5467,5467);
        int expect = 0;
        assertEquals(expect,actual);
    }
    @Test
    void TestgetTienDien5(){
        int actual = TinhTienDienNew.getTienDien(5417,5467);
        int expect = 95040;
        assertEquals(expect,actual);
    }
}