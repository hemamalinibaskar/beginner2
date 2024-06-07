package BusProj;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	
	String passengerName;
	int busNo;
	Date date;
	String city;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Passenger Name: ");
		passengerName = scanner.next();
		
		System.out.println("Enter the Bus No: ");
		busNo = scanner.nextInt();
		
		
		System.out.println("Enter the Date(dd-mm-yyyy): ");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);//date format
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter the City: ");
		city = scanner.next();
		
		}
	public boolean isAvailable(ArrayList<Booking> Bookings, ArrayList<Bus> Buses){
		int capacity = 0;
		
		for(Bus bus: Buses) {
			if(bus.getbusNo() == busNo) 
				capacity = bus.getcapacity();
			}
			int booked = 0;
			
			for(Booking b: Bookings) {
				if(b.busNo == busNo && b.date.equals(date)) {//equals method is used
					booked++;
					}
			}
		return booked<capacity?true:false;
}
	}
