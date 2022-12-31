package com.ensa.mscustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableSwagger2
public class MsCustomersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCustomersApplication.class, args);
		
	}
	/*
	 * @Bean public Docket productApi() { return new
	 * Docket(DocumentationType.SWAGGER_2).select()
	 * .apis(RequestHandlerSelectors.basePackage("com.ensa.mscustomer")).build(); }
	 */

}
