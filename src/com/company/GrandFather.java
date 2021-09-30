package com.company;

public class GrandFather {
    private int age;
    private String name;
    private Profession profession;
    private MarriedEnum marriedEnum;

    public GrandFather(int age, String name, Profession profession, MarriedEnum marriedEnum) {
        this.age = age;
        this.name = name;
        this.profession = profession;
        this.marriedEnum = marriedEnum;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Profession getProfession() {
        return profession;
    }

    public MarriedEnum getMarriedEnum() {
        return marriedEnum;
    }

    public String getInfo() {
        return "Age: " + age +
                "\nName: " + name +
                "\nProfession: " + profession.getProfession() +
                "\nMarried: " + marriedEnum;
    }
}

