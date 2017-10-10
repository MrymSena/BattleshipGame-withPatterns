package EquipmentBuilder;

public class EquipmentDemo {

	public static void main(String[] args) {
		PreparationDirector pd= new PreparationDirector();
		WeaponBuilder gunshot= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot2=new GunShotCounter(new GunShotBuilder());
	//	WeaponBuilder handbomb= new HandBombBuilder();
		
		pd.setWeaponBuilder(gunshot);
		pd.constructWeapon();
		pd.setWeaponBuilder(gunshot2);
		pd.constructWeapon();
		
		Weapon wgunshot=pd.getWeapon();
		Weapon wgunhot2=pd.getWeapon();
		
		System.out.println(GunShotCounter.getGunShots());
		
	//	pd.setWeaponBuilder(handbomb);
	//	pd.constructWeapon();
	//	Weapon whandbomb=pd.getWeapon();
		
	//
		System.out.println(wgunshot.getName()+" "+wgunshot.getShotsZone());
	//	System.out.println(whandbomb.getName()+" "+whandbomb.getShotsZone());
	}

}
