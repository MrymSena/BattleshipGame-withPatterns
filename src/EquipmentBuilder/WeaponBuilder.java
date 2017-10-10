package EquipmentBuilder;


public abstract class WeaponBuilder{
	protected static Weapon weapon;
	
	public Weapon getWeapon(){
		return weapon;
	}
	public void createNewWeapon(){
		weapon=new Weapon();
	}
	public abstract void buildName();
	public abstract void buildShotsZone();

}
