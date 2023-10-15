package com.test.techm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringCharactersCount {

	public static void main(String[] args) {
	String dataStr = "ravikumar mogulluru";
	Map<Character,Integer> dataMap = new HashMap<>();
	int count = 1;
	char ch[] = dataStr.toCharArray();
	
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i] == ' ')
		{
			continue;
		}
		else if(dataMap.containsKey(ch[i]))
		{
			dataMap.put(ch[i], dataMap.get(ch[i])+1);
		}
		else
		{
			dataMap.put(ch[i], count);
		}
	}
	
	Iterator<Character> iterate = dataMap.keySet().iterator();
	while(iterate.hasNext())
	{
		Character chKey = iterate.next();
		System.out.println(chKey+":"+dataMap.get(chKey));
	}
	
	}

}
