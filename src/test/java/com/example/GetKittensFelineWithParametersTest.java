package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetKittensFelineWithParametersTest {

    private final int checkedInt;
    private final int expected;

    public GetKittensFelineWithParametersTest(int checkedInt, int expected) {
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
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(checkedInt);
        assertEquals("Проверяем количество возвращаемых детей у хищника", expected, actual);
    }

}
