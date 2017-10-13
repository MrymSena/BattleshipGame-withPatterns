package ShipsBuilder;

public class SubmarineBuild {
	private ShipBuilder shipBuilder;
	
	public SubmarineBuild(ShipBuilder shipBuilder){
		this.shipBuilder=shipBuilder;
		
	}
	
	public Ship construct(){
		shipBuilder.setName("Submarine");
		shipBuilder.setSize(2);
		return shipBuilder.getResult();
	}
}

