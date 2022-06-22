package lv.lu.training.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class OddNumberLookupTest {

    private OddNumberLookup example;

    @BeforeEach

    public void setUp(){

        example = new OddNumberLookup(12, 98);
    }

    @Test

    public void shouldBeOddNumber(){

        Assertions.assertTrue(OddNumberLookup.isOdd(3));
    }

    @Test
    public void shouldNotBeOddNumber(){

        Assertions.assertFalse(OddNumberLookup.isOdd(2));
    }


    @Test

    public void shouldGetFirstNumber(){

        int result = example.getFrom();
        Assertions.assertEquals(12, result);
    }

    @Test

    public void shouldGetLastNumber(){

        int result = example.getTill();
        Assertions.assertEquals(98, result);
    }



}

