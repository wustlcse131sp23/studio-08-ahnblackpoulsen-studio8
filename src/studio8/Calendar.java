package studio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calendar {

	private Appointment appointment;
	private List<Appointment> listy = new ArrayList<Appointment>();
	
	public Calendar (Appointment initApp) {
		appointment = initApp;
		listy.add(appointment);
	}

	public String toString() {
		System.out.println(listy);
		return "";
	}
	
	public static void main (String[] args) {
		
		Date d1 = new Date (4, 4, 4);
		Time t1 = new Time (4, 4, true);
		Appointment a1 = new Appointment(d1, t1);
	
		
		Calendar c1 = new Calendar (a1);
		System.out.println(c1.toString());

		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(appointment, listy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		return Objects.equals(appointment, other.appointment) && Objects.equals(listy, other.listy);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
