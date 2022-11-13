// UC3.1-NULL Mood throw Custom Exception MoodAnalysisException
package com.bridgelabz;

public class MoodAnalysesException extends Exception
{
//    MoodAnalysesException extends Parent Exception Class which is a predefined class we can custom any exception like this.
    public MoodAnalysesException(String message) {
        super(message);
    }
}
