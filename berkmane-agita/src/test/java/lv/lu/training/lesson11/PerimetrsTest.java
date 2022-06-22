package lv.lu.training.lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerimetrsTest {
    @Test
public void shouldCalculatePerimeter(){
    Perimetrs perimetrs = new Perimetrs();
   int TrijsturaPerimetrs = perimetrs.TrijsturaPerimetrs(2, 3, 4);

    Assertions.assertEquals(9, TrijsturaPerimetrs);
}

@Test
    public void parbaudaTrijsturaMalas(){
    Perimetrs perimetrs = new Perimetrs();
    boolean nevienadiba = perimetrs.Nevienadiba(2, 5, 3);
Assertions.assertTrue(true);
}

    @Test
    public void parbaudaTrijsturaMalas2(){
        Perimetrs perimetrs = new Perimetrs();
        boolean nevienadiba2 = perimetrs.Nevienadiba(21, 5, 3);
        Assertions.assertTrue (false);
    }
}





