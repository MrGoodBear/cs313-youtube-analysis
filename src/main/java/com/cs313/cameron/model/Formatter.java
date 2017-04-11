package com.cs313.cameron.model;

import com.jamesmurty.utils.XMLBuilder2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;

/** Responsible for formatting URL queries for API calls, and converting XML to JSON. */
public class Formatter {


    private int uclassify_FileCount;;
    private String api_key;
    public Formatter() {
        this.uclassify_FileCount = 0;
        this.api_key = "tGv51rglTt5D";
    }


public void convertXMLtoJSON() {
  }

  public File uclassify_Formatter(List<String> textContent, int commentCount) throws FileNotFoundException {
      String api_key = "tGv51rglTt5D";
      String fileName = "uClassify_file" + uclassify_FileCount + ".xml";

          XMLBuilder2 builder = XMLBuilder2.create("uclassify")
                  .attribute("version", "1.01")
                  .attribute("xmlns", "http://api.uclassify.com/1/RequestSchema")
                  .element("texts");
      for (int i = 0; i < commentCount; i++) {
          builder.xpathFind("//texts").element("text").attribute("id", "text_" + i).text(textContent.get(i));
          //maybe a foreach?
          // add new texts to batch right here
      }
      builder.xpathFind("//texts").up().up()
        .element("readCalls").attribute("readApiKey", api_key);

      for (int i = 0; i < commentCount; i++) {
          builder.xpathFind("//readCalls")
                  .element("classify").attribute("id", "call_" + i).attribute("username", "uClassify")
                  .attribute("classifierName", "Sentiment").attribute("textId", "text_" + i);
      }
      builder.xpathFind("//readCalls").up().up();

      // create new file to store calls
      File file = new File(fileName);
      Properties outputProperties = new Properties();

      // Explicitly identify the output as an XML document
      outputProperties.put(javax.xml.transform.OutputKeys.METHOD, "xml");
      // Pretty-print the XML output (doesn't work in all cases)
      outputProperties.put(javax.xml.transform.OutputKeys.INDENT, "yes");

      PrintWriter writer = new PrintWriter(new FileOutputStream(fileName));
      builder.toWriter(writer, outputProperties);

      uclassify_FileCount++;
      return file;
  };

  void textgain_Formatter() {};

  void monkeylearn_Formatter() {};
};
