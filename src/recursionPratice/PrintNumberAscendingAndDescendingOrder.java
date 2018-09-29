package recursionPratice;

public class PrintNumberAscendingAndDescendingOrder {
	
	public static void main(String[] args) {
		printNumberInAscendingAndDescendingOrder(5);
	}
	
	
	public static void printNumberInAscendingAndDescendingOrder(int num)
	{
		
		if(num ==0)
		{
			return;
		}else{
			System.out.print(num+" ");
			printNumberInAscendingAndDescendingOrder(num - 1);
			System.out.print(num+" ");
		}
		
		
	}

}
