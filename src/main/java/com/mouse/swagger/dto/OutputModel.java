package com.mouse.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/5/18 09:00
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(description = "测试输出model")
public class OutputModel {
    @ApiModelProperty(name = "c name", value = "c value")
    private int c;
    @ApiModelProperty(name = "d name", value = "d value")
    private int d;
}
