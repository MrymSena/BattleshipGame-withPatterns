
public class HardLevelFactory implements GameFactory{
	
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
