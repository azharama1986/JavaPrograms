package com.palindrome.programs;

public class SumOfDigits {
	
	public static int sumOfDigits(int number)
	{
		//if number is one digit and less than <=9 than return number
		  
		if(number<=9)
			return number;
		if(number<0){
		//	System.out.println("Number is negative");
			return  number;
		}
		else
			//separate last digit from number using modulus + call same function(remainingdigit/10)
			return number%10+sumOfDigits(number/10);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(sumOfDigits(-123));
		
		
		
	}
	

}
