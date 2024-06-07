package BusProj;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity;
	private String city;
	
	Bus(int BusNo, boolean Ac, int Capacity, String City ){
		this.busNo = BusNo;
		this.ac = Ac;
		this.capacity = Capacity;
		this.city = City;
				
	}
	
	public int getbusNo() {
		return busNo;
	}
	
	public boolean getac() {
		return ac;
	}
	
	public void setac(boolean val) {
		ac = val;
	}
	
	public int getcapacity() { //accessor
		return capacity;
	}
	
	public void setcapacity(int cap) { //mutator
		cap = capacity;
	}
	
	public String getcity() {
		return city;
	}
	
	public void setcity(String place) {
		city = place;
	}
	
	public void displayBusInfo() {
		System.out.println("Busno: "+ busNo+" Ac: "+ ac+" Capacity: "+capacity+" City: "+city);
	}

}
