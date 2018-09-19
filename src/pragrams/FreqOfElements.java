package pragrams;

import java.util.Arrays;

public class FreqOfElements 
{
	
	public static void main(String[] args) {
		int a[]={1,2,3,4,2,5,1,6,4,3};
		int count=1;
		int index=1;
		Arrays.sort(a);
		
		for(int i=0;i<a.length;)
		{
			count=1;
			for(index=i+1;index<a.length;index++)
			{
				if(a[i]==a[index])
				{
					count++;
				}
				else
				{
					break;
				}
				
				
			}
			
			System.out.println(""+a[i] +"----> "+count);
			//i+=count;	
			i=i+count;
			
		}
				
	}

}
