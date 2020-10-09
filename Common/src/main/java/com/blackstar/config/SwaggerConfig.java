package com.blackstar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static String basePackage="com.blackstar.controller";

    @Bean
    public Docket apiDocket() {
        List<Parameter> parameters = new ArrayList<>();
        Parameter parameter = new ParameterBuilder().parameterType("header").
                name("token").required(true).hidden(false).modelRef(new ModelRef("string")).build();
        parameters.add(parameter);
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any()).build().apiInfo(getApiInfo())
                .globalOperationParameters(parameters);
    }

    /**
     *  获取API的信息
     *
     * @return
     */
    private ApiInfo getApiInfo() {
        return new ApiInfo("TITLE", "DESCIPRION", "VERSION", "TERMS OF SERVICE URL", new Contact("NAME", "URL", "EMAIL"), "LICENSE", "LICENSE URL", Collections.emptyList());
    }

}