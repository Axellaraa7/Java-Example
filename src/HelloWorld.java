

import collectionables.Collectionables;
import exercises.Logical;
import order.algorithms.OrderAlgorithms;
import order.algorithms.QuickSort;

//import Exceptions.ExceptionLong;
public class HelloWorld {

	public static void main(String[] args) {
		//Logical
		System.out.println("Triangle excercise");
		Logical.triangle(10);
		//Collections
		title("->Using array list");
		Collectionables.useArrayList();
		title("->Using stack");
		Collectionables.useStack();
		title("->Using deque as stack");
		Collectionables.useDequeAsStack();
		title("->Using queue");
		Collectionables.useQueue();
		title("->Using deque as queue");
		Collectionables.useDequeAsQueue();
		title("->Using double linked list with generics");
		Collectionables.useOwnNodeList();
		title("->Using Linked list");
		Collectionables.useLinkedList();
		title("->Using maps");
		Collectionables.useMaps();
		//Exceptions
		//Functionals
		title("->Using functional programming");
		//Algorithms
		title("->Order Algorithms");
		int[] arr = QuickSort.makeArray(8,50);
		System.out.println("Initial array -> "+OrderAlgorithms.printArray(arr));
		System.out.println("Quick Sort array -> "+QuickSort.quickSort(arr,0,arr.length-1));
	}
	
	private static void separator() { System.out.println("\n--------------------------------\n"); }
	
	private static void title(String title) { separator(); System.out.println(title); }
	
}


