package task3.task3;
import java.util.*;
public class TimeConversion{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input the number of minutes: ");
	        int min = sc.nextInt();
	        int yearDayHourMin[] = yearDayHourMinCount(min);
	        System.out.println(yearDayHourMin[0] + " Years " + yearDayHourMin[1] + " Days " + yearDayHourMin[2]
	                + " Hours and " + yearDayHourMin[3] + " Minutes");
	    }
	    static int minInYear = 60 * 24 * 365;
	    static int minInDay = 60 * 24;
	    static int minInHour = 60;
	    static int[] yearDayHourMinCount(int min) {
	        int yearDayHourMin[] = new int[4];
	        if (min > minInYear) {
	            int years = min / minInYear;
	            min = min - years * minInYear;
	            yearDayHourMin[0] = years;
	        }
	        if (min > minInDay) {
	            int days = min / minInDay;
	            min = min - days * minInDay;
	            yearDayHourMin[1] = days;
	        }
	        if (min > minInHour) {
	            int hours = min / minInHour;
	            min = min - hours * minInHour;
	            yearDayHourMin[2] = hours;
	        }
	        yearDayHourMin[3] = min;
	        return yearDayHourMin;
	    }
	}