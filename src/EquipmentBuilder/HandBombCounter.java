package EquipmentBuilder;

public class HandBombCounter extends WeaponBuilder {
		
	WeaponBuilder weaponBuilder;
	static int numberofHandBombs;
		
	public HandBombCounter(WeaponBuilder weaponBuilder){
		this.weaponBuilder=weaponBuilder;
	}
		
	@Override
	public void buildName() {
		numberofHandBombs++;
		weaponBuilder.buildName();	
	}

	@Override
	public void buildShotsZone() {
		weaponBuilder.buildShotsZone();		
	}
		
	public static int getGunShots(){
		return numberofHandBombs;
	}

}
