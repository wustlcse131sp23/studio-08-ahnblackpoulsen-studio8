package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean format;
	
	public Time (int initHour, int initMinute, boolean initFormat) {
		hour = initHour;
		minute = initMinute;
		format = initFormat;
	}
	
	public Time() {
		hour = 0;
		minute = 0;
		format = true;
	}
	
	public String toString() {
		String stringy = this.hour + ":" + this.minute;
		return stringy;
	}
	
	
	
	public static void main(String[] args) {
 
		Time time1 = new Time(12, 33, true);
		System.out.println(time1.toString());
		
		Time timeOne = new Time(12, 33, true);
		System.out.println(timeOne.toString());
		
		System.out.println(time1.equals(timeOne));
		
		
		
		
		
		
		
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}