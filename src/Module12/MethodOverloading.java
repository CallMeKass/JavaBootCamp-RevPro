package Module12;

public class MethodOverloading {
	 public static void main(String[] args) {
		   //create instance here
		 MethodOverloading om = new MethodOverloading();
		   om.print();
		   om.print("second print method");
		   om.print("second", "third");
		 }

		 //overload methods here
		 public void print(){
		System.out.println("original print method.");
		 }

		 public void print(String str){
		System.out.println(str);
		 }

		 public void print(String second, String third){
		System.out.println("first" + " " + second + " " + third);
		 }
}
