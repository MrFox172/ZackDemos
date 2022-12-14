package com.revature;
import com.revature.exceptions.MyCheckedException;
public class Driver {
    public static void main(String[] args)
    {
        System.out.println("--------------------------Throwing Runtime Exceptions!");
        //We'll never purposefully throw exceptions we're doing it for science
        System.out.println("Trying to divide by 0");
        //System.out.println(5/0); //Java let us compile but throws an exception at runtime. throws ArithmeticException
        System.out.println("Trying to access an Array index that doesn't exist");
       /* int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        for (int i = 0; i<=numbers.length;i++)
            System.out.println(numbers[i]); //throws ArrayIndexOutOfBoundException
        */System.out.println("==========================Exception Handling");

        try{
            System.out.println("Try Block Starting");
            int j = 5/0;
            System.out.println("Will I run? No! Because I'm after the world ends by division");
        }
        catch(ArithmeticException e)
        {
            System.out.println("You blew a small hole in the universe.");
        }
        catch(NullPointerException e)
        {

        }
        catch(Exception e)
        {
            System.out.println("Unknown exception");
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Hello from the finally block - I will always run");
        }
        /*
        Rule of thumb - specific to generic to help you find where the bugs are.
         */
        System.out.println("=============================Throwing custom exceptions");
        try {
            badTake("Mudkip");
        }
        catch (MyCheckedException e)
        {
            e.printStackTrace();
        }
    }

    public static void badTake(String s) throws MyCheckedException
    {
        switch (s.toLowerCase()) {
            case "charmander": throw new MyCheckedException("Awful pick mate");
            case "mudkip": System.out.println("Excellent choice good sir"); break;
            default: System.out.println("At least you didn't choose Charmander");
        }
    }

}
