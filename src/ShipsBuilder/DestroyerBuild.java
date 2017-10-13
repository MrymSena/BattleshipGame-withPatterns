package ShipsBuilder;

public class DestroyerBuild{

	private ShipBuilder shipBuilder;
	
	public DestroyerBuild(ShipBuilder shipBuilder){
		this.shipBuilder=shipBuilder;
		
	}
	public Ship construct(){
		shipBuilder.setName("Destroyer");
		shipBuilder.setSize(3);
		return shipBuilder.getResult();
	}

}
