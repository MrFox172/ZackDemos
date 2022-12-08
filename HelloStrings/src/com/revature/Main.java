package com.revature;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("===============String Immutability");

        //Strings are objects, but they don't necessarily need the new keyword
        String s = "I am immutable (AKA unchangeable)";
        //The String class has no methods that can directly change a string.
        s.toUpperCase();


        //you can also create strings this way
        String s5 = new String("Yadda yadda");
        System.out.println("===============String Equality");

        int i = 5;
        System.out.println(5==i); //primitives compare against values

        //for Strings however (and any objects), we need to use the .equals() method
        String s1 = "Hi Java";
        String s2 = "Hi Java";
        //since we used the new keyword, this will be a brand new object in memory
        String s3 = new String("Hi Java");
        System.out.println(s1 == s2); //compares memory address when comparing objects.
        System.out.println(s2==s3); //despite being the same content, this fails because s1/s2 is a different object than s3
        String s4 = "hi java"; //this makes a new object in memory, there is no string that equals "hi java" before this.

        System.out.println(s1.equals(s2)); //this compares the actual values instead of the references
        System.out.println(s1.equals(s3)); //this compares the actual values instead of the references

        System.out.println("==================String methods");

        //a pangram to use some String methods on
        String pangram = "Sphinx of Black Quartz, Judge my vow";
        //.length() is a method that returns an int representing how many characters there are in the string, including spaces.
        System.out.println("Pangram's length" + pangram.length());
        //.charAt(int) is a method that returns the char at the given index
        System.out.println("Pangram's first character: "+ pangram.charAt(0)); //this returns the first index
        System.out.println("Pangram's last character: "+ pangram.charAt(pangram.length()-1)); //this returns the last index
        //.subString() is a method that returns a subsection of a string as a new string
        System.out.println("Pangram subsectin: "+pangram.substring(10,30)); //substring from indexes n, n+t;
        //.split() is a method that will create an array of strings via certain delimiters
        String[] words = pangram.split(" ");
        for (int index = 0; index < words.length; index++)
            System.out.println(words[index]);

        //enhanced for loop example
        for (String word: words)
            System.out.println(word);

        System.out.println("========================Scanner");

        //instantiate a new Scanner Object so that we can take in user input
        Scanner kb = new Scanner(System.in);

        System.out.print("What's your name? "); //ask the user a question
        String name = kb.nextLine();//gathers user input and creates a new line

        System.out.printf("%s? That's a lovely name\n",name);

        System.out.print("How old are you? ");
        int age = kb.nextInt();
        kb.nextLine();
        System.out.printf("%d? You don't look a day over 80!\n", age);

        System.out.print("What is the best starter pokemon? ");
        String poke = kb.nextLine();

        //switch case which lets us test the value against multiple different choices via pattern matching.
        //if the value matches a pattern, the code associated with it will execute.
        switch(poke.toLowerCase())
        {
            case "charmander": System.out.println("You are dumb and eat crayons"); break;
            case "mudkip": ;
            case "treeko": System.out.println("Acceptable");break;
            default: System.out.println("Is that even a pokemon? It's probably trash, even if it is.");
        }
    }
}