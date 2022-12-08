package com.revature;
import com.revature.models.CrunchBar;

public class Launcher {
    public static void main(String[] args)
    {
        CrunchBar crunch = new CrunchBar();
        System.out.println("You find a CrunchBar! Wow!");
        System.out.println("You contemplate throwing it away after 50 days...");
        crunch.throwAway(50);
        System.out.println("You then think... What if I throw it out in 500 days?");
        crunch.throwAway(500);
        crunch.getEaten();
        crunch.getOpened();
        crunch.getOpened();
        crunch.getEaten();
        crunch.melt();
        System.out.println("Is the CrunchBar edible? "+CrunchBar.isEdible);
        System.out.println("Is the CrunchBar sweet?" + crunch.isSweet);
        System.out.println("How many squares did it have? "+ crunch.brickCount);
    }
}
