package com.cs313.cameron.model;

import com.google.gson.Gson;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 * Created by cameronlewis on 4/11/17.
 */
public class HTTP_Headers {
    HttpHeaders uClassify;

    public HTTP_Headers() {
        this.uClassify = new HttpHeaders();
        uClassify.add("header_name", "header_value");
        uClassify.setContentType(MediaType.APPLICATION_XML);
    }

    public void uClassify_POST(){
        String json = "{'intValue':1,'stringValue':'one'}";
        Sentiment sentiment_container = new Gson().fromJson(json, Sentiment.class);


    }

}
