package pragrams;

public class ReverseString2
{
	
	//convert string into char array and iterate
	
	public static void main(String[] args) {
		String s1="azhar";
		char[] array=s1.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]);
		}
		
		
		
	}
	

}
