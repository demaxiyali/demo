package com.example.demo.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author Li
 * @email
 * @date 2019/12/24
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String value() default "first";
}
