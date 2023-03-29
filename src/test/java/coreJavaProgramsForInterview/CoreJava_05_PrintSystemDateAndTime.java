package coreJavaProgramsForInterview;
/***************************************
 * Program: Print System Date And Time (TimeStamp)
 * Written by: Sreenivas from www.h2otestingtools.com
 * 
 * *************************************/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CoreJava_05_PrintSystemDateAndTime {

	public static void main(String[] args) {
		// Method: 1
		Date d = new Date();
		System.out.println("Method 1 : ");
		System.out.println(d);

		// Create customised date format and convert system date to u r own format
		// MMMddyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);

		System.out.println("");
		System.out.println("****************");
		// Method: 2
		long currentTimeInMillis = System.currentTimeMillis();
		Date today = new Date(currentTimeInMillis);
		System.out.println("Method 2 :  ");
		System.out.println(today);
		
		System.out.println("");
		System.out.println("****************");
		// Method: 3
		Calendar cal = Calendar.getInstance();
		today = cal.getTime();
		System.out.println("Method 3 :  ");
		System.out.println(today);

	}

}
