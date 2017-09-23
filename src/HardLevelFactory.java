
public class HardLevelFactory implements GameDetailFactory{
	
	@Override
	public Size createSize() {
		return new HardLevelSize();
	}
	@Override
	public Equipment createEquipmens() {
		return new HardLevelEquipments();
	}
	@Override
	public Ship createShips() {
		return new HardLevelShips();
	}

}
