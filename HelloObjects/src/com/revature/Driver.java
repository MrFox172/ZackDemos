package com.revature;
import com.revature.models.*;

public class Driver {
    public static void main(String[] args)
    {
        System.out.println("-------------------Using Constructors");
        /*
        recall that we need constructors to initialize object variables
        we'll be using the no args constructor and the all args constructor to make some dogs
         */

        //Instantiating Dog Object
        Dog dog1 = new Dog();
        //Reference type variable as it points towards the dog

        System.out.println(dog1.bark());

        //Instantiate a Dog object with the all args const.
        Dog dog2 = new Dog("Diena", 15, 17);
        System.out.println(dog2.bark());

        System.out.println(dog1.name + " is " + dog1.age + " years old and " + dog1.weight + " pounds.");
        System.out.println(dog2.name + " is " + dog2.age + " years old and " + dog2.weight + " pounds.");

        Pitbull pit1 = new Pitbull();
        Pitbull pit2 = new Pitbull("John Cena", 3, 60, true);
        System.out.println("You approach "+pit1.name + " he appears to be " + pit1.age + " years old and " +pit1.weight + " pounds.");
        System.out.println("You approach "+pit2.name + " he appears to be " + pit2.age + " years old and " +pit2.weight + " pounds.");
        System.out.println(pit2.bark());
        pit2.bite("mailman");
        pit2.bite("another pitbull");
        pit2.bite("world renowned club banger creator Pitbull");
        pit2.bite(pit1.name);
        pit2.bark();
    }
}
