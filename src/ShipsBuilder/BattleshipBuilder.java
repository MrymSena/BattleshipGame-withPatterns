package ShipsBuilder;


public class BattleshipBuilder{
	private ShipBuilder shipBuilder;
	
	public BattleshipBuilder(ShipBuilder shipBuilder){
		this.shipBuilder=shipBuilder;
		
	}
	public Ship construct(){
		shipBuilder.setName("Battleship");
		shipBuilder.setSize(4);
		return shipBuilder.getResult();
	}
	


}


