package EquipmentBuilder;

public class PreparationDirector {
	private WeaponBuilder weaponBuilder;
	
	public void setWeaponBuilder(WeaponBuilder wb){
		weaponBuilder=wb;
	}
	public Weapon getWeapon(){
		return weaponBuilder.getWeapon();
	}
	
	public void constructWeapon(){
		weaponBuilder.createNewWeapon();
		weaponBuilder.buildName();
		weaponBuilder.buildShotsZone();
	}
	
}
