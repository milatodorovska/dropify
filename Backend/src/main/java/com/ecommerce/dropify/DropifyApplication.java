package com.ecommerce.dropify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ecommerce.dropify")
@EnableJpaRepositories("com.ecommerce.dropify.repository")
@EntityScan("com.ecommerce.dropify.model")
public class DropifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DropifyApplication.class, args);
	}

}
