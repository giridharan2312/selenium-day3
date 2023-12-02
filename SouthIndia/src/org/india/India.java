package org.india;

import com.tamilnadu.TamilNadu;

public class India extends TamilNadu{
	private void india() {
		System.out.println("India");
	}
	public static void main(String[] args) {
		India ind = new India();
		ind.india();
		ind.tamillanguage();
		ind.malayalam();
		ind.telugu();
	}
}


//QUESTION 4:
//------------
//     package name: org.india
//     Project name: SouthIndia
//     Class name  : India
//     Methods     : india
//
//     package name: org.tamilnadu
//     Project name: SouthIndia
//     Class name  : TamilNadu
//     Methods     : tamillanguage
//  
//     package name: org.kerala
//     Project name: SouthIndia
//     Class name  : kerala
//     Methods     : malayalam
//
//     package name: org.andrapradesh
//     Project name: SouthIndia
//     Class name  : AndhraPradesh
//     Methods     : telugu
//
//Description:
//create above 4 packages and call all your class methods 
//into India using multilevel inheritance.
