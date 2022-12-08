package com.revature.models;

/*
    Pibull extends dog... so what?
    This is a primary example of inheritance in Java. one of the pillars of oop.
    We can achieve inheritance by extending parent classes. The pitbull class has everything the dog class has
    but it can also have it's own variables and new methods unique to pitbull
    Pitbull is therefore a child class of dog. Subclass/superclass relations
 */
public class Pitbull extends Dog{
    boolean clippedEars;
    public Pitbull()
    {
        //calls to super(); are known as "constructor chaining" - calling a constructor within a constructor
        super();
        clippedEars = false;
    }
    public Pitbull(String name, int age, int weight)
    {
        super(name,weight,age);
        clippedEars = false;
    }
    public Pitbull(String name, int age, int weight, boolean clippedEars)
    {
        super(name,weight,age);
        this.clippedEars = clippedEars;
    }
    public void bite(String victim)
    {
        System.out.println(name + " is untrained and bites "+victim);
    }
    /*
    Method overriding - children classes override parent classes interpretation.
    But here, we declare the same method signature, with a different method body.
    this is another example of polymorphism (a pillar of OOP)
     */
    @Override
    public String bark()
    {
        return name + " says MR WORLDWIIIIIIDE";
    }
}
