package com.nandit.Constructorbinding;

import com.google.inject.Inject;

public class TextEditor {
	SpellChecker spellChecker;
	
	@Inject
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void textSpellCheck() {
		spellChecker.checkSpell();
	}
}
