package Module12;

public class Device {
	public static void main(String[] args) {
		Battery b1 = new Battery();
		Battery b2 = new Battery();
		
		
		b1.setMaxHours(5);
		
		System.out.println(b1.getMaxHours());
		System.out.println(b2.getMaxHours());
	}
}
