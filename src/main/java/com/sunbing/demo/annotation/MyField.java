package com.sunbing.demo.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解类
 */
@Inherited          //可继承
@Target(ElementType.FIELD)  //目标类型：TYPE FIELD METHOD等等，详见源码
@Retention(RetentionPolicy.RUNTIME) //保留到什么时间  SOURCE：源码，编译时消失 CLASS：类，编译时在，运行时消失 RUNTIME：运行时
public @interface MyField {
    String description();
    int len();
}
