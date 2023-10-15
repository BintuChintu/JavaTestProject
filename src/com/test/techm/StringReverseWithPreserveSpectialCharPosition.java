package com.test.techm;

public class StringReverseWithPreserveSpectialCharPosition {

	public static void main(String[] args) {

		String dataStr = "Ra!vi@kuma@r";
		
		char dataArr[] = dataStr.toCharArray();
		char resultArr[] = new char[dataArr.length];
		
		for(int i=0;i<resultArr.length;i++)
		{
			if(!(Character.isAlphabetic(dataArr[i])))
			{
				resultArr[i] = dataArr[i];
			}
		}
		System.out.println("input string:"+dataStr);
		System.out.println("input string length:"+dataArr.length);
		System.out.println("Result:"+new String(resultArr));
		int j=resultArr.length-1;
		System.out.println("J length:"+j);
		for(int i=0; i<dataArr.length;i++)
		{
			System.out.println("....................dataArr char:"+dataArr[i]);
			if(Character.isAlphabetic(dataArr[i]))
			{
				
				if(!(String.valueOf(resultArr[j]).isEmpty()))
				{
					System.out.println(",,,,,,,,,,,,,,,,,,,,resultArr char:"+resultArr[j]);
					j--;
				}
			}
			resultArr[j] = dataArr[i];  
             j--;  
             System.out.println("Result2:"+new String(resultArr));
		}
		//System.out.println("Result2:"+new String(resultArr));
	}
	
//	static void reverseString(String input) {  
//		   
//        char[] inputArray = input.toCharArray();  
//        char[] result = new char[inputArray.length];  
//   
//        for (int i = 0; i < inputArray.length; i++) {  
//            if (inputArray[i] == ' ') {  
//                result[i] = ' ';  
//            }  
//        }  
//   
//        int j = result.length - 1;  
//   
//        for (int i = 0; i < inputArray.length; i++) {  
//            if (inputArray[i] != ' ') {  
//                if (result[j] == ' ') {  
//                    j--;  
//                }  
//                result[j] = inputArray[i];  
//                j--;  
//            }  
//        }  
//        System.out.println(input + " --> " + String.valueOf(result));  
//    }  
//   
//    public static void main(String[] args) {  
//        reverseString("India Is my country");  
//    }  

}
