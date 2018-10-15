package com.qworldr.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author wujiazhen
 */

public class XMLAspectj {

    public void before(){
        System.out.println("前置通知 test执行前");
    }

    public void afterReturn(JoinPoint joinPoint,Object val){
        System.out.println("后置通知:"+val);
    }
    public void afterThrowing(JoinPoint joinPoint,Exception ex){
        System.out.println("异常:"+ex);
    }
    public void after(){
        System.out.println("最终通知 xml test执行后");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知  test执行前");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕通知 xml test执行后");
        return proceed;
    }
}
