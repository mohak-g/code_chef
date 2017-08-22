package com.mohak.begin;

import java.util.Scanner;

class EnormousInputTest 
{
	public static void main (String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int counter = 0;

		for (int i=0; i<n ; i++)
		{
			if(sc.nextInt()%k == 0)
				counter++;
		}

		System.out.println(counter);
	}
}
