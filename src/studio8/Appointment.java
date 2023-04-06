package studio8;

import java.util.Objects;

public class Appointment {
	
	private Date date;
	private Time time;
	
	public Appointment(Date initDate, Time initTime) {
		date = initDate;
		time = initTime;
	}
	
	public static void main (String[] args) {
		
		Appointment app1 = new Appointment(new Date(4, 4, 4), new Time(4, 4, true));
		
		Date d1 = new Date (4, 4, 4);
		Time t1 = new Time (4, 4, true);
		Appointment app2 = new Appointment (d1, t1);
		
		System.out.println(app1.equals(app2));
		
		
		//for-each loop for a toString to print out everything in a set? 
		//for(Appointment name: listy){now.toSTring();}
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	
	
	
	
	
	
	
	
	
	
}
