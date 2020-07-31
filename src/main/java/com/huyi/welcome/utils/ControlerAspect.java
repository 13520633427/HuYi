package com.huyi.welcome.utils;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 对所有Controller的增强，会记录所有请求者的ip和参数，
 * 方便之后出现错误时进行恢复数据
 */
@Aspect
@Slf4j
@Component
public class ControlerAspect {

    //定义切面
    @Pointcut("execution(public * com.huyi.welcome.controller.*.*(..))")
    public void log(){}


    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //URL
        log.info("请求URL={}",request.getRequestURL());
        //method
        log.info("请求方式={}",request.getMethod());
        //ip
        log.info("请求ip={}",request.getRemoteAddr());
        //请求的哪个类的哪个方法
        log.info("请求类和方法={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //请求参数
        log.info("请求参数={}",joinPoint.getArgs());
        System.out.println("before");
    }

    @After("log()")
    public void logAfter(){
        System.out.println("after");
    }

    /**
     * 获取切点方法的返回值
     * @param object
     */
    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        log.info("response={}",object);
    }

}
