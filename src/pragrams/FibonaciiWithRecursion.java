package pragrams;

public class FibonaciiWithRecursion
{ 
	static int n1=0,n2=1,n3;
	
	
	public static void recursiveFibonacci(int count)
	{
		
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			recursiveFibonacci(count-1);
		}
	}
	
	public static void main(String[] args)
	{
		int count=10;
		System.out.print(n1+" "+n2);
		recursiveFibonacci(count-2);
	}

}
