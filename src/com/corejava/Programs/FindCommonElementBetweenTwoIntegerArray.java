package com.corejava.Programs;

public class FindCommonElementBetweenTwoIntegerArray {
	
	
	public static void main(String[] args) {
		int[] array1={10,4,5,8};
		int[] array2={4,8,6,5};
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				
				if(array1[i]==array2[j])
				{
					System.out.println(array1[i]);
				}	
				
			}
			
			
		}
		
		
		
	}

}
