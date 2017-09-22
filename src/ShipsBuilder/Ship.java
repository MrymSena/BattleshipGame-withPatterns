package ShipsBuilder;

public class Ship {
	private int size;
	private String name;
	
	private String[] ship;
	
	public Ship(String[] ship){
		this.ship=ship;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int size){
		this.size=size;
		ship= new String[size];
		for(int i=0; i<size;i++){
			ship[i]="S";
		}
	}
	
	 @Override
	    public String toString() {
	    	for(int k=0; k<ship.length; k++){
	    		System.out.print(ship[k]);
	    	}
	        return " Ship name="+name+ ", size="+size;
	    }

}
