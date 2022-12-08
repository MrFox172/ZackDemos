package com.revature;

public class Driver {
    public static void main(String[] args)
    {
        int randomNumber = (int) (Math.random()*100);
        //using the Math class to get a random number;
        System.out.println("Here's the generated number: "+randomNumber);
        System.out.println("==========if, else if, else");

        if(randomNumber > 75)
            System.out.println("Random number is pretty big!");
        else if (randomNumber > 50)
            System.out.println("It's a little bigger than average");
        else if (randomNumber >25)
            System.out.println("It's not the smallest, but not above average");
        else
            System.out.println("That's pretty small!");

        System.out.println("=================while loops");

        while(randomNumber < 200)
        {
            randomNumber+=10;
            System.out.println("Buffing your number, now it's "+randomNumber);
        }

        System.out.println("While loop has broken! Enjoy your buffed number!");

        System.out.println("---------------do while loop");
        do {
            randomNumber-=20;
            System.out.println("Your number is now being debuffed. Sorry: "+randomNumber);
        }while(randomNumber>100);

        System.out.println("Do while loop has broken! ");

        System.out.println("======================== for loops");

        int loopVictim = 0; //we'll use this int in the for loop
        //basic for loop
        for(int i = 0; i < 10; i++) {
            loopVictim++;
            System.out.println("Our loopVictim is "+loopVictim);
            System.out.println("Our loop variable is now "+ i);
        }

        //more interesting use of for loops -----
        char[] myName = {'Z','a','c','k','a','a','a'};

        //I'm going to use a for loop to iterate through this Array to only print out B E N
        boolean firstA = true;
        for(int i = 0; i<myName.length;i++)
        {
            if(firstA&&myName[i]=='a') {
                firstA = false;
                System.out.println(myName[i]);
            }
            else if(myName[i]!='a')
                System.out.println(myName[i]);
            else
                continue;
        }
        //Static scope: static variables declared in a class. The variable and its value is shared between all objects of that class.

        //instance scope variables: 
    }
}
