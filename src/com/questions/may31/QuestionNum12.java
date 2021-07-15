package com.questions.may31;

public class QuestionNum12 {

	public static void main(String[] args) {
		int[] array = {9,2,1,3,7,2};
        average(array);
        maximum(array);
	}
	
	static void average(int[] array) {
		int sum=0;
		for(int i =0; i<array.length; i++) {
			sum = sum+array[i];
		}
		System.out.println("Sum of given array is "+sum);
		int avg = sum/array.length;
		System.out.println("Average of given array is "+avg);
	}
	
	static void maximum(int[] array) {
		int max =array[0];
		for(int i =1; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
				
		}
		System.out.println("Maximum number from given array is "+max);
	}

}
