package com.revature.models;

import java.util.Objects;

public class Pokemon {
    //variables for the pokemon class
    private String name;
    private String type;

    //one method just for spice

    public void fight()
    {
        System.out.println(name + " is attacking!");
    }

    //Boilerplater code

    //constructors, getters and setters, toString, hashCode & equals

    public Pokemon(String name) {
        this.name = name;
    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /*
    combined with private vars, it's how we achieve encapsulation.
    in a secure application, your class's variables will typically be private
    with encapsulation, you cannot access or change values directly, but must go through the setter or getter method
     */
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(name, pokemon.name) && Objects.equals(type, pokemon.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
