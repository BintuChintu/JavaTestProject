package com.test.techm;

public final class ImmutableTest {
	
	private String name;
	private int rollNumber;
	
	public ImmutableTest(String name,int rollNumber)
	{
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public String getName()
	{
		return name;
	}
	public int getRollNumber()
	{
		return rollNumber;
	}
}
