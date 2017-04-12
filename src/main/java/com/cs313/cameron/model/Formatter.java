package com.cs313.cameron.model;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
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

  public void uclassify_Formatter() throws IOException {
      String api_key = "tGv51rglTt5D";
      Gson gson = new Gson();

        // sentiment results will be stored into this
      ArrayList<Sentiment> sentimentArrayList = new ArrayList<>();

      Comment content = new Comment();
      String json = gson.toJson(content);

      RestTemplate restTemplate = new RestTemplate();
      Sentiment sentiment = new Sentiment();
      restTemplate.postForObject("https://api.uclassify.com/v1/", sentiment, Sentiment.class);
      log.info(sentiment.toString());

      URL uclassify_url = new URL("https://api.uclassify.com/v1/uclassify/sentiment/classify");
      HttpURLConnection conn = (HttpURLConnection) uclassify_url.openConnection();
      conn.setDoOutput(true);
      conn.setUseCaches(false);
      conn.setInstanceFollowRedirects(false);
      conn.setRequestMethod("POST");
      conn.setRequestProperty("Content-Type", "application/json");
      conn.setRequestProperty("Authorization", "Token YOUR_READ_API_KEY_HERE");
      DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
      //wr.write(json);
      Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
      for (int c = in.read(); c != -1; c = in.read()) {
          System.out.print((char) c);
      }
  }

  void textgain_Formatter() {};

  void monkeylearn_Formatter() {};
};
