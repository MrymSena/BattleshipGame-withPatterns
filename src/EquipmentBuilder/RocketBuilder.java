package EquipmentBuilder;

public class RocketBuilder extends WeaponBuilder 
{

	@Override
	public void buildName() {
		weapon.setName("Rocket");
		
	}

	@Override
	public void buildShotsZone() {
		weapon.setShotsZone(5);
		
	}

}
