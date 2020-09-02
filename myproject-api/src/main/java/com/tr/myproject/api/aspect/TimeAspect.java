package com.tr.myproject.api.aspect;

/**
 * Created by pj on 2019/10/22.
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * this is a acpect
 * 切入点
 * 在那些方法上起作用
 * 在什么时候起作用
 *
 * @author hsj
 * @create 2017-11-11 20:52
 **/
//@Aspect
//@Component
public class TimeAspect {
    @Around("execution(* com.tr.myproject.api.controller.UserController.*(..))")
    public Object handleControllerMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("time aspect start");
        Object[] args = proceedingJoinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg.getClass().getName());
            System.out.println("arg is " + arg);
        }
        long startTime = new Date().getTime();
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("time aspect 耗时" + (new Date().getTime() - startTime));
        System.out.println("time aspect end");
        return obj;
    }
}
