package com.nandit.AOP;

import com.google.inject.Inject;

public class TextEditor {

	SpellChecker spellChecker;
	
	@Inject
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	
	public void useSpellChecker() {
		this.spellChecker.noIncorrectSpellings();
		this.spellChecker.checkSpell();
	}

}
