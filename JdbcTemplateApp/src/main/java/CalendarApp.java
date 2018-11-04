import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CalendarApp {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println(c.getTime());
		System.out.println(c.getCalendarType());
		System.out.println(c.getTimeZone());
		
		Date date = c.getTime();
		//int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int year = c.get(Calendar.YEAR);
		
		// Months are indexed from 0 - 11
		// 0 -> January 11-> December
		
		System.out.println("Using Calendar:\n=============================");
		SimpleDateFormat sdf=new SimpleDateFormat("MMM");
		String currentTime = sdf.format(c.getTime());
		
		System.out.println("Current month:"+currentTime);
		System.out.println("Today dd-mm-yyyy hh:mm ==> "+day+"-"+currentTime+"-"+year+" "+hour+":"+minute);
		System.out.println();
		
		
		System.out.println("Using Java 8 LocalDateTime:\n=============================");		
		DateTimeFormatter ldFormater=DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		LocalDateTime today=LocalDateTime.now();	
		
		String formatedToday = today.format(ldFormater);
		System.out.println("Today: "+formatedToday);
		
		int month=today.getMonthValue();
		//System.out.println("Today: "+month);
		
		LocalDateTime yesterday=LocalDateTime.of(2018, Month.OCTOBER, 15, 4, 30);
		String yesterdayDate=yesterday.format(ldFormater);
		System.out.println("Yesterday was:"+yesterdayDate);
		
		
		Duration duration=Duration.between(yesterday, today);
		System.out.println("Number of Days: "+duration.toDays());
		
		//Period period=Period.between(yesterday, today); // accepts LocalDate values
		 // System.out.print(period.getYears() + " years,");
	      //  System.out.print(period.getMonths() + " months,");
	       // System.out.print(period.getDays() + " days");
	
		String str1="Hi";
		change(str1);
		System.out.println("Changed str1:"+str1);
		
		StringBuilder str2=new StringBuilder("Hi");
		change(str2);
		System.out.println("Changed str2:"+str2);
		
		

		List<String> items=new ArrayList<>();
		items.add("PC");
		items.add("TV");
		items.add("Printer");
		items.add("mobile");
		
	      items.stream().forEach(System.out::println);
		//what is the index of "printer"
		
		System.out.println("\nIndex of Printer:"+items.indexOf("Printer"));
		
		//update Printer with Printing Machine
		
		items.set(items.indexOf("Printer"), "Printing Machine");
		System.out.println("\nAfter Update:");
		 items.stream().forEach(System.out::println);

		

	}
	
	public static void change(StringBuilder str) {
		str.delete(0, 2).append(" there");
	}
	
	public static void change(String str) {
		str="there";
	}
	
	
	

}
