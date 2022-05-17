package com.mouse.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "测试接口", value = "测试value")
public class TestController {

    @ApiOperation(tags = "hi tag", notes = "hi note", value = "hi value")
    @GetMapping(value = "/hi")
    public String hi(){
        log.info("hello world");
        log.error("error log");
        return "hello world";
    }

}
