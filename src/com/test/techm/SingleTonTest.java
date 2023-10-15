package com.test.techm;

public class SingleTonTest {

	public static void main(String[] args) {
		
		
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();
		System.out.println("s1 hashcode:"+s1.hashCode());
		System.out.println("s2 hashcode:"+s2.hashCode());
		System.out.println("s3 hashcode:"+s3.hashCode());
	}

}
