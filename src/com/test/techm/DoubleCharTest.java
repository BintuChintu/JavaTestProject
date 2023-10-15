package com.test.techm;

public class DoubleCharTest {

	public static void main(String[] args) {
	
		String dataStr = "Hi";
		String result="";
		for(int i=0;i<dataStr.length();i++)
		{
			result = result+dataStr.charAt(i)+dataStr.charAt(i);
		}
		System.out.println("result:"+result);
	}

}
