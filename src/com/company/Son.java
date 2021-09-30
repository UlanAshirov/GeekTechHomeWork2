package com.company;

public class Son extends Father{
    public Son(int age, String name, Profession profession, MarriedEnum marriedEnum) {
        super(age, name, profession, marriedEnum);
    }

    @Override
    public void drinkAlcohol(String alcohol) {
        super.drinkAlcohol(alcohol);
        System.out.println("But his father doesn't know about it");
    }
}
