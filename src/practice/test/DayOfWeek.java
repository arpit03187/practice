package practice.test;

import java.time.LocalDate;

public class DayOfWeek {
	
	public static void main(String[] args) {
		System.out.println(getDay("08", "05", "2015"));
	}

	public static String getDay(String d, String m, String y) {
		
		LocalDate localDate = LocalDate.of(Integer.parseInt(y), Integer.parseInt(m), Integer.parseInt(d));
		return localDate.getDayOfWeek().toString();
		
	}
}
