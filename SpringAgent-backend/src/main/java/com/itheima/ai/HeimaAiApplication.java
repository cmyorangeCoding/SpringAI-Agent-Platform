package com.itheima.ai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.itheima.ai.mapper")//如果不加 @MapperScan，你就得在每一个 Mapper 接口上都加 @Mapper 注解
@SpringBootApplication
public class HeimaAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeimaAiApplication.class, args);
    }

}
