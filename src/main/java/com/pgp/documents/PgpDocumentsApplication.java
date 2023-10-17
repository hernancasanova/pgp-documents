package com.pgp.documents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PgpDocumentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PgpDocumentsApplication.class, args);
	}

}
