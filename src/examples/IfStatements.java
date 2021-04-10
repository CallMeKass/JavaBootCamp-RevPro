package examples;

public class IfStatements {
	
	public static void main(String[] args) {
		int x = 2;
		
		if(x > 1) {
			System.out.println("We Big");
		}
		else if(x > 0){
			System.out.println("We exist");
		}
		else {
			System.out.println("We have nothing :(");
		}
		
		
		if(!false) {
			System.out.println("Double negative, YEET");
		}
	}
	
}
