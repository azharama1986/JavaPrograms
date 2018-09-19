package pragrams;

import java.util.Arrays;

public class StringAnagram 
{
	
	public static void main(String[] args) {
		
		String s1="azhar";
		String s2="rahza";
		char [] c1=s1.toLowerCase().toCharArray();
		char [] c2=s2.toLowerCase().toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			System.out.println(c1[i]);
					
		}
		
		for(int i=0;i<c2.length;i++)
		{
			System.out.println(c2[i]);
					
		}
		
	   Arrays.sort(c1);
	   Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Anagaram");
		}
		
		else
		{
			System.out.println("Not Anagaram");
		}
		
		
	}

}
