package com.cs313.cameron.model.youtube_sample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Snippet {

    @SerializedName("videoId")
    @Expose
    public String videoId;
    @SerializedName("topLevelComment")
    @Expose
    public TopLevelComment topLevelComment;
    @SerializedName("canReply")
    @Expose
    public Boolean canReply;
    @SerializedName("totalReplyCount")
    @Expose
    public Integer totalReplyCount;
    @SerializedName("isPublic")
    @Expose
    public Boolean isPublic;

}