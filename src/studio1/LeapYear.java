package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Year:");
		int year = in.nextInt();
		boolean four = (year % 4 == 0);
		boolean hundred = (year % 100 != 0);
		boolean baseLeapYear = four && hundred;
		boolean specialLeapYear = (year % 400 == 0);
		boolean isLeapYear = baseLeapYear || specialLeapYear;
		System.out.println(year + " is a leap year: " + isLeapYear);
		
	}

}
