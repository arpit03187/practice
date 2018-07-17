package practice.ood;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeTest {
	public static void main(String[] args) {
		
//		Instant instant = Instant.now();
//		
//		LocalDateTime ldt = LocalDateTime.now();
//		
//		ZonedDateTime zdtNow = ZonedDateTime.now();
//		
//		System.out.println(instant);
//		System.out.println(ldt);
//		System.out.println(zdtNow);
		
		 	long ts = System.currentTimeMillis();
		    Date localTime = new Date(ts);
		    String format = "yyyy/MM/dd HH:mm:ss";
		    SimpleDateFormat sdf = new SimpleDateFormat(format);

		    // Convert Local Time to UTC (Works Fine)
		    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		    Date gmtTime = new Date(sdf.format(localTime));
		    System.out.println("Local:" + localTime.toString() + "," + localTime.getTime() + " --> UTC time:"
		            + gmtTime.toString() + "," + gmtTime.getTime());

		    // **** YOUR CODE **** END ****

		    // Convert UTC to Local Time
		    Date fromGmt = new Date(gmtTime.getTime() + TimeZone.getDefault().getOffset(localTime.getTime()));
		    System.out.println("UTC time:" + gmtTime.toString() + "," + gmtTime.getTime() + " --> Local:"
		            + fromGmt.toString() + "-" + fromGmt.getTime());
		
	}

}
