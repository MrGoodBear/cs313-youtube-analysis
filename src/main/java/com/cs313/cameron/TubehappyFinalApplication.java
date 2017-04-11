package com.cs313.cameron;

import com.cs313.cameron.model.Formatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;

/**
 * Where the main application is directed and run.
 */
@SpringBootApplication
public class TubeHappyFinalApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(TubeHappyFinalApplication.class, args);
        Formatter formatter = new Formatter();
        formatter.uclassify_Formatter();
	}
}
