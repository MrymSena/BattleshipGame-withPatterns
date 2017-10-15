
public class BattleShipGame {
	String level;
	 
	Size size;
	Ships ship;
	Equipment equipment;
	
	public void prepareGame(GameDetailFactory gameDetailFactory){
		equipment=gameDetailFactory.createEquipment();
		ship=gameDetailFactory.createShips();
		size=gameDetailFactory.createSize();
		
	}

}
