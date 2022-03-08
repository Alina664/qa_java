package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        assertEquals("Метод GetKittens должен возвращать 1, в вызове без параметров", 1, actual);
    }

    @Test
    public void doesHaveManeLionException() {
        //для feline вызывается мок
        try {
            Lion lion = new Lion("неСамец", feline);
        } catch (Exception exception) {
            assertEquals("При создании класса Lion использовался не верный аргумент", "Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    @Test
    public void getFoodLionCorrectGoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals("Лев - хищник. И ему нужно разнообразное мясное питание!", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

}