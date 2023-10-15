package com.test.techm;

import java.util.Scanner;

public class PrimeTest {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n=scanner.nextInt();
		int count = 0;
		
		for(int j=1;j<=10;j++)
		{
			count =0;
			for(int i=1;i<=j;i++)
				{
					if(j%i == 0)
					{
						count++;
					}
				}
//			System.out.println("count value:"+count);
			if(count == 2)
			{
//				System.out.println("Given number is a prime number...!");
				System.out.println(j+" ");
			}
//			else
//			{
//				System.out.println("Given number is not a prime number...!");
//			}
		}
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i == 0)
//			{
//				count++;
//			}
//		}
//		//System.out.println("count value:"+count);
//		if(count == 2)
//		{
//			System.out.println("Given number is a prime number...!");
//		}
//		else
//		{
//			System.out.println("Given number is not a prime number...!");
//		}
	}
}
