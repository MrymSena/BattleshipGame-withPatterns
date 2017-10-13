import ShipsBuilder.BattleshipBuild;
import ShipsBuilder.BoatBuild;
import ShipsBuilder.DestroyerBuild;
import ShipsBuilder.ShipBuilder;
import ShipsBuilder.ShipBuilderImpl;
import ShipsBuilder.SubmarineBuild;


public class HardLevelShips implements Ships {
	ShipBuilder builder;
	BoatBuild boatBuilder;
	BoatBuild boatBuilder2;
	SubmarineBuild submarineBuilder;
    DestroyerBuild destroyerBuilder;
    BattleshipBuild battleshipBuilder;
	
	
	@Override
	public void createShips() {
		builder = new ShipBuilderImpl();
		boatBuilder=  new BoatBuild(builder);
		boatBuilder2=  new BoatBuild(builder);
		submarineBuilder = new SubmarineBuild(builder);
		destroyerBuilder= new DestroyerBuild(builder);
	    battleshipBuilder= new BattleshipBuild(builder);
	    
	}

    public String toString() {
		return "Hard Level ships Boat1: "+ boatBuilder.construct()+"Boat2: "+boatBuilder2.construct()+" Submarine: "+ submarineBuilder.construct()+
				" Destroyer: "+destroyerBuilder.construct()+"BattleshipBuilder: "+battleshipBuilder.construct();
	}


}
