package Module13;

public class CompositeDog {
	String name;
	
	public CompositeDog() {
		name = "dog";
	}
	
	public CompositeDog(String nam) {
		name = nam;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void talk() {
		System.out.println("Woof!");
	}
}
