// UC3.2-NULL and Empty Mood throw Custom Exception MoodAnalysisException
package com.bridgelabz;

public class MoodAnalysesException extends Exception
{
    /*
       MoodAnalysesException extends Parent Exception Class which is a predefined class we can custom
       any exception like this.
       An enum is a special "class" that represents a group of constants
        */
    enum ExceptionType
    {
        ENTERED_NULL, ENTERED_EMPTY;
    }
    // Variable to define type
    ExceptionType type;
    public MoodAnalysesException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
