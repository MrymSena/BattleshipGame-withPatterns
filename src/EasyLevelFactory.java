                                             
public class EasyLevelFactory implements GameFactory{
	
	
	@Override
	public Size createSize() {
		return new EasyLevelSize();
	}
	@Override
	public Equipment createEquipmens() {
		return new EasyLevelEquipments();
	}
	@Override
	public Ship createShips() {
		return new EasyLevelShips();
	}

}
                            