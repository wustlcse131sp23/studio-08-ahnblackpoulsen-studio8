package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
    private boolean holiday;
	
	public Date(int initMonth, int initDay, int initYear) {
		month = initMonth;
		day = initDay;
		year = initYear;
	}
	
	public Date() {
		month = 1;
		day = 1;
		year = 2003;
	}
	
	public String toString() {
		String stringy = this.month + "/" + this.day + "/" + this.year;
		return stringy;
	}
	
	
	
	public static void main(String[] args) {

    	Date date1 = new Date(4, 6, 2023);
    	System.out.println(date1.toString());
    	Date dateOne = new Date(4, 6, 2023);
    	Date date2 = new Date(4, 5, 2023);
    	
    	System.out.println(date1.toString()==dateOne.toString());
    	System.out.println(date1.toString().equals(dateOne.toString()));
    	
    	System.out.println(date1.equals(dateOne));
    	
    	Date date3 = new Date(2, 26, 2003);
    	Date date4 = new Date(12, 30, 2002);
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	
    	list.add(date1);
    	list.add(dateOne);
    	list.add(date2);
    	list.add(date3);
    	list.add(date4);
    	
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(date1);
    	set.add(dateOne);
    	set.add(date2);
    	set.add(date3);
    	set.add(date4);
    	System.out.println(set);
    	
    	
    	
    	
    	
    	
    	
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
