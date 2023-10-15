package com.test.techm;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String data = "My name is Ravi";
		System.out.println("Reversed string :"+ReverseEachWord.eachWordReverse(data));
	}
	public static String eachWordReverse(String dataStr)
	{
		String reverseWord = "";
		String dataArr[] = dataStr.split("\\s");
		for(int i=0;i<dataArr.length;i++)
		{
		StringBuilder sb = new StringBuilder(dataArr[i]);
		reverseWord = reverseWord.concat(sb.reverse().toString())+" ";
		}
		return reverseWord.trim();
	}
	
}
