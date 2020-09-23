package com.assessment.infnet.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Assessment - 2020.3")
                .description("Jonathan Tolentino Abila")
                .version("0.0.1")
                .contact(new Contact("Jonathan Tolentino Abila", "infnet.edu.br", "jonathan.tolentino@al.infnet.edu.br"))
                .build();
    }

    @SuppressWarnings("serial")
    private List<ResponseMessage> responseMessages() {
        return new ArrayList<ResponseMessage>() {{
            add(new ResponseMessageBuilder()
            .code(403)
            .message("Forbidden")
            .build());
        }};
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.assessment.infnet.api"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .globalResponseMessage(RequestMethod.GET, responseMessages());
    }
}
