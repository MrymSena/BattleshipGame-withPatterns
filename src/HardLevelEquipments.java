import EquipmentBuilder.GunShotBuilder;
import EquipmentBuilder.GunShotCounter;
import EquipmentBuilder.HandBombBuilder;
import EquipmentBuilder.HandBombCounter;
import EquipmentBuilder.PreparationDirector;
import EquipmentBuilder.RocketBuilder;
import EquipmentBuilder.RocketCounter;
import EquipmentBuilder.Weapon;
import EquipmentBuilder.WeaponBuilder;


public class HardLevelEquipments implements Equipment{
	
	Weapon wrocket;
	Weapon whandbomb1,whandbomb2,whandbomb3,whandbomb4;
	Weapon wgunshot1,wgunshot2,wgunshot3,wgunshot4,wgunshot5,wgunshot6,wgunshot7,wgunshot8,wgunshot9,wgunshot10,wgunshot11,wgunshot12;
	
	@Override
	public void createEquipment(){
		PreparationDirector preparationDirector = new PreparationDirector();
		
		WeaponBuilder rocket= new RocketCounter(new RocketBuilder());
		
		WeaponBuilder handbomb1= new HandBombCounter(new HandBombBuilder());
		WeaponBuilder handbomb2= new HandBombCounter(new HandBombBuilder());
		WeaponBuilder handbomb3= new HandBombCounter(new HandBombBuilder());
		WeaponBuilder handbomb4= new HandBombCounter(new HandBombBuilder());
		
		WeaponBuilder gunshot1= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot2= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot3= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot4= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot5= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot6= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot7= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot8= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot9= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot10=new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot11=new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot12=new GunShotCounter(new GunShotBuilder());
		
		
		preparationDirector.setWeaponBuilder(rocket);
		preparationDirector.constructWeapon();
		wrocket= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(handbomb1);
		preparationDirector.constructWeapon();
		whandbomb1= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(handbomb2);
		preparationDirector.constructWeapon();
		whandbomb2= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(handbomb3);
		preparationDirector.constructWeapon();
		whandbomb3= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(handbomb4);
		preparationDirector.constructWeapon();
		whandbomb4= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot1);
		preparationDirector.constructWeapon();
		wgunshot1= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot2);
		preparationDirector.constructWeapon();
		wgunshot2= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot3);
		preparationDirector.constructWeapon();
		wgunshot3= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot4);
		preparationDirector.constructWeapon();
		wgunshot4= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot5);
		preparationDirector.constructWeapon();
		wgunshot5= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot6);
		preparationDirector.constructWeapon();
		wgunshot6= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot7);
		preparationDirector.constructWeapon();
		wgunshot7= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot8);
		preparationDirector.constructWeapon();
		wgunshot8= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot9);
		preparationDirector.constructWeapon();
		wgunshot9= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot10);
		preparationDirector.constructWeapon();
		wgunshot10= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot11);
		preparationDirector.constructWeapon();
		wgunshot11= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(gunshot12);
		preparationDirector.constructWeapon();
		wgunshot12= preparationDirector.getWeapon();
		
	}
	
	public String toString(){
		
		return "Equpiments: "+ wrocket.getName()+whandbomb1.getName()+whandbomb2.getName()+whandbomb3.getName()+wgunshot1.getName()+wgunshot2.getName()+wgunshot3.getName()
		+wgunshot4.getName()+wgunshot5.getName()+wgunshot6.getName()+wgunshot7.getName()+wgunshot8.getName()+wgunshot9.getName()+wgunshot10.getName();
	}

	

}
