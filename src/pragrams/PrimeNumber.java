package pragrams;

public class PrimeNumber
{
	
	public static void main(String[] args) {
		int n=100,m=0,i;
		int flag=0;
	    m=n/2;
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				
				System.out.println("the given"+" "+n+" "+"is not prime number");
				flag=1;
				break;
			}
			
			
			
		}
		
		if(flag==0)
		{
			System.out.println("the given number "+n+ " is a prime number");
		}
	}

}
