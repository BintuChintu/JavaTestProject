package com.test.techm;

import java.util.Scanner;

public class ReverseNum {
	
	public static void main(String[] args) {
		int n;
		int r,sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		n= scanner.nextInt();
		System.out.println("n value is:"+n);
		while(n!=0)
		{
			r = n%10;
			n=n/10;
			sum=sum*10+r;
		}
	System.out.println("Reversed number:"+sum);
	}

}
