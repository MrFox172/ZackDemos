package com.rev.models;

public class Cat implements Animal{
    @Override
    public void makeNoise()
    {
        System.out.println("Cat says meow");
    }
    @Override
    public void walk()
    {
        System.out.println("The cat walks!");
    }

    @Override
    public void appearance()
    {
        System.out.println("The cat is large and fuzzy. Has pointed ears!");
    }
}
