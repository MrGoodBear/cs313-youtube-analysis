package com.cs313.cameron.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * POJO for receiving comments and saving them as objects, as well as storing
 * the setiment calculation for each comment.
 */
public class Comment {
    transient int sentimentCalculation;

    String comment;





    public Comment() {
        //todo: youtube comments need to be deposited here
        ArrayList<String> comments = new ArrayList<>(Arrays.asList("hey there baby girl", "hey there big boy", "i like" +
                " turtles"));
    }

    public int getSentimentCalculation() {
        return sentimentCalculation;
    }

    public void setSentimentCalculation(int sentimentCalculation) {
        this.sentimentCalculation = sentimentCalculation;
    }
}
