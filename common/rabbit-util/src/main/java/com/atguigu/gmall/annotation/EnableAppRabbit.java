package com.atguigu.gmall.annotation;

import com.atguigu.gmall.rabbit.AppRabbitConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author: 李耀华
 * @date: 2022/9/15 14:19
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Import(AppRabbitConfiguration.class)
public @interface EnableAppRabbit {

}
