package com.cs313.cameron.model.youtube_sample;

import com.google.api.services.youtube.model.PageInfo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RetrievedComments {

    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("etag")
    @Expose
    public String etag;
    @SerializedName("pageInfo")
    @Expose
    public PageInfo pageInfo;
    @SerializedName("items")
    @Expose
    public List<Item> items = null;

}