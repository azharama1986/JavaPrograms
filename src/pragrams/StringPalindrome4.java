package pragrams;

public class StringPalindrome4 
{
	
	public static void main(String[] args)
	{
		String s="azhar";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
			
			
		}
		
		System.out.println(reverse);
		
		if(s.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}
	
	

}
