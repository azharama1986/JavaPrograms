package pragrams;

public class NumberPalindrome 
{
	public static void main(String[] args) {
		int number=454,sum=0,r;
		int temp=number;
		while(number>0)
		{
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
		}
		
		if(temp==sum)
		{
			System.out.println("the given number is palindrome");
		}
		
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
