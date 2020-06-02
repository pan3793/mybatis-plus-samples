package com.baomidou.mybatisplus.samples.quickstart.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(autoResultMap = true)
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
