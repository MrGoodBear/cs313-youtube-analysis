package com.cs313.cameron;

import com.cs313.cameron.model.Formatter;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

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

        //formatter.uclassify_Formatter();
        formatter.youtube_Formatter();
    }
}
