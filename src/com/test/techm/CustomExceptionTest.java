package com.test.techm;

public class CustomExceptionTest {

	public static void main(String[] args) {
		try {
			validateAge(13);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void  validateAge(int age) throws InvalidException
	{
		if(age<18)
		{
			throw new InvalidException("Not eligible for vote");
		}
	}

}
