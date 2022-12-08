package com.revature;
import java.util.Scanner;
public class Driver {
    public static int i = 5;

    public static int i2;
    public static Driver driver;
    //Yes, this is a launcher object within the Launcher class. This is legal, and sometimes necessary.
    public double dub = 16.4;
    /*
    Big Picture
    Each instance of the Driver class will have its own value for the dub variable.
    Each instance of the Launcher class will share a value for i and i2
     */
    public static void main(String[] args)
    {
        System.out.println("==========================(Using Class/Instance Scoped Variables)");

        System.out.println(i);
        System.out.println(i2); //prints 0, default value for this primitive.

        System.out.println(driver);
        driver = new Driver();

        //Since launcher was declared Statically, we can use it to access its non-static variables
        //so if we use a launcher object, we are able to view and manipulate the dub variable
        System.out.println(driver.dub);
        System.out.println("==========================(Making a new Launcher object");

        //Brand-new Launcher Object
        Driver driver2 = new Driver();
        System.out.println(driver.i);
        System.out.println(driver2.i);
        driver.i = 50;
        System.out.println(driver.i);
        System.out.println(driver2.i);
        //i is classed scoped, so changing it in launcher also changes it in launcher2

        System.out.println(driver.dub);
        System.out.println(driver2.dub);

        driver2.dub = 57.90;
        System.out.println(driver.dub);
        System.out.println(driver2.dub);
        System.out.println("==========================(Class Versus Static)");

        ScopeTestClass test1 = new ScopeTestClass();
        ScopeTestClass test2 = new ScopeTestClass();
        System.out.println(ScopeTestClass.s);

        test1.s = "Hey";
        System.out.println(ScopeTestClass.s);
        test1.s2 = "Testing static!";
        System.out.println(test1.s2);
        System.out.println(test2.s2);


        System.out.println("==========================(Method/Block scope)");
        scopesMethod();

    }//end of main

    public static void scopesMethod()
    {
        int methodScopedInt = 25; //this variable is method scoped. only visible in the method
        if(true)
        {
            int blockScopedInt = 52; //this variable is block scoped
            System.out.println(methodScopedInt);
            System.out.println(blockScopedInt);
        }
        //System.out.println(blockScopeInt);
        //blockscopedint only exists within the block it was declared in. so we can't access it here
    }


}
