package com.test.techm;

public class SingleTon {
	
	// Static variable reference of SingleTon of type Singleton
	private static SingleTon singleTon = null;
	
	// Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
	private SingleTon() {}
	
	// Static method
    // Static method to create instance of Singleton class
	public static synchronized SingleTon getInstance()
	{
		if(singleTon == null)
		{
			singleTon = new SingleTon();
		}
		return singleTon;
	}

}
