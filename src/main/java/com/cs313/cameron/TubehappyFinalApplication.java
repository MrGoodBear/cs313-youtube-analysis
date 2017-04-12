package com.cs313.cameron;

import com.cs313.cameron.model.Formatter;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Where the main application is directed and run.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class TubeHappyFinalApplication {

    TubeHappyFinalApplication(){};

    public static void main(String[] args) throws IOException, UnirestException {
        SpringApplication.run(TubeHappyFinalApplication.class, args);
        Formatter formatter = new Formatter();
        List<String> text = Arrays.asList("i like turtles", "baby girl, I like your moves", "hey big boy");

        formatter.uclassify_Formatter();
        //formatter.youtube_Formatter();


        //CommentThreads.main(args);
    }
}
