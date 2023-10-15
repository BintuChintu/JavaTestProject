package com.test.techm;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FindAgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the birth date:");
		//String birthDate = "05/01/1984";
		String birthDate = scanner.nextLine();
		String bDate[] = birthDate.split("/");
		
		int bday = Integer.parseInt(bDate[0]);
		int bMonth = Integer.parseInt(bDate[1]);
		int bYear = Integer.parseInt(bDate[2]);
		System.out.println("bday.........:"+bday);
		System.out.println("bMonth.........:"+bMonth);
		System.out.println("bYear.........:"+bYear);
		
		
		LocalDate dob = LocalDate.of(bYear, bMonth, bday);  
		LocalDate curDate = LocalDate.now(); 
		Period period = Period.between(dob, curDate);  
		System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  
	}

}
