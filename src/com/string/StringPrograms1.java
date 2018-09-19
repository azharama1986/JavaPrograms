package com.string;

public class StringPrograms1 {
	
	
	public static void main(String[] args) {
		
		String name = "Meraj Ahmad khan";
		String test=replaceLastOccuranceOfCharcaterInString(name,'a','0');
		System.out.println(replaceCharacterInString(test,'a','n'));
		
		
	}
	
	
	private static String replaceLastOccuranceOfCharcaterInString(String text,char c,char replace)
	{  String newText="";
		if(text.length()<2)
			return "there is only character in string";
		else
		{
		text=text.toLowerCase();
		newText=text.substring(0, text.lastIndexOf(c))+replace+text.substring(text.lastIndexOf(c)+1);
		}
		return newText;	
	}
	
	private static StringBuilder replaceCharacterInString(String text,char char1,char char2)
	{   
		StringBuilder newText=new StringBuilder();
			char[]chararray=text.toCharArray();
			for(int i=0;i<chararray.length;i++)
			{
				if(chararray[i]==char1)
				{
					chararray[i]=char2;
				}
				else if(chararray[i]==char2)
				{
					chararray[i]=char1;
				}
				newText.append(chararray[i]);
			}
			
		return newText;	
	}

}