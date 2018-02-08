package com.example.springaopcustomannotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomAspectJImpl implements CustomAspect {

	@Around("@annotation(CustomerAnnotation)")
	@Override
	public Object testAnnotation(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("Inside CustomerAnnotation");
		try {
			Object returnObj = proceedingJoinPoint.proceed();
			return returnObj;
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}
}
