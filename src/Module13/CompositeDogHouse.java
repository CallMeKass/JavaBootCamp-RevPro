package Module13;

public class CompositeDogHouse {
	CompositeDog d;
	
	public CompositeDogHouse() {
		d = new CompositeDog();
		d.setName("Doggo");
	}
	
	
	public CompositeDogHouse(CompositeDog dog) {
		d = dog;
	}
	
	public String getDog() {
		return d.getName();
	}
	
	public static void main(String[] args) {
		CompositeDogHouse house = new CompositeDogHouse();
		
		house.d.talk();
		System.out.println("This house belongs to " + house.getDog());
		
		CompositeDog rex = new CompositeDog("Rex");
		CompositeDogHouse house2 = new CompositeDogHouse(rex);
		System.out.println("This house belongs to " + house2.getDog());
		
	}
}
