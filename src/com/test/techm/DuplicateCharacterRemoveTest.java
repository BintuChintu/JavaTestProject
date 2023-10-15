package com.test.techm;

import java.util.Arrays;

public class DuplicateCharacterRemoveTest {
	
	public static String removeDuplicates(char ch[])
	{
		int index=0;
		for(int i=0;i<ch.length;i++)
		{
			int j;
			for( j=0;j<i;j++)
			{
				if(ch[i] == ch[j])
				{
					break;
				}
			}
			if(i==j)
			{
				ch[index++] = ch[i];
			}
		}
		
		return String.valueOf(Arrays.copyOf(ch, index));
	}
	
	public static void main(String[] args) {
		char ch[] = "level".toCharArray();
		System.out.println("resultant string:"+removeDuplicates(ch));
	}

}
