package com.test.techm;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DOBTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the DOB:");
		String dob = scanner.nextLine();
		String bdate[] = dob.split("/");
		int bday = Integer.parseInt(bdate[0]);
		int bMonth = Integer.parseInt(bdate[1]);
		int byear = Integer.parseInt(bdate[2]);
		System.out.println("bday:"+bday);
		System.out.println("bMonth:"+bMonth);
		System.out.println("bYear:"+byear);
		LocalDate lbod = LocalDate.of(byear, bMonth, bday);
		LocalDate cdate = LocalDate.now();
		Period period = Period.between(lbod, cdate);
		System.out.println("Age :"+period.getYears()+"years "+period.getMonths()+"Months "+period.getDays()+"Days ");
	}

}
