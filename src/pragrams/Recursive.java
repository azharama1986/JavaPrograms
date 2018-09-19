package pragrams;

public class Recursive
{
	public static void main(String[] args) {
		String str="azhar is my name";
		Recursive s=new Recursive();
		System.out.println(s.reverse(str));
	}

	public String reverse(String str)
	{
		if((null==str) ||str.length()<=1)
		{
			//System.out.println("this");
			return str;
		}
		
		return reverse(str.substring(1))+str.charAt(0);
		
	}
	
	
	
}
