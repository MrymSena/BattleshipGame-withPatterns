package ShipsBuilder;

public class ShipDemo {

    public static void main(String[] args) {
        ShipBuilder builder = new ShipBuilderImpl();
        
        BattleshipBuild battleshipBuildDirector = new BattleshipBuild(builder);
        
        //CarBuilder builder2 = new CarBuilderImpl();
        BoatBuild boatBuilder=  new BoatBuild(builder);
        
        System.out.println(battleshipBuildDirector.construct());
        System.out.println(boatBuilder.construct());
    }
}
