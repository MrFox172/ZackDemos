package com.revature.models;

public class CrunchBar extends Candy{
    public int riceCount = 100;
    public int brickCount = 15;
    private boolean isOpen = false;
    public CrunchBar()
    {
        super();
        crunchFactor = 5;
    }
    public CrunchBar(int riceCount, int brickCount)
    {
        super();
        this.riceCount = riceCount;
        this.brickCount = brickCount;
        crunchFactor = riceCount/20;
    }

    @Override
    public void getEaten() {
        if(isOpen) {
            System.out.println("You begin to eat the CrunchBar. It's crunch factor appears to be " + crunchFactor+".");
        }
        else
            System.out.println("You begin to chew on the unopened CrunchBar. It tastes like wrapper. Maybe open it?");
    }

    //this get opened is from the abstract class. Every candy can get opened, but not all in the same way.
    @Override
    public void getOpened() {
        if(!isOpen)
        {
            System.out.println("You open the CrunchBar by unwrapping it, it's ready to eat!");
            isOpen = true;
        }
        else
            System.out.println("You try to further open the CrunchBar. However it's already unwrapped.");
    }

    @Override
    public void throwAway(int days) {
        if(days < 450)
            System.out.println("You intend to throw away the bar in "+days+ " days, if you haven't eaten it yet, it should still be good!");
        else
            System.out.println("It's past it's best by date of 450 days, don't complain if you get sick!");
    }
}
