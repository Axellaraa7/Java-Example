package collectionables;

//Creating a class that represents a node in a double linked list.
//In this class im using generics to allow insert any kind of objects.
public class OwnNodeList <V> {
	private V value;
	private OwnNodeList<V> prev;
	private OwnNodeList<V> next;
	
	public OwnNodeList(V value) {
		this.value = value;
		this.prev = null;
		this.next = null;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public void setPrev(OwnNodeList<V> prev) {
		this.prev = prev;
	}
	
	public void setNext(OwnNodeList<V> next) {
		this.next = next;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public OwnNodeList<V> getPrev(){
		return this.prev;
	}
	
	public OwnNodeList<V> getNext(){
		return this.next;
	}
}
