package com.palindrome.programs;

public class ReverseStringRecursively {
	
	
	
	public static String reverseString(String text)
	{
		
		if(text.isEmpty())
			return "String is empty";
		if(text.length()<2)
			return text;
		else
			return reverseString(text.substring(1))+text.charAt(0);
	
		
	}
	
	public static void main(String[] args) {
		
		
		String text="azharuddin";
		String reverse;
		reverse=reverseString(text);
		System.out.println(reverse);
		if(text.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	

}
