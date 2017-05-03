package ie.itsligo.roomroute;
import java.util.StringTokenizer;

public class Room {
	private String room;

	public Room() {
		
	}
	
	public String get(String data)
	{
		room = "E2004";
		String s = qrCodeData;
		String delims = "[,]+"; // use + to treat consecutive delims as one;
		                                 // omit to treat consecutive delims separately
		String[] tokens = s.split(delims);
		for (int i = 0; i < tokens.length; i++)
		    System.out.println(tokens[i]);
		// TODO extract the room number eg E2004 from the data passed in
		// Here you write the code to parse the data string and extract the room
		
		
			
			
		
		
		return(room);
	}

}
