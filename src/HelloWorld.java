

import Collectionables.Collectionables;
import Excercises.Logical;

//import Exceptions.ExceptionLong;
public class HelloWorld {

	public static void main(String[] args) {
		//Logical
		System.out.println("Triangle excercise");
		Logical.triangle(10);
		//Collections
		separator();
		title("Using array list");
		Collectionables.useArrayList();
		separator();
		title("Using maps");
		Collectionables.useMaps();
		
	}
	
	private static void separator() { System.out.println("\n--------------------------------\n"); }
	
	private static void title(String title) { System.out.println(title); }
	
	
}


