
public abstract class AbstractAirplaneBuilder {
//abstract class for creating airplanes
//Specifications on what we need to build airplanes
	
	protected Airplane airplane;
	protected String type;
	protected String customers;
	
	public Airplane getAirplane() {
		return airplane;
	}
	
	public void newAirplane() {
		airplane =  new Airplane(customers,type);
	}
	
	public abstract void buildwings();
	public abstract void buildPowerPlant();
	public abstract void buildAvionics();
	public abstract void buildSeats();
	
}
