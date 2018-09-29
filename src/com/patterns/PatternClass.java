package com.patterns;

public class PatternClass 
{
	public static void main(String[] args) {
		PatternClass p1=new PatternClass();
		p1.pattern12();
		
	}
	
	
	/*Pattern1:
	      ****
	      ***
	      **
	      *
	*/
	
	public void pattern1()
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
			  System.out.print("*");
			  
			}
			
			System.out.println();
			}
	}
	
	/*
	   Pattern2 
	                *
	                **
	                ***
	                ****
	  */
	
	public void pattern2()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
	}
	

	/*
	   Pattern3
	               1
	               22
	               333
	               4444
	               55555
	  */
	
	public void pattern3()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		
	}
	
	
	/*
	   Pattern4
	               1
	               12
	               123
	               1234
	               12345
	  */
	
	public void pattern4()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}
	
	
	/*
	   Pattern5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
	  */
	
	public void pattern5()
	{
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		
		System.out.println();
	}
		
	      for(int i=6;i>=1;i--)
	      {
		    for(int j=1;j<=i;j++)
		    {
		    	System.out.print(j+" ");
		    }
		    System.out.println();
	     }
	
	}
	
	
	/*
	   Pattern6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
	  */
	
	public void pattern6()
	{
	    for(int i=7;i>=1;i--)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print(j+" ");
	    		
	    	}
	    	
	    	System.out.println();
	    }
	
	}
	
	
	/*
	   Pattern7
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7
	  */
	
	public void pattern7()
	{
	  for(int i=1;i<=7;i++)
	  {
		  for(int j=7;j>=i;j--)
		  {
			  System.out.print(j+" ");
		  }
		  
		  System.out.println();
	  }
	}
	
	
	/*
	   Pattern8
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1
	  */
	
	public void pattern8()
	{
	  
		for(int i=7;i>=1;i--)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		
	}
	
	
	
	/*
	   Pattern9
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
	  */
	
	public void pattern9()
	{
	    for(int i=7;i>=1;i--)
	    {
	    	for(int j=i;j>=1;j--)
	    	{
	    		System.out.print(j+" ");
	    	}
	    	
	    	System.out.println();
	    }
		
	}
	
	
	
	
	/*
	   Pattern10
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
	  */
	
	public void pattern10()
	{
	   for(int i=7;i>=1;i--)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(j+" ");
		   }
		   
		   System.out.println();
		   
		  
	   }
	   
	   for(int i=2;i<=7;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(j+" ");
		   }
		   System.out.println();
	   }
	}
	
	/*
	   Pattern11
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
	  */
	
	public void pattern11()
	{
	 for(int i=1;i<=7;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(j+" ");
		 }
		 
		 for(int j=i-1;j>=1;j--)
		 {
			 System.out.print(j+" ");
		 }
		 
		 System.out.println();
	 }
	}
			
	
	/*
	   Pattern12
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1
	  */
	
	public void pattern12()
	{
      for(int i=1;i<=7;i++)
      {
    	  for(int j=i;j>=1;j--)
    	  {
    		  System.out.print(j);
    	  }
    	  
    	  System.out.println();
      }
		
	}
}
