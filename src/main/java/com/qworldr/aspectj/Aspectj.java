package com.qworldr.aspectj;

import com.qworldr.aspectj.introductions.Introduction;
import com.qworldr.aspectj.introductions.IntroductionImpl;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author wujiazhen
 */
@Aspect
@Component
public class Aspectj {
//    @Pointcut("execution(* com.qworldr.aspectj.service.TestService.*())")
//    public void pointcut(){};
//    @Before("pointcut()")
//    public void before(){
//        System.out.println("前置通知 test执行前");
//    }
//
//    /**
//     *
//     * @param joinPoint 可以获得目标方法和参数值
//     * @param val  目标方法返回值  参数名要和注解的returning一致
//     */
//    @AfterReturning(pointcut = "pointcut()",returning = "val")
//    public void afterReturn(JoinPoint joinPoint, Object val){
//        System.out.println("后置通知:"+val);
//    }
//
//    /**
//     *  异常通知
//     * @param joinPoint 可以获得目标方法和参数值
//     * @param ex  目标方法抛出异常 参数名要和注解的throwing一致
//     */
//    @AfterThrowing(pointcut = "pointcut()",throwing = "ex")
//    public void afterThrowing(JoinPoint joinPoint,Throwable ex){
//        System.out.println("异常:"+ex);
//    }
//
//    /**
//     *  最终通知
//     */
//    @After("pointcut()")
//    public void after(){
//        System.out.println("最终通知 xml test执行后");
//    }
//
//    /**
//     *  环绕通知
//     * @param joinPoint ProceedingJoinPoint的proceed方法相当于invoke方法，调用目标类的目标方法
//     * @return
//     * @throws Throwable
//     */
//    @Around("pointcut()")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("环绕通知  test执行前");
//        Object proceed = joinPoint.proceed();
//        System.out.println("环绕通知 xml test执行后");
//        return proceed;
//    }

    @DeclareParents(value = "com.qworldr.aspectj.service.TestService",defaultImpl = IntroductionImpl.class)
    public Introduction introduction;

}
