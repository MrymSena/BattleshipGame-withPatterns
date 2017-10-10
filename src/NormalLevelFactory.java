
public class NormalLevelFactory implements GameDetailFactory{
	
	@Override
	public Size createSize() {
		return new NormalLevelSize();
	}
	@Override
	public Equipment createEquipment() {
		return (Equipment) new NormalLevelEquipments();
	}
	@Override
	public Ships createShips() {
		return new NormalLevelShips();
	}
}
