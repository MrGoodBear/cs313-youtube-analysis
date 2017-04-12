package com.cs313.cameron.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by cameronlewis on 4/12/17.
 */
public class uClassify {

    @SerializedName("texts")
    @Expose
    ArrayList<String> uclassify_texts;
}
