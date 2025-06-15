package T1E4;

public class Main {

	public static void main(String[] args) {
		
		MySimpleLinkedList<Integer> lista = new MySimpleLinkedList<Integer>();
		
		lista.insertFront(10);
		lista.insertFront(20);
		lista.insertFront(30);
		lista.insertFront(5);
		lista.insertFront(15);
		
		MyIterator<Integer> iterador = (MyIterator<Integer>) lista.iterator();
		
		// Emprimir de esta manera va a tener un costo computacion de O(n^2)
		System.out.println("ESTO SE HIZO CON UN FOR COMUN");
		for(int i=0; i< lista.size(); i++) {
			System.out.println("Este es el valor: " + lista.get(i));
		}
		
		// Emprimir de esta manera va a tener un costo computacion de O(n)
		// de esta manera se mejora el costo computacion, el foreach emplementa este metodo.
		System.out.println("\n" + "ESTO SE HIZO CON EL ITERETOR-ITERABLE");
		while(iterador.hasNext()) {
			Integer value = iterador.next();
			System.out.println("Este es el valor: " + value);
		}
		
	}

}
