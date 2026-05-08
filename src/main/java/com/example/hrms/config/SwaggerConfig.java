package com.example.hrms.config;
 
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class SwaggerConfig {
 
    @Bean
    public OpenAPI hrmsOpenAPI() {
 
        return new OpenAPI()
 
                .info(new Info()
 
                        .title("HRMS Backend API")
 
                        .description(
                                "Human Resource Management System APIs")
 
                        .version("1.0")
 
                        .contact(new Contact()
                                .name("Swathi")
                                .email("swathi@gmail.com"))
 
                        .license(new License()
                                .name("Open Source License")))
 
                .externalDocs(
                        new ExternalDocumentation()
                                .description("Project Documentation")
                );
    }
}
 