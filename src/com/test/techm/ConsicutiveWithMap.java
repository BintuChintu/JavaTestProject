package com.test.techm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConsicutiveWithMap {
	
	public static void main(String[] args) {
		
		String dataStr = "heoollo";
		Map<Character,Integer> dataMap = new LinkedHashMap<Character,Integer>();
		int count = 1;
		char dataArr[] = dataStr.toCharArray();
		for(int i=0;i<dataArr.length;i++)
		{
			if(dataMap.containsKey(dataArr[i]))
			{
				dataMap.put(dataArr[i], dataMap.get(dataArr[i])+1);
			}
			else
			{
				dataMap.put(dataArr[i], count);
			}
		}
		System.out.println("dataMap:"+dataMap);
		
		Iterator iterate = dataMap.keySet().iterator();
		while(iterate.hasNext())
		{
			//System.out.println("key:"+iterate.next());
			Character key= (Character) iterate.next();
			System.out.print(key+""+dataMap.get(key));
		}
	}

}
