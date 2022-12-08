package com.revature.models;

/*
This is an interface, which contain fields and abstract methods
the fields can be initialized or uninitialized, but the methods are abstract (usually)
Interfaces are meant to be implemented by classes, which give functionality to the abstract methods
The reason Interfaces are called "contracts" is that implementing classes MUST define the method bodies.
Otherwise the code will not compile.
 */
public interface Food {

    //interface variables are public, final by default
    boolean isEdible = true;

    //Abstract method - no method body! public abstract by default
    void getEaten(); //every Food should be able to get eaten, however, different foods will bet eaten different ways
    //the job of an interface is to Lay Out behaviors, but not how to perform that behavior
    //how to perform is the job the of the class that implements the interface

    //another abstract method, this one takes a parameter
    void throwAway(int days);

    default void test()
    {
        System.out.println(isEdible);
    }
    //Java recently allowed us to declare concrete methods in interfaces using the default keyword
    //I never do this

}
