package com;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		//System.out.println(date);
		
		LocalDateTime date1=LocalDateTime.now();
		//System.out.println(date1);
		
		LocalDate myDate=LocalDate.of(1987, 12, 15);
		System.out.println(myDate);
		LocalDate newDate = myDate.plusDays(10);
		System.out.println(newDate);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
