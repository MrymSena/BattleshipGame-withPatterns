package ShipsBuilder;

public class BoatBuilder {
	private ShipBuilder shipBuilder;
	
	public BoatBuilder(ShipBuilder shipBuilder){
		this.shipBuilder=shipBuilder;
		
	}
	public Ship construct(){
		shipBuilder.setName("Boat");
		shipBuilder.setSize(1);
		return shipBuilder.getResult();
	}
}

