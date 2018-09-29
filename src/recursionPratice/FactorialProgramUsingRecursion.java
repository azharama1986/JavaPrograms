package recursionPratice;

public class FactorialProgramUsingRecursion {
	
	
	public static void main(String[] args) {
		
		System.out.println("Factorial : "+getFactorial(5));
		
		
	}
	
	
	public static int getFactorial(int num)
	{
		//Base case
		if(num==0 || num ==1){
			return 1;
		}
		else{
			//recursion
			return num*getFactorial(num-1);
		}
		
	}
	
	
	

}
