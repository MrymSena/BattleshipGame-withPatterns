package EquipmentBuilder;

public class HandBombBuilder extends WeaponBuilder {

	@Override
	public void buildName() {
		weapon.setName("Hand Bomb");
		
	}

	@Override
	public void buildShotsZone() {
		weapon.setShotsZone(3);
		
	}
	

}
