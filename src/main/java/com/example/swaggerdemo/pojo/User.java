package com.example.swaggerdemo.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : KaelvihN
 * @date : 2023/9/16 15:56
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("用户年龄Pro")
    private int age;
}
