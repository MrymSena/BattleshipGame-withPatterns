package EquipmentBuilder;

public class Weapon{
	private String name="";
	private int shotsZone=0;
	
	public void setName(String name){
		this.name=name;
	}
	public void setShotsZone(int shotszone){
		this.shotsZone=shotszone;
	}
	public String getName(){
		return name;
	}
	public int getShotsZone(){
		return shotsZone;
	}
	

}
