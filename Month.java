/**
 * COMP 2150 Summer 2022 Assignment 1 Question 1
 */
/*
SO basically
Month[] month = values(); //This will store all the values of enum month in Month
month.toString will print the month number from (0-11)
month.fromInt(2) will print from the values 1 onwards
 */
public enum Month {
	// this should probably use the Java Calendar class instead
	
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;

	private static final String[] NAMES = {
		"January",
		"February",
		"March",
		"April",
		"May",
		"June",
		"July",
		"August",
		"September",
		"October",
		"November",
		"December"
	};

	public String toString() {
		return NAMES[ordinal()];
	}
	
	public static Month fromInt(int i) {
		assert i >= 0 && i <= 11;
		return Month.values()[i];
	}
}
