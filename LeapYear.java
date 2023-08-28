// Java program to find a leap year
import java.io.*;

public class LeapYear {

	public static void isLeapYear(int year)
	{

		boolean is_leap_year = false;


		if (year % 4 == 0) {
			is_leap_year = true;

			// To identify whether it is a
			// century year or not
			if (year % 100 == 0) {
				// Checking if year is divisible by 400
				// therefore century leap year
				if (year % 400 == 0)
					is_leap_year = true;
				else
					is_leap_year = false;
			}
		}

		else

			// Flag dealing- Non leap-year
			is_leap_year = false;

		if (!is_leap_year)
			System.out.println(year + " : Non Leap-year");
		else
			System.out.println(year + " : Leap-year");
	}


	public static void main(String[] args)
	{
		isLeapYear(2000);

		isLeapYear(2002);
	}
}
