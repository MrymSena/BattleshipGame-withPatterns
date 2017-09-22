package ShipsBuilder;


public class BattleshipBuilder {
	private ShipBuilder shipBuilder;
	
	public BattleshipBuilder(ShipBuilder shipBuilder){
		this.shipBuilder=shipBuilder;
		
	}
	public Ship construct(){
		shipBuilder.setName("Battleship");
		shipBuilder.setSize(4);
		return shipBuilder.getResult();
	}
	

    public static void main(String[] args) {
        ShipBuilder builder = new ShipBuilderImpl();
        BattleshipBuilder carBuildDirector = new BattleshipBuilder(builder);
        
        //CarBuilder builder2 = new CarBuilderImpl();
        BoatBuilder car=  new BoatBuilder(builder);
        
        System.out.println(carBuildDirector.construct());
        System.out.println(car.construct());
    }
}


