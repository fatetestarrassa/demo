package com.sunbing.demo.annotation;

import java.lang.annotation.*;

/**
 * 日志注解
 *
 * @author sunbing
 * @version 1.0
 * @since 2021/1/25 16:09
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLog {
}
