package EquipmentBuilder;

public class EquipmentDemo {

	public static void main(String[] args) {
		PreparationDirector pd= new PreparationDirector();
		WeaponBuilder gunshot= new GunShotBuilder();
		WeaponBuilder ww= new HandBombBuilder();
		pd.setWeaponBuilder(gunshot);
		pd.constructWeapon();
		Weapon wgunshot=pd.getWeapon();
		
		System.out.println(wgunshot.getName()+" "+wgunshot.getShotsZone());
	}

}
