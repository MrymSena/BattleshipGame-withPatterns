import EquipmentBuilder.GunShotCounter;
import EquipmentBuilder.HandBombCounter;
import EquipmentBuilder.RocketCounter;


public class DemoTest {

	public static void main(String[] args){

		BattleShipGame game= new BattleShipGame();
		GameDetailFactory gameDetailFactory=null;
		
		gameDetailFactory= new EasyLevelFactory();
	
		game.prepareGame(gameDetailFactory);
	/*GameStore easyGame=new EasyLevelGame();
			BattleShipGame game=easyGame.orderGame();*/	
		System.out.println("Game ordered "+ game);
		System.out.println("equipments:"+ game.equipment);
		System.out.println("ships: "+ game.ship);
		System.out.println("size: "+game.size);
		
		
		
		/*	NormalLevelEquipments nl= new NormalLevelEquipments();
			nl.createEquipment();
			System.out.println(nl.toString());
			System.out.println("number of Gunshot: "+GunShotCounter.getGunShots() );
			System.out.println("numbers of Handbombs: "+HandBombCounter.getGunShots());
			System.out.println("numbers of Rockets: "+RocketCounter.getRockets());
			*/	
	}
	//deneme commit
	
	//calisma1 branch commit
}
