package ShipsBuilder;

public class BoatBuild {
	private ShipBuilder shipBuilder;
	
	public BoatBuild(ShipBuilder shipBuilder){
		this.shipBuilder=shipBuilder;
		
	}
	public Ship construct(){
		shipBuilder.setName("Boat");
		shipBuilder.setSize(1);
		return shipBuilder.getResult();
	}
}

