package BusProj;
import java.util.*;
import java.util.ArrayList;

public class BusResv {
	public static void main(String[] args) {
		
		ArrayList<Bus> Buses = new ArrayList<Bus>();
		ArrayList<Booking> Bookings = new ArrayList<Booking>();
		
		Buses.add(new Bus(5001,true,2,"Chennai"));
		Buses.add(new Bus(5002,true,3,"Trichy"));
		Buses.add(new Bus(5003,false,3,"Chennai"));
		Buses.add(new Bus(5004,false,2,"Trichy"));
		
		int userInput = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(Bus b:Buses) {
			b.displayBusInfo();
		}
			
		while(userInput == 1) {
			System.out.println("Enter 1 for booking 2 to exit");
			userInput = scanner.nextInt();
		
			if(userInput == 1) {
				Booking booking = new Booking();
			
				if(booking.isAvailable(Bookings,Buses)) {
					Bookings.add(booking);
					System.out.println("Your Booking is confirmed");
				}
				else {
					System.out.println("Sorry! Bus is full, Try another Bus or Date");
				}
		
		}
		
	}

	}
}
