package com.test.techm;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number value:");
		int n= scanner.nextInt();
		int fact =1;
		System.out.println("Factorial value :"+fact(n));
//		for(int i=1;i<=n;i++)
//		{
//			fact = fact*i;
//		}
//		System.out.println("Factorial value of given number is:"+fact);
		
		}
	public static int fact(int i)
	{
		if(i==0)
		{
			return 1;
		}
		else
		{
		return  i*fact(i-1);
		}
	}
}
