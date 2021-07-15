package com.questions.may31;

import java.util.Scanner;

public class QuestionNum4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = s.nextInt();
		s.close();
		
		if(num>=0) {
			System.out.println(num +" is positive number");
		}
		else {
			System.out.println(num +" is negative number");
		}

	}

}
