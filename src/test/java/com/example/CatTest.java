package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;



public class CatTest{


    @Test
    public void testGetSoundCatMay() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Звук который издает кошка должен быть Мяу",cat.getSound(),"Мяу");
    }

    @Test
    public void testGetFoodCatCorrectGood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Кошка - хищник. И ей нужно разнообразное мясное питание!",cat.getFood(),List.of("Животные", "Птицы", "Рыба"));
    }

}