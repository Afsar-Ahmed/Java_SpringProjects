package beans;

public class Airplane {
	private String type;
	private float wingspan;
	private String powerplant;
	private int crewSeats;
	private int passengerseats;
	private String avionics;
	private String customers;
	
	public Airplane(String type, float wingspan, String powerplant, int crewSeats, int passengerseats, String avionics,
			String customers) {
		super();
		this.type = type;
		this.wingspan = wingspan;
		this.powerplant = powerplant;
		this.crewSeats = crewSeats;
		this.passengerseats = passengerseats;
		this.avionics = avionics;
		this.customers = customers;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getWingspan() {
		return wingspan;
	}

	public void setWingspan(float wingspan) {
		this.wingspan = wingspan;
	}

	public String getPowerplant() {
		return powerplant;
	}

	public void setPowerplant(String powerplant) {
		this.powerplant = powerplant;
	}

	public int getCrewSeats() {
		return crewSeats;
	}

	public void setCrewSeats(int crewSeats) {
		this.crewSeats = crewSeats;
	}

	public int getPassengerseats() {
		return passengerseats;
	}

	public void setPassengerseats(int passengerseats) {
		this.passengerseats = passengerseats;
	}

	public String getAvionics() {
		return avionics;
	}

	public void setAvionics(String avionics) {
		this.avionics = avionics;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Airplane [type=" + type + ", wingspan=" + wingspan + ", powerplant=" + powerplant + ", crewSeats="
				+ crewSeats + ", passengerseats=" + passengerseats + ", avionics=" + avionics + ", customers="
				+ customers + "]";
	}
	
	
	
}
