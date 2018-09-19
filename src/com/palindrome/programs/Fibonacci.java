package com.palindrome.programs;

public class Fibonacci {
	
	
	
	public static int fibonacci(int number)
	{
		if(number==0){
			
			return 0;}
		if(number==1){
			
			return 1;}
		else
		{  
			return fibonacci(number-1)+fibonacci(number-2);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		//System.out.println("Fibonacci: "+ fibonacci(3));
		System.out.print("Fibonacci Series is: ");
		//Display Fibonacci Series
		for(int i=0;i<=10;i++)
		{
			System.out.print(fibonacci(i)+",");
		}
		
		
	}

}
