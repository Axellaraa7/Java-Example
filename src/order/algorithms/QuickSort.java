package order.algorithms;

public class QuickSort extends OrderAlgorithms {	
	public static String quickSort(int[] arr,int izq, int der) {
		int i = izq;
		int d = der;
		int piv = arr[izq];
		while(i<d) {
			//System.out.println("DER-> "+der+" IZQ-> "+izq+" D-> "+d+" I-> "+i);
			while(piv >= arr[i] && i<d) i++;
			while(piv < arr[d]) d--;
			//System.out.println("DER-> "+der+" IZQ-> "+izq+" D-> "+d+" I-> "+i);
			if(i<d){
				//System.out.println("Changing: "+arr[i]+" with "+arr[d]);
				int aux = arr[i];
				arr[i] = arr[d];
				arr[d] = aux;
			}
			//System.out.println("New Array: " + printArray(arr));
		}
		arr[izq] = arr[d];
		arr[d] = piv;
//		System.out.println("New Array: " + printArray(arr));
		if(izq < d-1) quickSort(arr, izq, d-1);
		if(der > d+1) quickSort(arr, d+1, der);
		
		return printArray(arr);
	}
	
	
}
