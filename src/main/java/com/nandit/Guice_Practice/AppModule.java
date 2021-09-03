package com.nandit.Guice_Practice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scope;
import com.google.inject.Scopes;
import com.google.inject.matcher.Matcher;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;
import com.nandit.ProvidesSpellChecker.SpellCheckerProvider;
import com.sun.org.apache.xml.internal.serializer.Version;

public class AppModule extends AbstractModule {
	 
	
	@Override
	public void configure() {
		
		bind(String.class).annotatedWith(Names.named("version")).toInstance("1.1.0");
		bind(String.class).annotatedWith(Names.named("software")).toInstance("Text-Editor");
		bind(SpellChecker.class).to(TextEditorSpellChecker.class);
		
		bindInterceptor(Matchers.any(),Matchers.annotatedWith(MethodCallTracer.class),new MethodCallTracerService());
		
	}

}
