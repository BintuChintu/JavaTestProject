package com.test.techm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateTest {

	public static void main(String[] args) {
		System.out.println("Duplicates removed string:"+removeDuplicates("hello how are u".toCharArray()));
	}

	public static String removeDuplicates(char strCharArr[]) {
		int index=0;
		for(int i=0;i<strCharArr.length;i++)
		{
			int j;
			for(j = 0;j<i;j++)
			{
				if(strCharArr[i] == strCharArr[j])
				{
					break;
				}
			}
			if(i==j)
			{
				strCharArr[index++] = strCharArr[i];
			}
		}
		return String.valueOf(Arrays.copyOf(strCharArr, index));
	}
}
