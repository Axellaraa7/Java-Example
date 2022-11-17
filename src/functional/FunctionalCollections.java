package functional;

import java.util.List;
import java.util.function.Consumer;

import java.util.ArrayList;

public class FunctionalCollections {
	private List<String> lista;
	
	public FunctionalCollections(ArrayList<String> array) {
		this.lista = array;
	}
	
	public void useForEach() {
		this.lista.forEach(new Consumer<String>(){
			@Override
			public void accept(String t) { System.out.println(t); }
		});
		//this.lista.forEach(x -> System.out.println(x));
	}
	
	
}
