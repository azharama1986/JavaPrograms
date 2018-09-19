package com.basic.programs;

import java.util.Scanner;

public class AgeGroupProgram {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter your Age");
		int input=sc.nextInt();
		
	    if(input>=0 && input<=12)
	    {
	    	System.out.println("you are a child");
	    }
	    else if(input>12 && input<=18)
	    {
	    	System.out.println("You are Teen!");
	    }
	    else if(input>18 && input<=40)
	    {
	    	System.out.println("You are Adult.");
	    }
	    else
	    	System.out.println("You are OLD...... old is gold");
		sc.close();
	}
	

}
