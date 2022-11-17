package collectionables;

import java.util.*;

public class Collectionables {
	
	public static void useArrayList() {
		ArrayList<String> elements = new ArrayList<String>(Arrays.asList("Elemento 1", "Elemento 2"));
		elements.add("Elemento 3");
		Iterator<String> iterator = elements.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	//Using a stack with the main stack class. It behaves in the same way as a simple stack
	public static void useStack() {
		Stack<String> stack = new Stack<String>();
		stack.add("Elemento 1");
		stack.add("Elemento 2");
		stack.add("Elemento 3");
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

	//Using a deque (double ended queue) as a stack using only the methods that allow to behave as stack
	//https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html
	public static void useDequeAsStack() {
		Deque<String> stack = new ArrayDeque<String>(4);
		stack.addFirst("Elemento 1");
		stack.addFirst("Elemento 2");
		stack.addFirst("Elemento 3");
		System.out.println(stack.peekFirst());
		System.out.println(stack.removeFirst());
		System.out.println(stack.peekFirst());
	}
	
	//https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
	public static void useQueue() {
		Queue<String> queue = new PriorityQueue<String>(4);
		queue.add("Elemento 1");
		queue.add("Elemento 2");
		queue.add("Elemento 3");
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
	}
	
	//https://docs.oracle.com/javase/7/docs/api/java/util/ArrayDeque.html
	public static void useDequeAsQueue() {
		Deque<String> queue = new ArrayDeque<String>(4);
		queue.addFirst("Elemento 1");
		queue.addFirst("Elemento 2");
		queue.addFirst("Elemento 3");
		System.out.println(queue.peekLast());
		System.out.println(queue.removeLast());
		System.out.println(queue.peekLast());
	}

	public static void useOwnNodeList() {
//	OwnNodeList<String> node1 = new OwnNodeList<String>("Hello");
//	OwnNodeList<Integer> node2 = new OwnNodeList<Integer>(150);
//	OwnNodeList<Boolean> node3 = new OwnNodeList<Boolean>(true);
//	OwnNodeList<Calendar> node4 = new OwnNodeList<Calendar>(new GregorianCalendar(1998,05,18));
		OwnNodeList<String> node1 = new OwnNodeList<String>("Hello");
		OwnNodeList<String> node2 = new OwnNodeList<String>("Hello world");
		OwnNodeList<String> node3 = new OwnNodeList<String>("Hello world im");
		OwnNodeList<String> node4 = new OwnNodeList<String>("Hello world im axel");
		node1.setNext(node2);
		node2.setPrev(node1);
		node2.setNext(node3);
		node3.setPrev(node2);
		node3.setNext(node4);
		node4.setPrev(node3);

		System.out.println(Arrays.toString(node3.getNext().getValue().split(" ")));
	}
	
	public static void useLinkedList() {
		
	}
	
	public static void useOwnLinkedList() {
		
	}
	
	public static void useBinaryTree() {
		
	}
	
	public static void useSet() {
		
	}
	
	public static void useMaps() {
		Map<String, ArrayList<String>> elements = new HashMap<String, ArrayList<String>>();
		elements.put("Object1", new ArrayList<String>(Arrays.asList("Hola1", "Hola2")));
		elements.put("Object2", new ArrayList<String>(Arrays.asList("Hola1", "Hola2")));
		elements.put("Object3", new ArrayList<String>(Arrays.asList("Hola1", "Hola2")));
		for (Map.Entry<String, ArrayList<String>> element : elements.entrySet()) {
			System.out.println(element.getKey() + " -> " + element.getValue());
		}
	}

}
