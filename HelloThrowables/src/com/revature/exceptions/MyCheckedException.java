package com.revature.exceptions;

/*
* This is a checked exception, (aka compile time exception), because we extend Exception
* so now this class has all the basic functionalities of any other Exception (can crash code, etc)
* If we wanted an unchecked exception, we would extend RuntimeException
* */
public class MyCheckedException extends Exception{
    //constructor
    //constructor chaining - the constructor from exception calls the one in Throwable
    //The whole point of this constructor is to return a String Exception message (aka stack trace)
    public MyCheckedException()
    {
        super();
    }
    public MyCheckedException(String message)
    {
        super(message);
    }
}
