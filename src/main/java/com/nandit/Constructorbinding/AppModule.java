package com.nandit.Constructorbinding;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule {
	  
	@Override
	public void configure() {
		try {
			bind(SpellChecker.class).toConstructor(TextEditorSpellChecker.class.getConstructor(String.class,String.class,Integer.class));
		} catch (NoSuchMethodException e) {
			// TODO: handle exception
			System.out.println("Required constructor missing");
		}
		bind(String.class).annotatedWith(Names.named("software")).toInstance("Text Editor");
		bind(String.class).annotatedWith(Names.named("version")).toInstance("1.1.10");
		bind(Integer.class).annotatedWith(Names.named("limit")).toInstance(10000);
	}
}
