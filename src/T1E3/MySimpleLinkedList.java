package T1E3;

public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
	}
	
	public T extractFront() {		// metodo que extrae el primer elemento de la lista
		if(!this.isEmpty()) {      // pregunto si la lista esta vacia
			T info = this.first.getInfo();
			this.first = this.first.getNext();
			this.size--;
			return info;
		}
		return null;
	}

	public boolean isEmpty() {
		return this.size == 0 && this.first == null;
	}
	
	public T get(int index) {
		if((!isEmpty() && index >= 0)&&(index < size())) {  //pregunto si la lista no esta vacia y ademas si el tamaño de la lista es mas grande que el indice que se agrego
			Node<T> tmp = this.first;
			for(int i=0;i < index;i++) {
				tmp = tmp.getNext();
			}
			return tmp.getInfo();
		}
		return null;
	}
	
	public int size() {
		return this.size;
	}
	
	//metodo que se agrega para el ejercicio3
	public int indexOf(T info) {
		if(!isEmpty()) {
			for(int i = 0; i < this.size; i++) {
				if (info.equals(this.get(i))) {
					return i;
				}
			}
		}
		return -1;
	}
	
	@Override
	public String toString() {
		if (isEmpty()) {
			return "La lista esta vacia";
		}
		System.out.println("--------------------------La lista ----------------");
		String resultado = "";
		for(int i = 0; i < this.size; i++) {
			resultado += "Pos " + i + " - Valor " + this.get(i) + " \n";
		}
		return resultado;
	}
}