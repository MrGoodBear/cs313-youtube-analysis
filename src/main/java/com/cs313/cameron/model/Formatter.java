package com.cs313.cameron.model;

import com.jamesmurty.utils.XMLBuilder2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Properties;

/** Responsible for formatting URL queries for API calls, and converting XML to JSON. */
public class Formatter {

    private int uclassify_FileCount;
    private String api_key;

    public Formatter() {
        this.uclassify_FileCount = 1;
        this.api_key = "tGv51rglTt5D";
    }


    public void convertXMLtoJSON() {
  };

  public File uclassify_Formatter(String textContent) throws FileNotFoundException {
      int textCount = 1;
      int classifyCount = 1;
      String api_key = "tGv51rglTt5D";
      String fileName = "/uClassify_file" + uclassify_FileCount + "xml";

      XMLBuilder2 builder = XMLBuilder2.create("uclassify")
              .attribute("version", "1.01")
              .attribute("xmlns", "http://api.uclassify.com/1/RequestSchema")
              .element("texts")
              .element("text").attribute("id", "text_" + textCount).text(textContent)
              // add new texts to batch right here
              .up()
              .up()
              .element("readCalls").attribute("readApiKey", api_key)
              .element("classify").attribute("id", "call_" + classifyCount).attribute("username", "uClassify")
              .attribute("classifierName", "Sentiment").attribute("textID", "text_" + textCount)
              .up()
              .up();

      Properties outputProperties = new Properties();
      // Explicitly identify the output as an XML document
      outputProperties.put(javax.xml.transform.OutputKeys.METHOD, "xml");
      // Pretty-print the XML output (doesn't work in all cases)
      outputProperties.put(javax.xml.transform.OutputKeys.INDENT, "yes");
      File file = new File(fileName);
      PrintWriter writer = new PrintWriter(new FileOutputStream("projects.xml"));
      builder.toWriter(writer, outputProperties);

      return file;
  };

  void textgain_Formatter() {};

  void monkeylearn_Formatter() {};
};
