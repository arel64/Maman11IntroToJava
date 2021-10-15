import java.util.Scanner;

/*
    Class Name: Milliseconds
    Author: Arel Sharon
    Date: 15/10/2021
    Description:
    This class converts any millisecond amount over 1000 to the following format:
    d_days_h:m:s_hours (Whereas _ is a whitespace)
 */
public class Milliseconds {

    public static void main(String[] args) {
        //Constants
	    final int MILLISECONDS_IN_SECOND = 1000;
	    final int MILLISECONDS_IN_MINUTE = MILLISECONDS_IN_SECOND * 60;
	    final int MILLISECONDS_IN_HOUR = MILLISECONDS_IN_MINUTE * 60;
	    final int MILLISECONDS_IN_DAY = MILLISECONDS_IN_HOUR * 24;

        //Declarations
        int days,hours,minutes,seconds;
        Scanner scan = new Scanner(System.in);

        //Introduction and input scanning
        System.out.println ("This program reads an integer which " +
                "represents Milliseconds and converts it to days, " +
                "hours, minutes and seconds. ");
        System.out.println ("Please enter the number of Milliseconds");
        long ms = scan.nextLong(); //Assuming ms > 1000

        /*
            Extract the amount of each "Time units"(Days,hours,minutes,seconds) from the given ms
            by dividing by the amount of seconds in the current time unit(casting down to int) and
            reducing the amount of milliseconds left
        */
        days = (int) ms/MILLISECONDS_IN_DAY;
        ms -= days * MILLISECONDS_IN_DAY;

        hours = (int) ms/MILLISECONDS_IN_HOUR;
        ms -= hours * MILLISECONDS_IN_HOUR;

        minutes = (int) ms/MILLISECONDS_IN_MINUTE;
        ms -= minutes * MILLISECONDS_IN_MINUTE;

        seconds = (int) ms/1000; // Convert remaining ms to seconds, partial seconds are ignored

        System.out.println(days + " days " + hours+":"+minutes+":"+seconds+" hours" );
    }// end of method main
} //end of class Milliseconds

