package Collectionables;

import java.util.*;

public class Collectionables {
	
	public static void useArrayList(){
		ArrayList<String> elements = new ArrayList<String>(Arrays.asList("Elemento 1","Elemento 2"));
		elements.add("Elemento 3");
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

	public static void useMaps() {
		Map <String, ArrayList<String>> elements = new HashMap<String, ArrayList<String>>();
		elements.put("Object1",new ArrayList<String>(Arrays.asList("Hola1","Hola2")));
		elements.put("Object2",new ArrayList<String>(Arrays.asList("Hola1","Hola2")));
		elements.put("Object3",new ArrayList<String>(Arrays.asList("Hola1","Hola2")));
		for(Map.Entry<String,ArrayList<String>> element : elements.entrySet()){
			System.out.println(element.getKey()+" -> "+element.getValue());
		}
	}
}
