
public abstract class Size {
		
	protected int Row=10;
	protected int Column=10;
	public static String[][] Size;
	
	
	//
	public Size(int row, int column ){
		Row=row;
		Column=column;
	}
	
	public String[][] CreateDefaultGridSize(){
		
		Size= new String[Row][Column];
		
		for(int i=0; i<Size[Row].length;i++){
			for(int k=0; k<Size[Column].length;i++){
				
				Size[i][k]=".";
			}
		}
		return Size;
		
		
	}
}
