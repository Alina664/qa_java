package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;


public class LionTest extends TestCase {

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        assertEquals(1, actual);
    }

    @Test(expected = Exception.class)
    public void testDoesHaveManeException() throws Exception {
        //для feline вызывается мок
        try {
            Lion lion = new Lion("неСамец", feline);
        }
        catch (Exception exception){
            assertEquals(exception.getMessage(),"Используйте допустимые значения пола животного - самец или самка");
        }

    }


    @Test
    public void testGetFoodLionCorrectGood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец",feline);
        Assert.assertEquals("Лев - хищник. И ему нужно разнообразное мясное питание!",lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}