package com.test.techm;

import java.util.Scanner;

public class FabonaciSeriesTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scanner.nextInt();
		int n1=0,n2=1,temp=0;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
//		while((n1+n2)<n)
//		{
//			temp = n1+n2;
//			System.out.print(temp+" ");
//			n1=n2;n2=temp;
//		}
		
		for(int i=2;i<n;i++)
		{
			temp = n1+n2;
			System.out.print(temp+" ");
			n1=n2;n2=temp;
		}
	}
}
