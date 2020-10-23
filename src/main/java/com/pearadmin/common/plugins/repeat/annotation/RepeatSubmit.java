package com.pearadmin.common.plugins.repeat.annotation;

import java.lang.annotation.*;

/**
 * Describe: 自定义注解防止表单重复提交
 * Author: 就 眠 仪 式
 * CreateTime: 2019/10/23
 * */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepeatSubmit
{

}