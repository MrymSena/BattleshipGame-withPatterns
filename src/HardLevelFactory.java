
public class HardLevelFactory implements GameDetailFactory{
	
	@Override
	public Size createSize() {
		return new HardLevelSize();
	}
	@Override
	public Equipment createEquipment() {
		return new HardLevelEquipments();
	}
	@Override
	public Ships createShips() {
		return new HardLevelShips();
	}

}
