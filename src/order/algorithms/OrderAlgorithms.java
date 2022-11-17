package order.algorithms;

public class OrderAlgorithms {
	public static int[] makeArray(int elements, int max) {
		int[] arr = new int[elements];
		for (int i = 0; i < elements; i++) arr[i] = (int) (Math.random() * max);
		return arr;
	}
	
	public static String printArray(int[] arr) {
		String message = "";
		for(int el : arr) message += el+",";
		return message;
	}
}
