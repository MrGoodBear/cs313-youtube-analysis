package com.cs313.cameron.model.youtube;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopLevelComment {

    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("etag")
    @Expose
    public String etag;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("snippet")
    @Expose
    public Snippet_ snippet;

}