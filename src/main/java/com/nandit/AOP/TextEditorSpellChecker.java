package com.nandit.AOP;

public class TextEditorSpellChecker implements SpellChecker{
	
	public TextEditorSpellChecker() {
		super();
	}
	@MethodCallTracker
	public void checkSpell() {
		System.out.println("Checking Spellings");
	}
	
	@NoSpellChecker
	public void noIncorrectSpellings() {
		System.out.println("Checking All Incorrect Spellings");
	}
}
