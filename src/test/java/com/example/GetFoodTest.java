package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class GetFoodTest{

    @RunWith(Parameterized.class)
    public static class GetFood {

        private final String checkedText;
        private final List expected;

        public GetFood(String checkedText, List expected) {
            this.checkedText = checkedText;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"Травоядное", List.of("Трава", "Различные растения")},
                    {"Хищник", List.of("Животные", "Птицы", "Рыба")},
            };
        }

        @Test
        public void shouldCheckGetFood() throws Exception {
            Animal animal = new Animal();
            List actual = animal.getFood(checkedText);
            assertEquals(expected, actual);
        }
    }

    @Test(expected = Exception.class)
    public void shouldCheckGetFoodException() throws Exception {
            Animal animal = new Animal();
            animal.getFood("НеХищник");
        }

}