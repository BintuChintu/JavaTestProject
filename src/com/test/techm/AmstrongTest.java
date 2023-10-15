package com.test.techm;

import java.util.Scanner;

public class AmstrongTest {
	public static void main(String[] args) {
		int n,c;
		int temp=0;
		int r=0;
		Scanner scanner= new Scanner(System.in);	
		System.out.println("enter the number:");
		n = scanner.nextInt();
		int reserved=n;
	
while(n>0)
{
	r = n%10;
	n=n/10;
	temp = temp+r*r*r;
}
if(temp==reserved)
{
	System.out.println("number is amstrong...!");
}
else
{
	System.out.println("temp:"+temp+",number :"+n);
	System.out.println("number is not amstrong..!");
}
	}
}
