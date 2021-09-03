package com.nandit.Guice_Practice;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;



public class TextEditorSpellChecker implements SpellChecker {

	String version;
	@Inject(optional = true) @Named("software") String software = "TextEditor";
	Long limit;

	@Inject
	public void setData(@Named("version") String version) {
		this.version = version;
		this.limit = Math.round(Math.random()*1000);
	}
	
	
	@MethodCallTracer
	public void checkSpell() {
		// TODO Auto-generated method stub
		System.out.println("Checking the spellings"+version);
		System.out.println(version+software+limit);
	}
	

}
