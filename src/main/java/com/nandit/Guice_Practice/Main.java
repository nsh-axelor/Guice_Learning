package com.nandit.Guice_Practice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice.createInjector(new AppModule());
//		injector.injectMembers(TextEditor.class);
		TextEditor textEditor = injector.getInstance(TextEditor.class);
		textEditor.textSpellCheck();
	}
}
