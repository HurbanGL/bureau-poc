package com.globallogic.bureau;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.integration.annotation.IntegrationComponentScan;

@SpringBootApplication
@IntegrationComponentScan
@EnableCaching
public class BureauServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BureauServiceApplication.class, args);
	}
}
