package Module13;

public class ConstructorExample {
	int id;

	public ConstructorExample() {
		System.out.println("I'm in.");
		id = 1;
	}

	public ConstructorExample(int var) {
		System.out.println("I'm in. ");
		id = var;
	}

	public static void main(String[] args) {
		ConstructorExample a = new ConstructorExample();
		System.out.println("After instantiation. ID: " + a.id);

		ConstructorExample b = new ConstructorExample(5);
		System.out.println("After instantiation. ID: " + b.id);
	}
}
