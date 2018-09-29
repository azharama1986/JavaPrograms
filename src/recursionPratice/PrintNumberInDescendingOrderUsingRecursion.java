package recursionPratice;

public class PrintNumberInDescendingOrderUsingRecursion {
	
	
	public static void main(String[] args) {
		System.out.println("Numbers are:");
		printNumberDescendingRecursively(5);
	}
	
	
	
	public static void printNumberDescendingRecursively(int num)
	{
		
		//Base case
		if(num==0)
		{
			return;
		}else{
			System.out.print(num);
			printNumberDescendingRecursively(num-1);
			
		}
	}

}
