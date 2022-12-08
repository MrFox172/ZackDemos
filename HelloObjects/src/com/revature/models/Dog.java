package com.revature.models;

//this is a class meant to model a Dog - think of it as a "model" or blueprint for all Dog Objects
//this class defines all of the fields and behaviors of dogs.
public class Dog {
    //declare some dog fields - every dog object will have these attributes
    public String name;
    public int age;
    public int weight;

    //Declare a method for the Dog class
    //no-args constructor. they take no arguments
    //if you create a dog with no params, this constructor will be called
    //typically used to create default vals.
    public Dog()
    {
        name = "Nameless Dog";
        age = 0;
        weight = 5;
    }

    public Dog(String name, int weight)
    {
        this.name = name;
        age = 0;
        this.weight = weight;
    }

    //all-args constructor
    //this lets us make dogs with whatever values we choose
    public Dog (String name, int weight, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String bark()
    {
        return name+ " goes Bark! Bark!";
    }
}
