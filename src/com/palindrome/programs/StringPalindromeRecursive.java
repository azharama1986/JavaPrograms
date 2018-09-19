package com.palindrome.programs;

public class StringPalindromeRecursive {
	
	
	public static void main(String[] args) {
		System.out.println(isPalindoromeRecursively(""));
		System.out.println(isPalindoromeRecursively(" 121 "));
		System.out.println(isPalindoromeRecursively("1"));
		System.out.println(isPalindoromeRecursively("12"));
		System.out.println(isPalindoromeRecursively("123"));
		System.out.println(isPalindoromeRecursively("121"));
		System.out.println(isPalindoromeRecursively("malayalam"));
		
		
	}
	
	
	
	
	public static boolean isPalindoromeRecursively(String input)
	{
		input=input.replaceAll("\\s+","");
		
		if(input.length()==0)
			return false;
		
		//check length of string
		if(input.length()<2)
			return true;
		
		else
		{
			//base case
			if(input.charAt(0)!=input.charAt(input.length()-1))
             {
            	 return false;
             }
			
             else
             {
            	 
            	 return isPalindoromeRecursively(input.substring(1,input.length()-1));
             }
			
		}
					
		
		
	}
	
	

}
