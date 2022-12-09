package com.revature;
import com.revature.models.Pokemon;
import java.util.ArrayList;
import java.util.HashSet;

/*
Collections are similar to arrays, but have a lot more options.
These are a collection of different data structures. They have the ability to store more data efficiently and each one has different behaviours
Collections can only store objects. You can store primitives by using a wrapper class.
 */
public class Driver {
    public static void main(String[] args)
    {
        System.out.println("==================Lists");
        //ArrayLists are very common implementations of the List Interface
        //QC asked me the difference between arrays and arraylists

        //An arraylist of Pokemon Objects
        ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();
        //add a bunch of pokemon to my ArrayList using the .add() method
        pokemonList.add(new Pokemon("Goomy", "Dragon"));
        pokemonList.add(new Pokemon("Dratini", "Dragon"));
        pokemonList.add(new Pokemon("Gengar", "Ghost/Poison"));
        pokemonList.add(new Pokemon("Treeko", "Grass"));
        pokemonList.add(new Pokemon("Zapdos", "Electric/Flying"));

        System.out.println(pokemonList);

        pokemonList.add(3,new Pokemon("Torchic","Fire"));

        System.out.println("I have " + pokemonList.size() + " Pokemon!");
        //we can use .forEach to do something for each item in the list.
        pokemonList.forEach(pokemon -> pokemon.fight());
        /*
        What the heck
        forEach object (which we'll call pokemon in the ArrayList, call for the fight() method
        What is the arrow? This is called a lambda
        Basically you provide a value on the left and use that value in some expression. Like a shortcut method
        In this case, we're providing a pokemon from the list and having them fight.
         */
        System.out.println("------------------Sets");

        /* A collection of unordered, well defined objects. No duplicate values
        This means only 1 null value as well
         */
        //Instantiate an empty HashSet, which imo is the most general use set
        HashSet<Pokemon> pokemonSet = new HashSet<>();
        pokemonSet.add(new Pokemon("Goomy", "Dragon"));
        pokemonSet.add(new Pokemon("Dratini", "Dragon"));
        pokemonSet.add(new Pokemon("Gengar", "Ghost/Poison"));
        pokemonSet.add(new Pokemon("Treeko", "Grass"));
        pokemonSet.add(new Pokemon("Zapdos", "Electric/Flying"));

        //while Java will let you Try to include duplicates, they won't be included
        //It's unordered, but it's not random.g
        System.out.println(pokemonSet);

        for(Pokemon p : pokemonSet)
            System.out.println(p);
        //thanks to the hashCode and equals boilerplate code, we can compare our pokemon
        System.out.println(new Pokemon("Goomy","Dragon").equals(pokemonList.get(0)));
    }
}
