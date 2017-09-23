                                             
public class EasyLevelFactory implements GameDetailFactory{
	
	
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
                            