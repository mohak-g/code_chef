package com.mohak.begin;

import java.util.Scanner;

class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n;i++)
		{
			int in = sc.nextInt();
			double f = getFacorial(in);
			System.out.println(f);
		}
	}

	private static double getFacorial(int in) 
	{
		
		double fact = 1;
		for(int i=1;i<=in;i++)
		{    
			fact=fact*i;    
		}
		return fact;
	}

}
