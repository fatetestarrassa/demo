package com.sunbing.demo.annotation;

import java.lang.annotation.*;

/**
 * 需登录注解：作用在方法上，配合拦截器，拦截登录
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {

}
