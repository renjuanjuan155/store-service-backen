package com.sskjdata.wms.apidoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/* * @Description
 * @Date 2021/1/8 15:56
 * @Created by meijunjie*/
@Configuration
@EnableSwagger2  //配置swagger
public class SwaggerConfiguration {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sskjdata.wms.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Juanita","http://www.diqiyuzhou.tk","");
        return new ApiInfoBuilder()
                .title("【后台框架Swagger UI】")
                .description("后台接口")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
