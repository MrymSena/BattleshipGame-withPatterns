import ShipsBuilder.BattleshipBuild;
import ShipsBuilder.BoatBuild;
import ShipsBuilder.DestroyerBuild;
import ShipsBuilder.ShipBuilder;
import ShipsBuilder.ShipBuilderImpl;
import ShipsBuilder.SubmarineBuild;


public class EasyLevelShips implements Ships {
	
	ShipBuilder builder;
	SubmarineBuild submarineBuilder;
    BoatBuild boatBuilder;
    DestroyerBuild destroyerBuilder;
   
 	@Override
	public void createShips() {
		ShipBuilder builder = new ShipBuilderImpl();
		
		SubmarineBuild submarineBuilder = new SubmarineBuild(builder);
	    BoatBuild boatBuilder=  new BoatBuild(builder);
	    DestroyerBuild destroyerBuilder= new DestroyerBuild(builder);
		
	}
    
	public String toString() {
		return "Easy Level ships Submarine: "+ submarineBuilder.construct()+ " Boat: "+ boatBuilder.construct()+" Destroyer: "+destroyerBuilder.construct();
	}




}
