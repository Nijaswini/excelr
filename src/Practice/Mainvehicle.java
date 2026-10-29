package Practice;

public class Mainvehicle {
	public static void main(String[] args) {
	
		// Polymorphism = "POLY" = "MANY"
		//"MORPH" = "SHAPE"
		//Objects can identify as other objects.
		//Objects can be treated as objects of a common superclass.
		
		Bike bike =new Bike();
		Boat boat = new Boat ();
		
		
		bike.go();
		boat.go();
		
		vehicle[] vehicles = {bike, boat};
		
		
		
	}

}
