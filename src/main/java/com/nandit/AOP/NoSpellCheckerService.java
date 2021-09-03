package com.nandit.AOP;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class NoSpellCheckerService implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Incorrect Spell Count - "+0);
		Object result = invocation.proceed();
		System.out.println("Incorrect Spelling Count - "+Math.round(Math.random()*100));
		return result;
	}

}
