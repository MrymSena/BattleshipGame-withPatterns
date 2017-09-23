package ShipsBuilder;

public class SubmarineBuilder {
	private ShipBuilder shipBuilder;
	
	public SubmarineBuilder(ShipBuilder shipBuilder){
		this.shipBuilder=shipBuilder;
		
	}
	
	public Ship construct(){
		shipBuilder.setName("Submarine");
		shipBuilder.setSize(2);
		return shipBuilder.getResult();
	}
}

