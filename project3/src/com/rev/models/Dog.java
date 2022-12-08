package com.rev.models;
public class Dog implements Animal{

    @Override
    public void makeNoise()
    {
        System.out.println("Bark!");
    }
    @Override
    public void walk()
    {
        System.out.println("Dog is walking.");

    }
    @Override
    public void appearance()
    {
        System.out.println("the dog has yellow fur");
    }
}