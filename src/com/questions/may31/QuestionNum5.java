package com.questions.may31;

public class QuestionNum5 {

	public static void main(String[] args) {
		
		factorialOf5();
		factorialOf6();
		factorialOf7();
		

	}
	
	static void factorialOf5() {
		int num =5;
		int fact = 1;
		for(int i = 1; i<=5; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of 5 is "+fact);
	}
	
	static void factorialOf6() {
		int num =6;
		int fact = 1;
		for(int i = 1; i<=6; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of 6 is "+fact);
	}
	
	static void factorialOf7() {
		int num =7;
		int fact = 1;
		for(int i = 1; i<=7; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of 7 is "+fact);
	}

}
