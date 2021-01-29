package com.linhua.consumer;

import com.linhua.service.facade.DubboDemoService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author linhua
 * @date 2021/1/22
 * @description
 */
@EnableDubbo
@SpringBootApplication
public class DubboStarterConsumerDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(DubboStarterConsumerDemoApplication.class, args);
    }

}