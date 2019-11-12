package com.hjx.dubboconsmer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
@ImportResource(locations = "classpath:consumer.xml")
public class DubboConsmerApplication  {

    private final Logger logger = LoggerFactory.getLogger(DubboConsmerApplication.class);

    public static void main(String[] args) throws IOException
    {
        SpringApplication applicationContext = new SpringApplication(DubboConsmerApplication.class);
        applicationContext.run(args);

    }



}
