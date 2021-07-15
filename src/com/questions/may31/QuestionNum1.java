package com.questions.may31;

import java.util.Scanner;

public class QuestionNum1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = s.nextInt();
		s.close();
		if(num%2==0) {
			System.out.println("The number you enter is even");
		}
		else {
			System.out.println("The number you enter is odd");
		}

	}

}
