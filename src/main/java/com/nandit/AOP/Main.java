package com.nandit.AOP;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Injector injector = Guice.createInjector(new AppModule());
		TextEditor textEditor = injector.getInstance(TextEditor.class);
		
		textEditor.useSpellChecker();
	}

}
