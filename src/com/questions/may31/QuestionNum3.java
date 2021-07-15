package com.questions.may31;

public class QuestionNum3 {

	public static void main(String[] args) {
		int input = 25;
		sumOfDigits(input);

	}
	
	static void sumOfDigits(int input) {
		int reminder = 0;
		int sum =0;
		while(input!=0) {
			reminder = input%10; //25/10 =5.... 2/10= 2
			sum = sum+reminder;  //0+5=5 ......  5+2=7
			input = input/10;    //25/10=2 ...... 2/10=0
		}
		System.out.println("The sum of given number is " +sum);
	}

}
