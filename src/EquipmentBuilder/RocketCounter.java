package EquipmentBuilder;

public class RocketCounter extends WeaponBuilder{
	
	WeaponBuilder weaponBuilder;
	static int numberofRockets;
	
	public RocketCounter(WeaponBuilder weaponBuilder){
		this.weaponBuilder=weaponBuilder;
	}
	
	@Override
	public void buildName() {
		numberofRockets++;
		weaponBuilder.buildName();	
	}

	@Override
	public void buildShotsZone() {
		weaponBuilder.buildShotsZone();
	}
	
	public static int getRockets(){
		return numberofRockets;
	}
	
}
