package Module14;

public class SomeClass {
	
	long serialNumber;
	
	public SomeClass() {
		this(10L);
		System.out.println("Inside default no-arg constructor");
	}
	
	public SomeClass(long sn) {
		this.serialNumber = sn;
		System.out.println("Inside constructor with parameters");
	}
	
	public static void main(String[] args) {
		SomeClass yee = new SomeClass();
		
		SomeClass yeet = new SomeClass(234234L);
	}

}
