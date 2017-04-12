package com.cs313.cameron.model;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

/** Responsible for formatting URL queries for API calls, and converting XML to JSON. */
public class Formatter {

    private static final Logger log = LoggerFactory.getLogger(Formatter.class);
    private int uclassify_FileCount;;
    private String api_key;
    public Formatter() {
        this.uclassify_FileCount = 0;
        this.api_key = "tGv51rglTt5D";
    }


public void convertXMLtoJSON() {
  }

  public void uclassify_Formatter() throws IOException, UnirestException {
      String api_key = "tGv51rglTt5D";
      Gson gson = new Gson();

        // sentiment results will be stored into this
      ArrayList<Sentiment> sentimentArrayList = new ArrayList<>();

      Comment content = new Comment();
      String json = gson.toJson(content);

      HttpResponse<JsonNode> jsonResponse = Unirest.post("https://api.uclassify.com/v1/{username}/{classifierName}/classify")
              .routeParam("username", "uClassify")
              .routeParam("classifierName", "Sentiment")
              .header("Content-Type", "application/json")
              .header("Authorization", "Token " + api_key)
              .body(json)
              .asJson();
  }

  void textgain_Formatter() {};

  void monkeylearn_Formatter() {};
};
