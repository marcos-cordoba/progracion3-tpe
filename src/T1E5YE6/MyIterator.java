package T1E5YE6;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
	
	private Node<T> puntero;
	
	public MyIterator(Node<T> puntero) {
		this.puntero = puntero;
	}
	
	public boolean hasNext() {
		return puntero != null;
	}
	
	public T next() {
		T info = puntero.getInfo();
		this.puntero = puntero.getNext();
		return info;
	}
}