// UC2 : Handle Exception if User Provides Invalid Mood

package com.bridgelabz;
public class MoodAnalyser
{
    private String message;
    // taking MoodAnalyser input using MoodAnalyser Constructor
    public MoodAnalyser(String Message)
    {
        this.message = Message;
    }
    public String analyseMood()
    {
        /*
        if there is nothing or null in message it should give happy but it shows nullPointer Exception
         So we use try and catch for exception handling. if it is null then it gives happy using catch block
         */
        try {
            if (message.contains(null))
                return "Sad";
            else
                return "Happy";

        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}