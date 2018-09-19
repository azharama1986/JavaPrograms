package com.string;

public class StringProgram2 {

	public static void main(String[] args) {
		
		//input string
		String text="azharuddin_khan_testing@something.com";
		
		StringBuilder sb=new StringBuilder(text);
		sb=sb.reverse();
		System.out.println(sb.toString());
		
		/*StringBuilder sb=new StringBuilder();
		String [] arr1=text.split("@");
		sb.append(reverse(arr1[0],"_"));
		sb.append("@");
		sb.append(reverse(arr1[1],"\\."));
		System.out.println(sb.toString());*/
	
		//output string
	   //niddurahza_nahk_gnitset@gnihtemos.moc
		
		
		
	}
	
	private static String reverse(String arr,String delimeter)
	{
		
		
		StringBuilder sb=new StringBuilder();
		String[] array1=arr.split(delimeter);
		for(int i=0;i<array1.length;i++)
		{
			sb=sb.append(new StringBuilder(array1[i]).reverse());
			//using ternary operator
			delimeter=delimeter.equals("\\.")? delimeter.substring(delimeter.length()-1):delimeter;
			sb.append(delimeter);
		}
		
		return sb.substring(0,sb.length()-1);
		
	}
	
	
	
	
}
