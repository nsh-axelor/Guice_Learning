package com.nandit.ProvidesSpellChecker;

import com.google.inject.Inject;

public class TextEditorSpellChecker implements SpellChecker {
	String software;
	String version;
	Integer limit;
	@Inject
	public TextEditorSpellChecker(	String software,String version,Integer limit) {
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
