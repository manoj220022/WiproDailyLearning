package com.java8faetures;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Time_Api_Ex {

	public static void main(String[] args) {

		
		LocalTime today = LocalTime.now();
		System.out.println(today);
		
		LocalDate localdate = LocalDate.now();
		System.out.println(localdate);
		
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdatetime);
		
		
		LocalDate birthday = LocalDate.of(2021, 5, 25);
		Period ageDiff = Period.between(birthday, localdate);
		System.out.println(ageDiff.getYears());
		
		LocalTime start = LocalTime.of(9, 50);
		LocalTime end = LocalTime.of(10, 50);
		Duration d = Duration.between(start,end);
		System.out.println(d.toMinutes());
		
	}

}
