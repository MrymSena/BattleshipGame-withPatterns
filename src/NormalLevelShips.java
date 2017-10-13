import ShipsBuilder.BattleshipBuild;
import ShipsBuilder.BoatBuild;
import ShipsBuilder.DestroyerBuild;
import ShipsBuilder.ShipBuilder;
import ShipsBuilder.ShipBuilderImpl;
import ShipsBuilder.SubmarineBuild;


public class NormalLevelShips implements Ships {
	
	ShipBuilder builder;
	BoatBuild boatBuilder;
	BoatBuild boatBuilder2;
	SubmarineBuild submarineBuilder;
    DestroyerBuild destroyerBuilder;
    BattleshipBuild battleshipBuilder;
    
	@Override
	public void createShips() {
		
		ShipBuilder builder = new ShipBuilderImpl();
		BoatBuild boatBuilder = new BoatBuild(builder);
		BoatBuild boatBuilder2 = new BoatBuild(builder);
		SubmarineBuild submarineBuilder = new SubmarineBuild(builder);
	    DestroyerBuild destroyerBuilder= new DestroyerBuild(builder);
	    BattleshipBuild battleshipBuilder= new BattleshipBuild(builder);
	}
	public String toString() {
		return "Normal Level ships Boat1: "+ boatBuilder.construct()+"+Boat2: "+boatBuilder2.construct()+" Submarine: "+ submarineBuilder.construct()+ 
				" Destroyer: "+destroyerBuilder.construct()+"Battleship: "+battleshipBuilder.construct();
	}


}
