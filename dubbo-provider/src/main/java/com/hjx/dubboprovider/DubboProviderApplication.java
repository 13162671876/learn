package com.hjx.dubboprovider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
@ImportResource(locations = "dubbo-provider.xml")
public class DubboProviderApplication   {
    private static final Logger logger = LoggerFactory.getLogger(DubboProviderApplication.class);

    public static void main(String[] args) throws IOException {
        System.out.println(">>>>>>>>>>>>SPIRNGBOOT start<<<<<<<<<<<<");
        SpringApplication springApplication = new SpringApplication(DubboProviderApplication.class);
        springApplication.run(args);
        System.out.println(">>>>>>>>>>>>SPIRNGBOOT LOADED<<<<<<<<<<<<");

    }

}
