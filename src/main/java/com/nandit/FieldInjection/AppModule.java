package com.nandit.FieldInjection;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule{

	@Override
	public void configure() {
		bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
		bind(String.class).annotatedWith(Names.named("color")).toInstance("Red");
		bind(Integer.class).annotatedWith(Names.named("edge")).toInstance(4);
	}
	
}
