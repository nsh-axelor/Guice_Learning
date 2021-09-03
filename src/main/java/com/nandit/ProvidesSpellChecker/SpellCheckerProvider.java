package com.nandit.ProvidesSpellChecker;

import com.google.inject.Provider;

public class SpellCheckerProvider implements Provider<SpellChecker> {

	public SpellChecker get() {
		// TODO Auto-generated method stub
		SpellChecker spellChecker = new TextEditorSpellChecker("TextEditor", "1.1.10", 10000);
		return spellChecker;
	}

	
}
