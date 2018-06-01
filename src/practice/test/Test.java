package practice.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.ExecutionException;

public class Test {

	public static void main(String... args) throws InterruptedException, ExecutionException {

		LocalDateTime localDate = LocalDateTime.now();
		localDate.plusMinutes(15);
		// System.out.println(localDate.plusMinutes(15));
		
		LocalTime localTime = LocalTime.now();
		LocalTime timeafterminutes = localTime.plusMinutes(15);
		System.out.println(localTime);
		System.out.println(timeafterminutes);
	}
}