package T1E4;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
	
	private Node<T> puntero;
	
	public MyIterator(Node<T> first) {
		this.puntero = first;
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
