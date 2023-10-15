package com.test.techm;

import java.util.ArrayList;
import java.util.List;

public class Consest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dataStr = "heoolloo";
		char dataArr[] = dataStr.toCharArray();
		
		List<String> dataList = new ArrayList<String>();
		
		int count =1;
		char current = dataArr[0];
		for(int i=1;i<dataArr.length;i++)
		{
			char c = dataArr[i];
			if(current == c)
			{
				count++;
			}
			else
			{
				//dataList.add(current+":"+count);
				System.out.print(current+""+count);
				current = c;
				count = 1;
			}
		}
		//dataList.add(current+":"+count);
		System.out.print(current+""+count);
		//System.out.println(dataList);

	}

}
