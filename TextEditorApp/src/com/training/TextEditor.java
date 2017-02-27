package com.training;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor 
{
	private SpellChecker spellChecker;
	public TextEditor() {
		System.out.println("Constructor");
	}
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker)
	{
		this.spellChecker =  spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void spellCheck()
	{
		System.out.println("Inside spellcheck text editor class");
		spellChecker.checkSpelling();
	}
}
