package com.revature.models;

/*
This is an abstract class, note the abstract keyword. this is all you need to create an abstract class.
So now this abstract class also has access to the edible variable and the two methods of Food
Abstract Classes are Classes with At Least one abstract method

Why use an abstract class over an interface?
- I use abstract Classes when I know I want to have methods that are defined.
- In this case, I'd need a concrete method so all subclasses share the same behavior

- In contrast, I use interfaces when I don't care about specific implementations of methods
- If I'm fine with every subclass implementing the methods differently, I'll use an Interface
- I mostly use Interfaces
 */
public abstract class Candy implements Food{

    //will include variables
    public boolean isSweet = true; //all candy is sweet, all food isn't necessarily sweet
    public int crunchFactor; //different candies are crunchier than others. we can define this in subclasses.

    //concrete method - has an implementation (method body)
    //all candies can be expected to melt, so we'll provide a specific implementation
    public void melt()
    {
        System.out.println("I'm melting :O");
    }

    //Every candy will get opened differently, so we'll leave the implementation up to the subclasses
    public abstract void getOpened();

    /*
    Abstract Classes (like interfaces) cannot be instantiated (can't make an object out of them)
    However, abstract classes can have constructors (which as we know, help us make an object)
    why?
    This is so that any concreted subclasses can have access to those constructors
    This abstract class does still get the default no-args constructor like any other class
     */


}
