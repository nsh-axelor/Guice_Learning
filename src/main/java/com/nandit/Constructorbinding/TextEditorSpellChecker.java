package com.nandit.Constructorbinding;


import com.google.inject.name.Named;

public class TextEditorSpellChecker implements SpellChecker {
	String software;
	String version;
	Integer limit;
	
	public TextEditorSpellChecker() {}
	
	
	
	public TextEditorSpellChecker(@Named("software") String software,@Named("version") String version,@Named("limit") Integer limit) {
		this.limit = limit;
		this.software = software;
		this.version = version;
	}
	public void checkSpell() {
		// TODO Auto-generated method stub
		System.out.println("Checking the spellings");
		System.out.println(software);
		System.out.println(version);
		System.out.println(limit);
	}
}
