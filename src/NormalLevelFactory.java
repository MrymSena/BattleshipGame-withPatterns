
public class NormalLevelFactory implements GameDetailFactory{
	
	@Override
	public Size createSize() {
		return new NormalLevelSize();
	}
	@Override
	public Equipment createEquipmens() {
		return new NormalLevelEquipments();
	}
	@Override
	public Ship createShips() {
		return new NormalLevelShips();
	}
}
