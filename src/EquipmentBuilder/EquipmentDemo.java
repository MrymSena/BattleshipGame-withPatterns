package EquipmentBuilder;

public class EquipmentDemo {

	public static void main(String[] args) {
		PreparationDirector pb= new PreparationDirector();
		WeaponBuilder wd= new GunShotBuilder();
		WeaponBuilder ww= new HandBombBuilder();
		pb.setWeaponBuilder(wd);
		pb.constructWeapon();
		Weapon wea=pb.getWeapon();
		System.out.println(wea.getName()+" "+wea.getShotsZone());
	}

}
