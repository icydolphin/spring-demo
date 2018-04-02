package com.ctvit.bussiness.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Pointcut("@annotation(com.ctvit.bussiness.aop.Action)")
	public void annotationPointCut(){};
	
	@After("annotationPointCut()")
	public void after(JoinPoint joinpoint){
		MethodSignature methodSignature = (MethodSignature)joinpoint.getSignature();
		Method method = methodSignature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("After注解式拦截");
		System.out.println(action.name());
	}
	
	@Before("execution(* com.ctvit.bussiness.aop.UserService.*(..))")
	public void before(JoinPoint joinpoint){
		MethodSignature methodSignature = (MethodSignature)joinpoint.getSignature();
		Method method = methodSignature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("Before方法式规则拦截");
		System.out.println(action.name());
	}

}
