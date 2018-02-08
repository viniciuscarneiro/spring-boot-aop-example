package com.example.springaopcustomannotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public interface CustomAspect {
	Object testAnnotation(ProceedingJoinPoint proceedingJoinPoint);
}
