package com.revature;

public class Main {
    public static void main(String[] args) {
        //int is the most common integer-type primitive (others are byte, short, long)
        int i = 50000;

        //if you ever need a really big number, you can use the long type
        long l = 5000000000000000000L;

        //we can use + to concatenate strings together.
        System.out.println("The value of my int is: "+i);
        System.out.println("The value of my long is: "+l);

        //chars are written with 'single quotes', unless they're numbers
        //they represent a single character from the unicode table.
        char c = 'z';

        char c2 = 15000;
        System.out.println("The value of my char is: "+c2);

        //doubles are the most common floating point number (they have decimals)
        double d = 2.5678;

        //what happens when we add an int and a double?
        System.out.println(i+d);

        //the last primitive we'll look at is booleans
        //this is the only way to denote true or false in java
        boolean bool = true;
        boolean bool2 = false;

        System.out.println(bool);
        System.out.println(bool2);

        if(bool)
        {
            System.out.println("My boolean is true");
            //this code runs beacuse bool equals true
        }

        if (bool2)
        {
            System.out.println("This won't run :(");
            //this code runs only if bool2
        }
        else
        {
            System.out.println("My boolean is false");
        }

        System.out.println("===============(Arithmetic Operators)");
        //the modulus (%) returns the remainder of a division
        int testNumber = 10;
        String st = (testNumber % 2 == 0) ? "The number is even" : "The number is odd";
        if(testNumber % 2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
        System.out.println("=====================(Increment/Decrement)");
        //very useful in loops. ++ increases, -- decreases

        int funnyNumber = 24;
        System.out.println("FunnyNumber is equal to "+funnyNumber);
        funnyNumber++;
        System.out.println("What's funnier than 24: "+funnyNumber);
        System.out.println("Magic? The number incremented as I was speaking: "+ ++funnyNumber);
        funnyNumber--;
        System.out.println("Funny number returns to: "+funnyNumber);

        int k = 5;
        System.out.println(k++);
        System.out.println(--k);
    }
}