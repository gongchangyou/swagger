package com.mouse.swagger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/5/8 17:44
 */
@Slf4j
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/hi")
    public String hi(){
        log.info("hello world");
        log.error("error log");
        return "hello world";
    }

}
