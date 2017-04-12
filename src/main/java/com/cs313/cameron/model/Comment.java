package com.cs313.cameron.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * POJO for receiving comments and saving them as objects, as well as storing
 * the setiment calculation for each comment.
 */
public class Comment {
    transient int sentimentCalculation;

    transient ArrayList<String> comments;
    @SerializedName("texts")
    @Expose
    ArrayList<String> uclassify_texts;

    public Comment() {
        ArrayList<String> comments = new ArrayList<>(Arrays.asList("hey there baby girl", "hey there big boy", "i like" +
                " turtles"));
        uclassify_texts = comments;
    }

    public int getSentimentCalculation() {
        return sentimentCalculation;
    }

    public void setSentimentCalculation(int sentimentCalculation) {
        this.sentimentCalculation = sentimentCalculation;
    }
}
