package ShipsBuilder;

public class ShipDemo {

    public static void main(String[] args) {
        ShipBuilder builder = new ShipBuilderImpl();
        
        BattleshipBuilder battleshipBuildDirector = new BattleshipBuilder(builder);
        
        //CarBuilder builder2 = new CarBuilderImpl();
        BoatBuilder boatBuilder=  new BoatBuilder(builder);
        
        System.out.println(battleshipBuildDirector.construct());
        System.out.println(boatBuilder.construct());
    }
}
