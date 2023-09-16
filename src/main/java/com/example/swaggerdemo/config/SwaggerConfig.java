package com.example.swaggerdemo.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author : KaelvihN
 * @date : 2023/9/16 1:03
 */

@Configuration
@EnableSwagger2     //开启Swagger2
public class SwaggerConfig {

    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("A");
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("B");
    }
    /**
     * 配置 Swagger 的 Docket 的 Bean 实例
     */
    @Bean
    public Docket docket(ApiInfo apiInfo, Environment environment) {
//        Profiles profiles = Profiles.of("dev","test");
        //判断环境是否为"test"或"dev"
//        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
//                //是否启用swagger2
//                .enable(flag)
                .apiInfo(apiInfo)
                .groupName("KaelvihN");
//                .select()
                //RequestHAndlerSelectors 配置扫描接口的方式
                //basePackage 指定要扫描的包
                //any 全部扫描
                //none 都不扫描
                //withClassAnnotation 扫描类上的注解
                //withMethodAnnotation 扫描类上的注解
//                .apis(RequestHandlerSelectors.basePackage("com.example.swaggerdemo.controller"))
//                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
//                .apis(RequestHandlerSelectors.withMethodAnnotation(PostMapping.class))
//                //过滤什么路径
//                .paths(PathSelectors.ant("/bye/**"))
//                .build();
    }

    /**
     * 配置Api info(Swagger信息)
     */
    @Bean
    public ApiInfo apiInfo() {
        //作者信息
        Contact contact =
                new Contact("KaelvihN", "https://www.kaelvihN.top", "araneidasword@gmail.com");
        return new ApiInfo(
                "KaelvihN test",    //标题
                "Swagger测试",    //文档描述
                "v1.0",     //文档版本
                "https://www.kaelvihn.top",     //队伍的网站地址
                contact,
                "Apache 2.0",   //许可证
                "http://www.apache.org/licenses/LICENSE-2.0",   //许可证URL
                new ArrayList<>()
        );
    }
}
