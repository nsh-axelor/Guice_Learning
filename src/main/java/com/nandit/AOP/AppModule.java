package com.nandit.AOP;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class AppModule extends AbstractModule  {
	
	@Override
	public void configure() {
		bind(SpellChecker.class).to(TextEditorSpellChecker.class);
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(MethodCallTracker.class), new MethodCallTrackerService());
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(NoSpellChecker.class), new NoSpellCheckerService());
	}
}
