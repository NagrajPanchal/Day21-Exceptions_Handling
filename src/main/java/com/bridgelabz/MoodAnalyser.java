// UC3.2-NULL and Empty Mood throw Custom Exception MoodAnalysisException

package com.bridgelabz;
public class MoodAnalyser
{
    private final String message;
    public MoodAnalyser(String Message)
    {
        this.message = Message;
    }
    public String analyseMood(String message) throws MoodAnalysesException
    {
        /*
        if there is nothing or empty in message it should throw empty, but if it is null it throws
        nullPointer Exception So we use try and catch for exception handling.
         */
        try
        {
            if (message.equals(""))
                throw new MoodAnalysesException(MoodAnalysesException.ExceptionType.ENTERED_EMPTY, "Please enter proper message");
            else if (message.contains(null))
                return "Sad";
            else
                return "Happy";
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalysesException(MoodAnalysesException.ExceptionType.ENTERED_NULL, "Please enter proper message");
        }
    }
}