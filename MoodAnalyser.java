package com.bridzlabs.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains("sad")) {
                return "SAD";
            }
        } catch (NullPointerException ex) {

            return "HAPPY";
        }
        return "HAPPY";
    }
}