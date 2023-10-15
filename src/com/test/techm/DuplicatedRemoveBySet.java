package com.test.techm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatedRemoveBySet {

	public static void main(String[] args) {
		
		String dataStr = "hello how are u";
		Set<Character> dataSet = new LinkedHashSet<Character>();
		char dataChar[] = dataStr.toCharArray();
		for(Character ch:dataChar)
		{
			dataSet.add(ch);
		}
		for(Character ch:dataSet)
		{
			System.out.print(ch);
		}
		
	}

}
