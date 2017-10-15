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
 		builder = new ShipBuilderImpl();
 		submarineBuilder = new SubmarineBuild(builder);
	    boatBuilder=  new BoatBuild(builder);
	    destroyerBuilder= new DestroyerBuild(builder);
		
	}
    
	public String toString() {
		createShips();
		return "Easy Level ships "+ submarineBuilder.construct()+ boatBuilder.construct()+destroyerBuilder.construct();
	}




}
