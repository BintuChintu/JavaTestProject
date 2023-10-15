package com.test.techm;

public class Cat extends Animal{
	
	Cat()
	{
		//super();
		this("hellp");
		String color  = "brown";
		System.out.println("..........this is cat class constructor.............");
		System.out.println("colour:"+super.color);
		System.out.println("colour:"+color);
	}
	
	Cat(String name)
	{
		//super();
		
		String color  = "brown";
		System.out.println("..........this is cat class constructor.............");
		System.out.println("colour:"+color);
		System.out.println("colour:"+color);
	}

}
