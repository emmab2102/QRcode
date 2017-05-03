package ie.itsligo.roomroute;

public class Directions {
	private static final int GOTO_ENGINEERING = 1;
	private static final int GOTO_MAIN= 2;
	private static final int GOTO_BUSINESS =3;
	private static final int GOTO_F =4;
	private static final int GOTO_C =5;
	private static final int GOTO_SCIENCE =6;
	private static final int GOTO_SORRY =7;
	private final int ROOM_LENGTH = 5; // size of the room string
	private char building ;
	private char floor;
	private String locaationOnFloor = null;

	public Directions() {

	}

	
	public char getBuilding() {
		return building;
	}


	public void setBuilding(char building) {
		this.building = building;
	}


	public char getFloor() {
		return floor;
	}


	public void setFloor(char floor) {
		this.floor = floor;
	}


	public String getLocaationOnFloor() {
		return locaationOnFloor;
	}

	public void setLocaationOnFloor(String locaationOnFloor) {
		this.locaationOnFloor = locaationOnFloor;
	}

	/*
	 * This method takes in a room eg E2004 and splits up into the correct block
	 * (Engineering, Science, Business, etc) The correct floor The correct room
	 * number
	 */
	public boolean validate(String room) {
		
		if (room.length() != ROOM_LENGTH) {			
			return false;
		}
		if (Character.isLetter(room.charAt(0)) == false) {
			return false; // room must start with a letter
		}
		for (int i = 1; i < ROOM_LENGTH; i++) {			
			if (Character.isDigit(room.charAt(i)) == false) {
				return false; // room must start with a letter
			}
		}
		
		// all ok - store the info
		building = room.charAt(0);
		floor = room.charAt(1);
		locaationOnFloor = room.substring(2);
		
		return true;
	}
	
	/*
	 * Get directions to building
	 */
	public String toBuilding() {

		String directions = null;
		switch (this.building) {
		case 'A':
			// TODO play the sound here for this here
			//QRSound qs = new QRSound();
            //qs.playit(GOTO_MAIN);
			//qs.delayfor(15);
			directions = "Main Block\nFrom reception, walk straight ahead and then turn to your right";
			break;
		case 'B':
			// TODO play the sound here for this here
			//qs.playit(GOTO_SCIENCE);
			//qs.delayfor(15);
            
			
			directions = "Science Block\nFrom reception, go up main stairs on your left and turn right.  Walk for 40m past Library until you read the Booknest";
			break;
		case 'C':
			// TODO play the sound here for this here
			//qs.playit(GOTO_C);
			//qs.delayfor(15);
			directions = "C Block\nFrom reception, go up main stairs on your left and turn right.  Walk for 40m past Library until you read the Booknest, then turn left and conrinute through long corridor";
			break;
		case 'D':
			// TODO play the sound here for this here
			//qs.playit(GOTO_BUSINESS);
			//qs.delayfor(15);
			directions = "Business Block\nrom reception, go up main stairs on your left and turn right.  Walk for 40m past Library until you read the Booknest, then turn left and conrinute through long corridor";
			break;
		case 'E':
			// TODO play the sound here for this here
		
			QRSound qs = new QRSound();
            qs.playit(GOTO_ENGINEERING);
			qs.delayfor(15);
			
			directions = "Engineering Block\nFrom reception, move the the centre of reception and turn left into the engineering building";
			break;
		case 'F':
			// TODO play the sound here for this here
			//qs.playit(GOTO_F);
			//qs.delayfor(15);
			directions = "F Block\nFrom reception, walk outside and turn to your right.  Walk past the engineering building and the F block is straigt in front";
			break;
		default:
			//qs.playit(GOTO_SORRY);
			//qs.delayfor(15);
			directions = "Sorry, that building in not recognised";
			break;
			
		}
		return(directions);
	}
	
	/*
	 * Get directions to floor
	 */
	public String toFloor() {
		String directions = null;
		switch (this.floor) {
		case '0':
			// TODO play the sound here for this here
			directions = "Stay on this floor";
			break;
		case '1':
			// TODO play the sound here for this here
			directions = "Ascend the stairs or take the lift to the first floor";			
			break;
		case '2':
			// TODO play the sound here for this here
			directions = "Ascend two flight of stairs or take the lift to the second floor";			
			break;
		default:
			directions = "Sorry, floor " + this.floor + " is not recognised";
			break;
			
		}
		return(directions);
	}

	/*
	 * Get directions to floor
	 */
	public String toLocation() {
		String directions = null;
		switch (this.locaationOnFloor) {
		case "006":
			// TODO play the sound here for this here
			directions = "This is a room to the right on this level";
			break;
		case "007":
			// TODO play the sound here for this here
			directions = "This is a room to the right on this level";			
			break;
		case "003":
			// TODO play the sound here for this here
			directions = "This is the last room to the right on this level";			
			break;
		case "004":
			// TODO play the sound here for this here
			directions = "This is the second last room to the right on this level";			
			break;
		default:
			directions = "Sorry, that room in not recognised";
			break;
			
		}
		return(directions);
	}

}
