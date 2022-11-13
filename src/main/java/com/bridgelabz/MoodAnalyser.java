// UC3-NULL or Empty Mood throw Custom Exception MoodAnalysisException

package com.bridgelabz;
public class MoodAnalyser
{
    private String message;
    public MoodAnalyser(String Message)
    {
        this.message = Message;
    }
    public String analyseMood(String message) throws MoodAnalysesException
    {
        /*
        if there is nothing or null in message it should give happy but it throws nullPointer Exception
         So we use try and catch for exception handling.
         */
        try
        {
            if (message.contains(null))
                return "Sad";
            else
                return "Happy";
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalysesException("Please enter proper message");
        }
    }
}