package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetFoodAnimalWithParameterized {

    private final String checkedText;
    private final List expected;

    public GetFoodAnimalWithParameterized(String checkedText, List expected) {
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
        assertEquals("Определенные виды животных, едят только определенную еду (getFood для класса Animal)", expected, actual);
    }

}
