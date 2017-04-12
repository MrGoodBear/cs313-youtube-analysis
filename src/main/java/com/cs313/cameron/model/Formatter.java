package com.cs313.cameron.model;

import com.cs313.cameron.model.youtube_sample.Example;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
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
        this.video_id = "wtLJPvx7-ys";
    }

  public void uclassify_Formatter() throws IOException, UnirestException {
      Gson gson = new Gson();
//todo: send comments in here
        // sentiment results will be stored into this
      ArrayList<Sentiment> sentimentArrayList = new ArrayList<>();

      Comment content = new Comment(); //todo: this may need to be changed to uClassify type
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

    ArrayList<Comment> commentList = new ArrayList<>();


      URL url = new URL("https://www.googleapis.com/youtube/v3/commentThreads?part=snippet&key=AIzaSyCP4coHWLH45HO57P0byRDeIlqPcECZ31w&videoId=tLTm_POao1c");
      URLConnection conn = url.openConnection();
      InputStream rawJSON = conn.getInputStream();

      Gson gson = new Gson();
      Reader reader = new InputStreamReader(rawJSON, "UTF-8");
      ArrayList<Example> hopeitworks = new ArrayList<>();
     // hopeitworks = gson.fromJson(reader, new TypeToken<List<Example>>(){}.getType());
      System.out.println("hello");
      System.out.println(rawJSON);
    int omg = 0;

// Do what you want with that stream

     /* HttpResponse<JsonNode> response = Unirest.get("https://www.googleapis" +
              ".com/youtube/v3/commentThreads?part=snippet&key=AIzaSyCP4coHWLH45HO57P0byRDeIlqPcECZ31w&videoId=tLTm_POao1c")
      .asJson();
      InputStream rawJSON = response.getRawBody();
      int omg2 = 0;
      //Body body = response.getBody();
//      String filbert = body.toString();

        //JsonNode bear = response.getBody();

      // Call the YouTube Data API's commentThreads.list method to
      // retrieve video comment threads.
      /*CommentThreadListResponse videoCommentsListResponse = youtube.commentThreads()
              .list("snippet").setVideoId("wtLJPvx7-ys").setTextFormat("plainText").execute();
      List<CommentThread> videoComments = videoCommentsListResponse.getItems();*/

      /*CommentThreadListResponse videoCommentsListResponse = youtube.commentThreads()
              .list("snippet").setVideoId(video_id).setTextFormat("plainText").execute();
      List<CommentThread> videoComments = videoCommentsListResponse.getItems();
*/
      int hey = 0;
  }

  void textgain_Formatter() {

  };

  void monkeylearn_Formatter() {};
};
