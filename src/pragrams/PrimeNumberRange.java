package pragrams;

public class PrimeNumberRange
{
	
	//check from 1 to 500, how many prime numbers are there
	
	public static void main(String[] args) {
		int flag=0;
		for(int i=2 ;i<=500;i++)
		{
			for(int k=2;k<i;k++)
			{
				if(i%k==0)
				{
					flag=1;
					break;
				}
				
				else
				{
					flag=0;
				}
			}
			
			if(flag==0)
			{
				System.out.println(i);
			}
			
			
		}
	}

}
