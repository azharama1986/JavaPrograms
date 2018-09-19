package com.palindrome.programs;

public class StringPalindrome {
	
	
	public static void main(String[] args) {
		
		String text = "1211";
		
		System.out.println(isStringPalindrome(text));
		
		
		
		
	}
	
	
	public static boolean isStringPalindrome(String text)
	{
		
		char[] characters=text.toCharArray();
		int forward=0;
		int backward=text.length()-1;
		while(forward<=backward)
		{
			if(characters[forward]!=characters[backward])
			{
				return false;
			}
			forward++;
			backward--;
			
		}
		
		
		return true;
		
	}
	

}
