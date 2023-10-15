package com.test.techm;

import java.util.HashMap;
import java.util.Map;

public class BtoomLineTest {

	public static void main(String[] args) {
        //System.out.println("Hello, World!");
        
        String str = "(])]}";
        Map<String,Integer> dataMap = new HashMap<String,Integer>();
        int count = 1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) =='(')
            {
                if(dataMap.containsKey(str.charAt(i)))
                {
                    dataMap.put("openbrace",dataMap.get("openbrace")+1);
                }
                else
                {
                    dataMap.put("openbrace",count);
                }
            }
            else if(str.charAt(i) ==']')
            {
                if(dataMap.containsKey("closesquare"))
                {
                    dataMap.put("closesquare",dataMap.get("closesquare")+1);
                }
                else
                {
                    dataMap.put("closesquare",count);
                }
            }
            else if(str.charAt(i) =='[')
            {
                if(dataMap.containsKey("opensquare"))
                {
                    dataMap.put("opensquare",dataMap.get("opensquare")+1);
                }
                else
                {
                    dataMap.put("opensquare",count);
                }
            }
            else if(str.charAt(i) ==')')
            {
                if(dataMap.containsKey("closebrace"))
                {
                    dataMap.put("closebrace",dataMap.get("closebrace")+1);
                }
                else
                {
                    dataMap.put("closebrace",count);
                }
            }
            else if(str.charAt(i) =='{')
            {
                if(dataMap.containsKey("opencurlybrace"))
                {
                    dataMap.put("opencurlybrace",dataMap.get(dataMap)+1);
                }
                else
                {
                    dataMap.put("opencurlybrace",count);
                }
            }
            else
            {
                if(dataMap.containsKey("closecurlybrace"))
                {
                    dataMap.put("closecurlybrace",dataMap.get(dataMap)+1);
                }
                else
                {
                    dataMap.put("closecurlybrace",count);
                }
            }
        }
    System.out.println(dataMap);
    if((dataMap.get("openbrace") == dataMap.get("closebrace")) && (dataMap.get("opensquare") == dataMap.get("closesquare")) && (dataMap.get("opensquare") == dataMap.get("closesquare")))
    {
    	
    }
    
    }
}
