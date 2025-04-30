package com.xuanapi.thumb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuanapi.thumb.mapper")
public class ThumbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThumbApplication.class, args);
    }

}
