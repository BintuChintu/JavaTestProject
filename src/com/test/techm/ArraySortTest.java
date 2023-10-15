package com.test.techm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySortTest {
	public static void main(String[] args) {

		int dataArr[] = { 10, 2, 45, -75, 15, 23 };
//	Arrays.sort(dataArr);
//	for(int i=0;i<dataArr.length;i++)
//	{
//		System.out.print(dataArr[i]+" ");
//	}
		// System.out.println("Sorted array:"+Arrays.sort(dataArr););

		int temp = 0;
		for(int i=0;i<dataArr.length;i++)
		{
			for(int j=i+1;j<dataArr.length;j++)
			{
				if(dataArr[i]>dataArr[j])
				{
					temp = dataArr[i];
					dataArr[i] = dataArr[j];
					dataArr[j] = temp;
				}
			}
		}
		System.out.println("sorted array:"+Arrays.toString(dataArr));
		for(int i=0;i<dataArr.length;i++)
		{
			System.out.print(dataArr[i]+" ");
		}
	}
}
