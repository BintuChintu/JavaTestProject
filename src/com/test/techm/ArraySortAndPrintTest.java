package com.test.techm;

import java.util.Arrays;

public class ArraySortAndPrintTest {
	
	public static void main(String[] args) {
		int arr[] = {1,0,0,1,1,0,0};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array:"+"{"+Arrays.toString(arr).substring(1,Arrays.toString(arr).length()-1)+"}");
	}
	
}
