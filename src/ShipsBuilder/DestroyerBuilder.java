package ShipsBuilder;

public class DestroyerBuilder {

	private ShipBuilder shipBuilder;
	
	public DestroyerBuilder(ShipBuilder shipBuilder){
		this.shipBuilder=shipBuilder;
		
	}
	public Ship construct(){
		shipBuilder.setName("Destroyer");
		shipBuilder.setSize(3);
		return shipBuilder.getResult();
	}
}
