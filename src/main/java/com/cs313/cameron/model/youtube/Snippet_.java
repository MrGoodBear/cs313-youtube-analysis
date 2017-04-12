package com.cs313.cameron.model.youtube;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Snippet_ {

    @SerializedName("authorDisplayName")
    @Expose
    public String authorDisplayName;
    @SerializedName("authorProfileImageUrl")
    @Expose
    public String authorProfileImageUrl;
    @SerializedName("authorChannelUrl")
    @Expose
    public String authorChannelUrl;
    @SerializedName("authorChannelId")
    @Expose
    public AuthorChannelId authorChannelId;
    @SerializedName("videoId")
    @Expose
    public String videoId;
    @SerializedName("textDisplay")
    @Expose
    public String textDisplay;
    @SerializedName("textOriginal")
    @Expose
    public String textOriginal;
    @SerializedName("canRate")
    @Expose
    public Boolean canRate;
    @SerializedName("viewerRating")
    @Expose
    public String viewerRating;
    @SerializedName("likeCount")
    @Expose
    public Integer likeCount;
    @SerializedName("publishedAt")
    @Expose
    public String publishedAt;
    @SerializedName("updatedAt")
    @Expose
    public String updatedAt;

}