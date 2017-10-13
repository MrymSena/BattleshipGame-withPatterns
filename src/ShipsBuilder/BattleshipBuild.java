package ShipsBuilder;


public class BattleshipBuild{
	private ShipBuilder shipBuilder;
	
	public BattleshipBuild(ShipBuilder shipBuilder){
		this.shipBuilder=shipBuilder;
		
	}
	public Ship construct(){
		shipBuilder.setName("Battleship");
		shipBuilder.setSize(4);
		return shipBuilder.getResult();
	}
	


}


