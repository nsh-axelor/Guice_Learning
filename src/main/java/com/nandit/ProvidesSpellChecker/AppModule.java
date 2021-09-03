package com.nandit.ProvidesSpellChecker;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class AppModule extends AbstractModule {
	  
	@Override
	public void configure() {
		bind(SpellChecker.class).toProvider(SpellCheckerProvider.class);
	}
}
