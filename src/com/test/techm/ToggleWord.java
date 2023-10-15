package com.test.techm;

public class ToggleWord {
public static void main(String[] args) {
	String data = "my name is Ravi";
	System.out.println("toggeled string:"+ToggleWord.toggleWord(data));
}

public static String toggleWord(String dataStr)
{
	String resStr="";
	String dataStrArr[] = dataStr.split("\\s");
	for(String word:dataStrArr)
	{
		String firstStr = word.substring(0,1);
		String secStr = word.substring(1);
		System.out.println(firstStr+" : "+secStr);
		resStr = resStr+firstStr.toLowerCase().concat(secStr.toUpperCase())+" ";
	}
	return resStr.trim();
}
}
