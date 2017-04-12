
package com.cs313.cameron.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Sentiment implements Serializable
{
    @SerializedName("textCoverage")
     Float textCoverage;

    @SerializedName("classification")
     List<Classification> classification;

    /**
     * No args constructor for use in serialization
     *
     */
    public Sentiment() {
    }


    public Sentiment(Float textCoverage, List<Classification> classification) {
        super();
        this.textCoverage = textCoverage;
        this.classification = classification;
    }

    public Float getTextCoverage() {
        return textCoverage;
    }

    public void setTextCoverage(Float textCoverage) {
        this.textCoverage = textCoverage;
    }

    public Sentiment withTextCoverage(Float textCoverage) {
        this.textCoverage = textCoverage;
        return this;
    }

    public List<Classification> getClassification() {
        return classification;
    }

    public void setClassification(List<Classification> classification) {
        this.classification = classification;
    }

    public Sentiment withClassification(List<Classification> classification) {
        this.classification = classification;
        return this;
    }
}

