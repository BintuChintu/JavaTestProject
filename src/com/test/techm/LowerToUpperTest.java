package com.test.techm;

public class LowerToUpperTest {

	public static void main(String[] args) {
	
		System.out.println("Resultant string:"+lowerToUpper("This Is My name"));
	}
	
	public static String lowerToUpper(String dataStr)
	{
		String strArr[] = dataStr.split("\\s");
		String resStr="";
		for(String word:strArr)
		{
			for(int i=0;i<word.length();i++)
			{
				char ch = word.charAt(i);
				if(Character.isUpperCase(ch))
				{
					resStr = resStr+Character.toLowerCase(ch);
				}
				else
				{
					resStr = resStr+Character.toUpperCase(ch);
				}
				
			}
			resStr = resStr+" ";
		}
		return resStr.trim();
	}
}
