package com.sunbing.demo.controller;

import com.sunbing.demo.annotation.LoginRequired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试自定义注解控制器：  自定义注解 + 拦截器    自定义注解 + aop
 * @author sunbing
 * @version 1.0
 * @since 2021/1/25 14:39
 */
@RestController
@RequestMapping("/test/annotation")
public class TestAnnotationController {

    @RequestMapping("/sourceA")
    public String sourceA(){
        return "你在访问SourceA资源";
    }

    @LoginRequired
    @RequestMapping("/sourceB")
    public String sourceB(){
        return "你在访问SourceB资源";
    }
}
