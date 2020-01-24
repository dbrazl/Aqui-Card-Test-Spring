package com.aquicard.src.Entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Time {
	
	public static String getTime(int id) {
		switch(id) {
			case 1:
				String dateTest3First = "2000-02-15";
				String dateTest3Second = "2000-10-15";
				return distanceBetweenDates(dateTest3First, dateTest3Second);
			
			case 2:
				String dateTest4First = "2001-02-15";
				String dateTest4Second = "2001-10-15";
				return distanceBetweenDates(dateTest4First, dateTest4Second);
			
			case 3:
				String dateTest5First = "1900-02-15";
				String dateTest5Second = "1900-10-15";
				return distanceBetweenDates(dateTest5First, dateTest5Second);
			
			case 4:
				String dateTest6First = "1582-02-15";
				String dateTest6Second = "1582-10-15";
				return distanceBetweenDates(dateTest6First, dateTest6Second);
			
			default:
				return null;
		}
	}
	
	private static String distanceBetweenDates(String first_date, String second_date ) {
		String[] date1 = first_date.split("-");
		String[] date2 = second_date.split("-");
		
		LocalDate firstDate = LocalDate.of(Integer.parseInt(date1[0]), Integer.parseInt(date1[1]), Integer.parseInt(date1[2]));
		LocalDate secondDate = LocalDate.of(Integer.parseInt(date2[0]), Integer.parseInt(date2[1]), Integer.parseInt(date2[2]));
		
		String daysFormatted = ChronoUnit.DAYS.between(firstDate, secondDate) + " dias";
		return daysFormatted;
	}
}
