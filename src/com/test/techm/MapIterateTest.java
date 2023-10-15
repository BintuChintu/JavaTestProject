package com.test.techm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.xml.sax.HandlerBase;

public class MapIterateTest {

	public static void main(String[] args) {
		Map<String,Integer> dataMap = new HashMap<String,Integer>();
		dataMap.put("ramu", 123);
		dataMap.put("ramu1", 1234);
		dataMap.put("ramu2", 1235);
// Method-1 using iterator		
//		Iterator<String> iterator = dataMap.keySet().iterator();
//		while(iterator.hasNext())
//		{
//			String key = iterator.next();
//			System.out.println(key+":"+dataMap.get(key));
//		}
//Method-2 with entry set		
		Set<Entry<String, Integer>> entries = dataMap.entrySet();
		for(Entry<String, Integer> entry:entries) 
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
//Method-3		
//		for(Map.Entry<String, Integer> mapEntry:dataMap.entrySet())
//		{
//			System.out.println(mapEntry.getKey()+":"+mapEntry.getValue());
//		}
//		
//		
//		Set<String> data = new HashSet<String>();
//		//List<String> data = new ArrayList<String>();
//		data.add("Ramu");
//		data.add("Rani");
//		data.add("rakhi");
//		System.out.println("data set:"+((Map<String, Integer>) data).get(1));
		//Iterator ite = data.iterator();
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		
		//		for(String str:data)
//		{
//			System.out.println(str);
//		}
	}		

}
