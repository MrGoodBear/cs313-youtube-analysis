package com.cs313.cameron.model;

import com.cs313.cameron.model.youtube_sample.RetrievedComments;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/** Responsible for formatting URL queries for API calls, and converting XML to JSON. */
public class Formatter {

    private String google_credential;
    private String google_key;
    private String uclassify_key;
    private String video_id;
    public Formatter() {
        this.uclassify_key = System.getenv("UCLASSIFY_KEY");
        this.google_credential = System.getenv("GOOGLE_CREDENTIAL");
        this.google_key = System.getenv("GOOGLE_KEY");
        this.video_id = "ZTUVgYoeN_b";
    }

  public void uclassify_Formatter() throws IOException, UnirestException {
      Gson gson = new Gson();

        // sentiment results will be stored into this
      ArrayList<Sentiment> sentimentArrayList = new ArrayList<>();

      Comment content = new Comment();
      String content_json = gson.toJson(content);

      HttpResponse<JsonNode> jsonResponse = Unirest.post("https://api.uclassify.com/v1/{username}/{classifierName}/classify")
              .routeParam("username", "uClassify")
              .routeParam("classifierName", "Sentiment")
              .header("Content-Type", "application/json")
              .header("Authorization", "Token " + uclassify_key)
              .body(content_json)
              .asJson();
      InputStream rawJSON = jsonResponse.getRawBody();
      System.out.println(rawJSON);
      Reader reader = new InputStreamReader(rawJSON, "UTF-8");
      sentimentArrayList = gson.fromJson(reader, new TypeToken<List<Sentiment>>(){}.getType());


  }

  public void youtube_Formatter() throws UnirestException, IOException {

      Unirest.setObjectMapper(new ObjectMapper() {
          private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                  = new com.fasterxml.jackson.databind.ObjectMapper();

          public <T> T readValue(String value, Class<T> valueType) {
              try {
                  return jacksonObjectMapper.readValue(value, valueType);
              } catch (IOException e) {
                  throw new RuntimeException(e);
              }
          }

          public String writeValue(Object value) {
              try {
                  return jacksonObjectMapper.writeValueAsString(value);
              } catch (JsonProcessingException e) {
                  throw new RuntimeException(e);
              }
          }
      });

      HttpResponse<RetrievedComments> jsonResponse = Unirest.get("https://www.googleapis" +
              ".com/youtube/v3/commentThreads?part=snippet&key=AIzaSyCP4coHWLH45HO57P0byRDeIlqPcECZ31w&videoId=tLTm_POao1c")
              .asObject(RetrievedComments.class);

      RetrievedComments comments = jsonResponse.getBody();


    int hi = 0;
  }

  void textgain_Formatter() {

  };

  void monkeylearn_Formatter() {};
};
