package ShipsBuilder;

public class ShipBuilderImpl implements ShipBuilder{

	private Ship ship;
	private String[] shipS;
	
	
	public ShipBuilderImpl(){
		ship=new Ship(shipS);
	}
	
	@Override
	public void setName(String name){
		ship.setName(name);
	}
	
	@Override
	public void setSize(int size) {
		ship.setSize(size);
		
	}

	@Override
	public Ship getResult() {
		return ship;
	}

	

}
