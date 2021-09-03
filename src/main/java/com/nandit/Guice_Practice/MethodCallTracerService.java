package com.nandit.Guice_Practice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MethodCallTracerService implements MethodInterceptor  {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before using "+invocation.getMethod().getName());
		Object outcome = invocation.proceed();
		System.out.println("After using "+invocation.getMethod().getName());
		return null;
	}

}
