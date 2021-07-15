package com.questions.may31;



public class QuestionNum2 {

	public static void main(String[] args) {
		findSmallest();

	}
	
	static void findSmallest() {
		int num1 = 25;
		int num2 = 37;
		int num3 = 29;
		
		if(num1<num2 && num1<num3) {
			System.out.println("Smallest value is "+num1);
		}
		else if(num2<num1 && num2<num3) {
			System.out.println("Smallest value is "+num2);
		}
		else {
			System.out.println("Smallest value is "+num3);
		}
	}

}
