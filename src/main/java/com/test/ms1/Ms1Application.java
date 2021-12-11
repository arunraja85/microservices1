package com.test.ms1;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ms1Application {

	public static void main(String[] args) {
		String ip = "192.168.12.42"; // Sensitive
		Logger.getLogger(ip);
		SpringApplication.run(Ms1Application.class, args);
	}

}
