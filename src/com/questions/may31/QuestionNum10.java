package com.questions.may31;

import java.util.Scanner;



public class QuestionNum10 {

	public static void main(String[] args) {
		int[] array = {1,7,3,5,9,3};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter which size of number do you want to print from array");
		int i = s.nextInt();
		
		try {
			int c= printResult(array,i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		System.out.println("The value of array is "+array[i]);

	}
	
	
	static int printResult(int[] array, int i )throws Exception {
		if(i >= 0 && i< array.length) {
			return array[i];
		}else if(i < 0) {
			Exception exception = new NegativeArraySizeException("This value is not allowed");
			throw exception;
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("You are out of bound");
		}
		
		
	}

}

