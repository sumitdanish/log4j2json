package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private static final Logger logger = LogManager.getLogger(DemoApplication.class);
	public static void main(String[] args) {
        JSONObject j = new JSONObject();
        j.put("hi","json");
		logger.info(j.toJSONString());
		SpringApplication.run(DemoApplication.class, args);

	}
}
