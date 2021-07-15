package com.questions.may31;

import java.util.Scanner;

public class QuestionNum11 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Sentence:");
		String str= s.next();
		s.close();
		
		boolean b = str.startsWith("hi");
		if(b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}

}
