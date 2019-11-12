package com.hjx.shardingJdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.hjx.shardingJdbc.common")
public class ShardingJDBCApplication {
    private static final Logger logger = LoggerFactory.getLogger(ShardingJDBCApplication.class);

    public static void main(String[] args) throws IOException {
        System.out.println(">>>>>>>>>>>>SPIRNGBOOT start<<<<<<<<<<<<");
        SpringApplication springApplication = new SpringApplication(ShardingJDBCApplication.class);
        springApplication.run(args);
        System.out.println(">>>>>>>>>>>>SPIRNGBOOT LOADED<<<<<<<<<<<<");

    }

}
