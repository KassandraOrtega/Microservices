package com.kassandraortega.rest.webservices.restfulwebservices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Documentation;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

// Configuration
// Enable Swagger

@Configuration
public class SwaggerConfig {
	// Bean - Docket
		// Swagger 2
		// All the paths
		// All the apis
	
	public static final Contact DEFAULT_CONTACT = new Contact(
			"Kassie Ortega", "https://www.linkedin.com/in/kassandra-ortega-170b0a131/", "k.o.kassie@gmail.com");
	
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
			"Awesome API Title", "Awesome API Description", "1.0",
			"urn:tos", DEFAULT_CONTACT,
			"Apace 2.0", "http://www.apache.org/licneses/LICENSE-2.0", Arrays.asList());
			
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
			new HashSet<String>(Arrays.asList("application/json",
					"application/xml"));
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}
}
