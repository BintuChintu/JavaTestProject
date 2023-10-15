package com.test.techm;

import java.util.Arrays;

public class DuplicTest {
	
	public static void main(String[] args) {
		System.out.println("resultant:"+removeDuplicate("hello".toCharArray()));
	}
	public static String removeDuplicate(char data[])
	{
		int index=0;
		
		for(int i=0;i<data.length;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(data[i] == data[j] )
				{
					break;
				}
			}
			if(i==j)
			{
				data[index++] = data[i];
			}
		}
		
		return String.valueOf(Arrays.copyOf(data, index));
	}

}
