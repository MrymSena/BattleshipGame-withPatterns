package ShipsBuilder;

public class ShipDemo {

    public static void main(String[] args) {
        ShipBuilder builder = new ShipBuilderImpl();
        BattleshipBuilder carBuildDirector = new BattleshipBuilder(builder);
        
        //CarBuilder builder2 = new CarBuilderImpl();
        BoatBuilder car=  new BoatBuilder(builder);
        
        System.out.println(carBuildDirector.construct());
        System.out.println(car.construct());
    }
}
