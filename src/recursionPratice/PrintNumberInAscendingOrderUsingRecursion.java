
package recursionPratice;

public class PrintNumberInAscendingOrderUsingRecursion {
	
	public static void main(String[] args) {
		
	   printNumbersInAscendingOrder(5);
		
		
		
	}
	
	
	public static void printNumbersInAscendingOrder(int num)
	{
		if(num==0)
		{
			return;
		}
		else
		{
		   printNumbersInAscendingOrder(num - 1);
		   System.out.println(num);
		}
	}
	
	

}
