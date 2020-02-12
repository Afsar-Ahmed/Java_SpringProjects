
public class Director {
private AbstractAirplaneBuilder apb;


public void setAirplaneBuilder(AbstractAirplaneBuilder ab) {
	apb=ab;
}
public Airplane getAirplaneBulider() {
	return apb.getAirplane();
}

public void constructAirplane() {
	apb.buildAvionics();
	apb.buildPowerPlant();
	apb.buildSeats();
	apb.buildwings();
}
}
