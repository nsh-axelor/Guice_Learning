package com.nandit.SquareExample;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule{

	@Override
	public void configure() {
		bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
		bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
		bind(Integer.class).annotatedWith(Names.named("EdgeValue")).toInstance(4);
	}
	
}
