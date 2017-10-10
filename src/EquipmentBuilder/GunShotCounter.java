package EquipmentBuilder;

public class GunShotCounter extends WeaponBuilder {
	WeaponBuilder weaponBuilder;
	static int numberofGunShots;
	
	public GunShotCounter(WeaponBuilder weaponBuilder){
		this.weaponBuilder=weaponBuilder;
	}
	
	@Override
	public void buildName() {
		numberofGunShots++;
		weaponBuilder.buildName();	
	}

	@Override
	public void buildShotsZone() {
		weaponBuilder.buildShotsZone();		
	}
	
	public static int getGunShots(){
		return numberofGunShots;
	}

}
