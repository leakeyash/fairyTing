package com.ztt.pojo;

import org.aspectj.lang.ProceedingJoinPoint;

public class JDBCLog {
    public void startLog(){
        System.out.println("start jdbc log");
    }

    public Object arroundLog(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("start log:" + joinPoint.getSignature().getName());
        return object;
    }
    public void endLog(){
        System.out.println("End jdbc Log");
    }
}
