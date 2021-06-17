package hotel;

public class InHotel 
{		
	
	IData iData;
	
	public InHotel(){}
	
	public InHotel(IData iData){
		this.iData=iData;
	}
	public  String in(int roomNo, String name)
	{
		return iData.in_Out_Room(roomNo, name);
	}	
		
		
}

