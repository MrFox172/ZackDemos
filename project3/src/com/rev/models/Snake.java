package com.rev.models;
public class Snake implements Animal
{

    @Override
    public void makeNoise()
    {
        System.out.println("zizzling");

    }

    @Override
    public void walk()
    {
        System.out.println("Slides");

    }

    @Override
    public void appearance()
    {
        System.out.println("Reptile apperance long");

    }
}