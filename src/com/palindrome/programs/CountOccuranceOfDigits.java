package com.palindrome.programs;

public class CountOccuranceOfDigits {

	
	
	public static int countOccurance(int num,int digit)
	{
		if(num<=9)
		{
			if(num==digit)
				return 1;
			else
			{
				return 0;
			}
		}
		else
		{
			if(num%10==digit)
				return 1+countOccurance(num/10, digit);
			else
				return 0+countOccurance(num/10, digit);
		}
		
		
		
	}
	public static void main(String[] args) {
		int digit=5;
		System.out.println("Occurance of "+digit+" in number :  "+countOccurance(1258588865,digit));
		
		
		
	}
	
	
	
	
	
	
	
	
}
