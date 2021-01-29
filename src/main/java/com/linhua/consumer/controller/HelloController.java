package com.linhua.consumer.controller;

import com.linhua.service.facade.DubboDemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linhua
 * @date 2021/1/22
 * @description
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @Reference
    private DubboDemoService demoService;

    @GetMapping(value = "world")
    public void world(){
        System.out.println(demoService.helloDubbo());
    }



}
