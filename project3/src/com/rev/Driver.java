package com.rev;
import com.rev.models.*;

public class Driver {
    public static void main(String[] args)
    {
        Animal[] store = {new Cat(), new Dog(), new Snake()};
        for (int i = 0; i<store.length; i++)
        {
            System.out.println("Animal number: "+(i+1));
            store[i].makeNoise();
            store[i].walk();
            store[i].appearance();
            System.out.println("-----------------------");
        }
    }
}
