package com.mouse.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/5/18 09:00
 */
@Data
@ApiModel(description = "测试输入model")
public class InputModel {
    @ApiModelProperty(name = "a name", value = "a description")
    private int a;
    @ApiParam(name = "b name", value = "b description")
    private int b;
}
