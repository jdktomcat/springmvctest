package com.vivo.tq.mvc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContext;


/**
 * swagger2 配置类
 *
 * @author 汤旗
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket buildDocket(ServletContext servletContext) {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInf())
                .select()
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
                .title("SpringMVC集成Swagger2")
                .description("spring mvc swagger2")
                .build();
    }
}
