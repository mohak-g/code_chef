package com.mohak.begin;

import java.text.DecimalFormat;
import java.util.Scanner;

class ATM {
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		double bal = sc.nextDouble();	
		DecimalFormat df = new DecimalFormat("#.00");
		sc.close();
		
		if(amt%5==0 && bal >= amt + 0.5)
		{
			bal = bal - amt - 0.5;
		}
		
		System.out.println(df.format(bal));
	}
}
