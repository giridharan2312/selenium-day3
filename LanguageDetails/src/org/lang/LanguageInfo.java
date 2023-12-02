package org.lang;

public class LanguageInfo extends StateDetails{
	public void tamilLanguage() {
		System.out.println("Tamil");
	}

	public void englishLanguage() {
		System.out.println("English");
	}

	public void hindiLanguage() {
		System.out.println("Hindi");
	}
	public static void main(String[] args) {
		
		LanguageInfo lang = new LanguageInfo();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
		
		lang.southIndia();
		lang.northIndia();
	}
}
//
//QUESTION 7:
//-----------
//     Project   :LanguageDetails
//     Package   :org.lang
//     Class     :LanguageInfo
//     Methods   :tamilLanguage(),englishLanguage(),hindiLanguage()
//
//     Class     :StateDetails
//     Methods   :southIndia(),northIndia()
//
//Description:
//create above 2 class and call all your class methods 
// into the LanguageInfo using single inheritance.
