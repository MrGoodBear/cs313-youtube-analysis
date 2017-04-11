package com.cs313.cameron.model;

/**
 * POJO for receiving comments and saving them as objects, as well as storing
 * the setiment calculation for each comment.
 */
public class Comment {
    int sentimentCalculation;

    public Comment(int sentimentCalculation) {
        this.sentimentCalculation = sentimentCalculation;
    }

    public int getSentimentCalculation() {
        return sentimentCalculation;
    }

    public void setSentimentCalculation(int sentimentCalculation) {
        this.sentimentCalculation = sentimentCalculation;
    }
}
