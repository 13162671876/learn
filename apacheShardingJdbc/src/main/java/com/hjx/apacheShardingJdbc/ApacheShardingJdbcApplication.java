package com.hjx.apacheShardingJdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@MapperScan("com.hjx.apacheShardingJdbc.common")
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class ApacheShardingJdbcApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApacheShardingJdbcApplication.class, args);
        System.out.println(">>>>>>>>>>>>SPIRNGBOOT LOADED<<<<<<<<<<<<");
    }

}
