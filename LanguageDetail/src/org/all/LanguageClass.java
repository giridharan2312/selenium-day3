package org.all;

import org.english.English;

public class LanguageClass extends English{
	private void allLanguage() {
		System.out.println("All Language");
	}
	public static void main(String[] args) {
		
		LanguageClass lang = new LanguageClass();
		lang.allLanguage();
		lang.telguLanguage();
		lang.englishLanguage();
		lang.tamilLanguage();
		
		
	}
}







//QUESTION 3:
//------------
//     package name: org.all
//     Project name: LanguageDetails
//     Class name  : Languageclass
//     Methods     : alllanguage
//
//     package name: org.tamil
//     Project name: LanguageDetails
//     Class name  : Tamil
//     Methods     : tamillanguage
//  
//     package name: org.english
//     Project name: LanguageDetails
//     Class name  : English
//     Methods     : englishlanguage
//
//     package name: org.telgu
//     Project name: LanguageDetails
//     Class name  : Telgu
//     Methods     : telgulanguage
//
//Description:
//create above 4 packages and call all your class methods
//into the Languageclass using multilevel inheritance.