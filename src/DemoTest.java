import EquipmentBuilder.GunShotCounter;
import EquipmentBuilder.HandBombCounter;
import EquipmentBuilder.RocketCounter;


public class DemoTest {

	public static void main(String[] args){
	
			NormalLevelEquipments nl= new NormalLevelEquipments();
			nl.createEquipment();
			System.out.println(nl.toString());
			System.out.println("number of Gunshot: "+GunShotCounter.getGunShots() );
			System.out.println("numbers of Handbombs: "+HandBombCounter.getGunShots());
			System.out.println("numbers of Rockets: "+RocketCounter.getRockets());
				
	}
	
}
