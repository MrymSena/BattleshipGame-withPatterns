import ShipsBuilder.BattleshipBuilder;
import ShipsBuilder.BoatBuilder;
import ShipsBuilder.DestroyerBuilder;
import ShipsBuilder.ShipBuilder;
import ShipsBuilder.ShipBuilderImpl;
import ShipsBuilder.SubmarineBuilder;


public class EasyLevelShips implements Ships {
	
	ShipBuilder builder = new ShipBuilderImpl();
	SubmarineBuilder submarineBuilder = new SubmarineBuilder(builder);
    BoatBuilder boatBuilder=  new BoatBuilder(builder);
    DestroyerBuilder destroyerBuilder= new DestroyerBuilder(builder);
 
    
	public String toString() {
		return "Easy Level ships Submarine: "+ submarineBuilder.construct()+ " Boat: "+ boatBuilder.construct()+" Destroyer: "+destroyerBuilder.construct();
	}
}
