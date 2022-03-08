package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {

    @Test
    public void getSoundCatMayTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Звук который издает кошка должен быть Мяу", "Мяу", cat.getSound());
    }

    @Test
    public void getFoodCatCorrectGoodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Кошка - хищник. И ей нужно разнообразное мясное питание!", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}