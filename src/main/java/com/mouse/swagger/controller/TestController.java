package com.mouse.swagger.controller;

import com.mouse.swagger.dto.InputModel;
import com.mouse.swagger.dto.OutputModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @ApiOperation(tags = "dto tag", notes = "dto note", value = "dto value")
    @GetMapping(value = "/dto")
    @ApiResponse(examples = @Example(value={@ExampleProperty(mediaType = "application/json", value = "{c:4}")}),
            code = 200, message = "dto response message", response = OutputModel.class)
    @io.swagger.v3.oas.annotations.responses.ApiResponse(
            content = {
                    @Content(mediaType = "application/json"
                            , schema = @Schema(implementation = OutputModel.class))
            })
    public OutputModel getDTO(@ApiParam(required = true, name = "a", value = "a description") int a){
        return OutputModel.builder().c(a).build();
    }

    @ApiOperation(tags = "list tag", notes = "list note", value = "list value")
    @GetMapping(value = "/list")
//    @ApiResponse(examples = @Example(value={@ExampleProperty(mediaType = "application/json", value = "[{c:4}]")}),
//            code = 200, message = "list response message")
    @io.swagger.v3.oas.annotations.responses.ApiResponse(
            responseCode = "200",
            description = "list response description",
            content = {
                    @Content(mediaType = "application/json"
                            , array = @ArraySchema(
                                    schema = @Schema(implementation = OutputModel.class)
                    ))
            })
    public List<OutputModel> getList(@ApiParam(required = true, name = "a", value = "a description") int a){
        return new ArrayList<>(){
            {
                add(
                        OutputModel
                                .builder()
                                .c(a)
                                .build());
            }};
    }
}
