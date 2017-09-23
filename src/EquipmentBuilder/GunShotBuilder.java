package EquipmentBuilder;

public class GunShotBuilder extends WeaponBuilder{
	
	public void buildName(){
		weapon.setName("Gun Shot");
	}

	@Override
	public void buildShotsZone() {
		weapon.setShotsZone(1);
		
	}
}
