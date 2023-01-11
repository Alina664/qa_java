package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Хищники принадлежат к семейству кошачьих", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Хищники принадлежат к семейству кошачьих", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNotParametersTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals("Метод GetKittens должен возвращать 1, в вызове без параметров", 1, actual);
    }

}