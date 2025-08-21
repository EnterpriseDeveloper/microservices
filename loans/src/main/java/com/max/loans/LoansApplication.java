package com.max.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.max.loans.dto.LoansContactInfoDto;

@SpringBootApplication
/*
 * @ComponentScans({ @ComponentScan("com.eazybytes.loans.controller") })
 * 
 * @EnableJpaRepositories("com.eazybytes.loans.repository")
 * 
 * @EntityScan("com.eazybytes.loans.model")
 */
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = { LoansContactInfoDto.class })
@OpenAPIDefinition(info = @Info(title = "Accounts microservice REST API Documentation", description = "EazyBank Accounts microservice REST API Documentation", version = "v1", contact = @Contact(name = "Voroshylov Max", email = "voroshilovmax90@gmail.com", url = "https://github.com/EnterpriseDeveloper"), license = @License(name = "Apache 2.0", url = "https://github.com/EnterpriseDeveloper")), externalDocs = @ExternalDocumentation(description = "EazyBank Accounts microservice REST API Documentation", url = "https://github.com/EnterpriseDeveloper"))
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
