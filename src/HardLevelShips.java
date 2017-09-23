import ShipsBuilder.BattleshipBuilder;
import ShipsBuilder.BoatBuilder;
import ShipsBuilder.DestroyerBuilder;
import ShipsBuilder.ShipBuilder;
import ShipsBuilder.ShipBuilderImpl;
import ShipsBuilder.SubmarineBuilder;


public class HardLevelShips implements Ships {
	
	ShipBuilder builder = new ShipBuilderImpl();
	BoatBuilder boatBuilder=  new BoatBuilder(builder);
	BoatBuilder boatBuilder2=  new BoatBuilder(builder);
	SubmarineBuilder submarineBuilder = new SubmarineBuilder(builder);
    DestroyerBuilder destroyerBuilder= new DestroyerBuilder(builder);
    BattleshipBuilder battleshipBuilder= new BattleshipBuilder(builder);
    
    public String toString() {
		return "Hard Level ships Boat1: "+ boatBuilder.construct()+"Boat2: "+boatBuilder2.construct()+" Submarine: "+ submarineBuilder.construct()+
				" Destroyer: "+destroyerBuilder.construct()+"BattleshipBuilder: "+battleshipBuilder.construct();
	}

}
