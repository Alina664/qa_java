package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest{

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Хищники принадлежат к семейству кошачьих",feline.eatMeat(),List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        Assert.assertEquals("Хищники принадлежат к семейству кошачьих",feline.getFamily(),"Кошачьи");
    }

    @RunWith(Parameterized.class)
    public static class testGetKittensWithParameters {


            private final int checkedInt;
            private final int expected;

            public testGetKittensWithParameters(int checkedInt, int expected) {
                this.checkedInt = checkedInt;
                this.expected = expected;
            }

            @Parameterized.Parameters
            public static Object[][] getTestData() {
                return new Object[][]{
                    {1, 1},
                    {2, 2},
                    {0, 0},
                    {-1, -1},
                };
            }

            @Test
            public void getKittensTest(){
                Feline feline = new Feline();
                int actual = feline.getKittens(checkedInt);
                assertEquals(expected, actual);
            }
    }

    @Test
    public void getKittensNotParameters(){
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }
}