package com.test.techm;



public class CharTypeCheckTest {
	public static void main(String[] args) {
		String dataStr= "ae3@123";
		for(int i=0;i<dataStr.length();i++)
		{
			if(Character.isAlphabetic(dataStr.charAt(i)))
			{
				System.out.println(dataStr.charAt(i)+" :"+"character");
			}
			else if(Character.isDigit(dataStr.charAt(i)))
			{
				System.out.println(dataStr.charAt(i)+" :"+"digit");
			}
			else
			{
				System.out.println(dataStr.charAt(i)+" :"+"special character");
			}
		}
	}
}
