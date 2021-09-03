package com.nandit.AOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MethodCallTrackerService implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before Using "+invocation.getMethod().getName());
		Object result = invocation.proceed();
		System.out.println("After Using Spell Checker "+invocation.getMethod().getName());
		return result;
	}

}
