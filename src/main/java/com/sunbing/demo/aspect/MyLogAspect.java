package com.sunbing.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 日志切面
 *
 * @author sunbing
 * @version 1.0
 * @since 2021/1/25 16:13
 */
@Aspect         //切面
@Component
public class MyLogAspect {

    /**
     * 切入点：1.切点名称logPointCut()
     *        2.@annotation标识切到一个注解上，括号里是注解的全限定名
     */
    @Pointcut("@annotation(com.sunbing.demo.annotation.MyLog)")
    public void logPointCut(){

    }

    /**
     * 环绕通知
     * @param joinPoint 进行中的连接点
     */
    @Around("logPointCut()")
    public String logArround(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();

        Object[] param = joinPoint.getArgs();
        StringBuilder sb = new StringBuilder();
        for(Object o : param){
            sb.append(o + ";");
        }

        System.out.println("进入[" + methodName + "]方法,参数为：" + sb.toString());

        String result = "";
        try {
            result = (String) joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("方法执行结束");

        return result;
    }
}
