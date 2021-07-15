package com.questions.may31;


import java.util.Scanner;

public class QuestionNum9 {

	public static void main(String[] args) {
		
		searchOperation();
	}
	
	static void searchOperation() {
		
		int[] array =	{2,1,5,3,6,9};
		  
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the number you want to search"); 
		  int num =s.nextInt(); 
		  s.close(); 
		  
		  boolean b = false;
		  for(int i =0; i<array.length; i++) {
		  if(num==array[i]) {
			  b = true;
		  }
		  
		  }
		  if(b) {
		  System.out.println("Search found");
		  }
		  else {
			  System.out.println("Search not found");  
		  
		 }
		  
		
	}
	
	
	

}
