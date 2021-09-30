package com.company;

public class Father extends GrandFather {

    public Father(int age, String name, Profession profession, MarriedEnum marriedEnum) {
        super(age, name, profession, marriedEnum);


    }

    public void drinkAlcohol(String alcohol, int shots) {
        int ml = 50 * shots;
        System.out.println(getName() + " drinks " + alcohol + " " + ml + " ml");
    }

    public void drinkAlcohol(String alcohol) {
        System.out.println(getName() + " drinks " + alcohol);
    }

    public final void drinkAlcohol() {
        System.out.println(getName() + " Drink water");
    }
}

