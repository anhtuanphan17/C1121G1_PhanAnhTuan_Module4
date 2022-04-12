package com.library_management.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
@Aspect
public class SachAspect {
    private static Integer numberOfVisitor = 0;


//    @After("execution(* com.library_management.controller.SachController(..))")
//    public void logSach(JoinPoint joinPoint){
//     String className = joinPoint.getTarget().getClass().getSimpleName();
//     String methodName = joinPoint.getSignature().getName();
//     String args = Arrays.toString(joinPoint.getArgs());
//        System.out.println("class name : " + className);
//        System.out.println("method : " + methodName);
//        System.out.println(" args : " + args);
//    }

    @AfterReturning(pointcut = "execution(public * com.library_management.controller.SachController.*(..))")
    public void logViewers(JoinPoint joinPoint){
        numberOfVisitor += 1;
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("class name : " + className);
        System.out.println("method : " + method);
        System.out.println("args : " + args);
        System.out.println("views : " + numberOfVisitor);

    }
}
