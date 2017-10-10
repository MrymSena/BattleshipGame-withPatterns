import java.util.ArrayList;

import EquipmentBuilder.GunShotBuilder;
import EquipmentBuilder.GunShotCounter;
import EquipmentBuilder.HandBombBuilder;
import EquipmentBuilder.HandBombCounter;
import EquipmentBuilder.PreparationDirector;
import EquipmentBuilder.RocketBuilder;
import EquipmentBuilder.RocketCounter;
import EquipmentBuilder.Weapon;
import EquipmentBuilder.WeaponBuilder;


public class EasyLevelEquipments implements Equipment {
	
	Weapon wrocket;
	Weapon whandbomb1,whandbomb2;
	Weapon wgunshot1,wgunshot2,wgunshot3,wgunshot4,wgunshot5,wgunshot6,wgunshot7;
	
	
	@Override
	public void createEquipment() {
		
		PreparationDirector preparationDirector = new PreparationDirector();
		
		WeaponBuilder rocket= new RocketCounter(new RocketBuilder());
		
		WeaponBuilder handbomb1= new HandBombCounter(new HandBombBuilder());
		WeaponBuilder handbomb2= new HandBombCounter(new HandBombBuilder());
		
		WeaponBuilder gunshot1= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot2= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot3= new GunShotCounter(new GunShotBuilder());;
		WeaponBuilder gunshot4= new GunShotCounter(new GunShotBuilder());;
		WeaponBuilder gunshot5= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot6= new GunShotCounter(new GunShotBuilder());
		WeaponBuilder gunshot7= new GunShotCounter(new GunShotBuilder());
		
	
		preparationDirector.setWeaponBuilder(rocket);
		preparationDirector.constructWeapon();
		wrocket= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(handbomb1);
		preparationDirector.constructWeapon();
		whandbomb1= preparationDirector.getWeapon();
		
		preparationDirector.setWeaponBuilder(handbomb2);
		preparationDirector.constructWeapon();
		whandbomb2= preparationDirector.getWeapon();
		
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
	
	}
	
	public String toString(){

		return "Equpiments: "+ wrocket.getName()+whandbomb1.getName()+whandbomb2.getName()+wgunshot1.getName()+wgunshot2.getName()+wgunshot3.getName()
				+wgunshot4.getName()+wgunshot5.getName()+wgunshot6.getName()+wgunshot7.getName();
	
	}
		
}
