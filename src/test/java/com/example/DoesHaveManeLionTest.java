package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DoesHaveManeLionTest {

    @Mock
    Feline feline;

    private final String checkedText;
    private final boolean expected;

    public DoesHaveManeLionTest(String checkedText, boolean expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManLionTest() throws Exception {
        Lion lion = new Lion(checkedText, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals("При создании объекта Lion пареметр sex может быть либо 'Самец', или 'Самка'", expected, actual);
    }

}
