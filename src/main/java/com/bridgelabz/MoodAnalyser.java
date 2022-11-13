// Refactor the code to take the mood message in Constructor

package com.bridgelabz;
public class MoodAnalyser {


    private final String message;

    /*
    taking MoodAnalyser input using MoodAnalyser Constructor
     */
    public MoodAnalyser(String Message) {
        this.message = Message;
    }

    public String analyseMood() {

        if (message.contains("I am in sad mood")) {
            return "Sad";

        } else
            return "Happy";

    }


}