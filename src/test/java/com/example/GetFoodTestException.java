package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetFoodTestException {

    @Test
    public void shouldCheckGetFoodException() {
        Animal animal = new Animal();
        try {
            animal.getFood("НеХищник");
        } catch (Exception exception) {
            assertEquals("При вызове метода getFood нееобходимо использовать значение Травоядное или Хищник", "Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }
    }

}