import java.util.concurrent.ThreadLocalRandom;

                                             
public class EasyLevelFactory implements GameDetailFactory{
	
	@Override
	public Size createSize() {
		return new EasyLevelSize();
	}
	@Override
	public Equipment createEquipment() {
		return (Equipment) new EasyLevelEquipments();
	}
	@Override
	public Ships createShips() {
		return new EasyLevelShips();
	}

}
                            