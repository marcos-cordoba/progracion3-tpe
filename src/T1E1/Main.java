package T1E1;

public class Main {

	public static void main(String[] args) {
		MySimpleLinkedList<Integer> lista = new MySimpleLinkedList<Integer>();
		
		//probrando el metodo isEmpty en una lista vacia
		System.out.println("La lista esta vacia?" + " "+lista.isEmpty());
		
		lista.insertFront(10);
		lista.insertFront(20);
		lista.insertFront(30);
		lista.insertFront(5);
		lista.insertFront(15);
		
		System.out.println(lista.toString());
		
		System.out.println("Tamaño de la lista" + " " +lista.size());
		
		// Obtener elementos por índice
        System.out.println("Elemento en la posición 0: " + lista.get(0));
        System.out.println("Elemento en la posición 1: " + lista.get(1));
        System.out.println("Elemento en la posición 2: " + lista.get(2));

        // Extraer el primer elemento
        System.out.println("Extrayendo el primer elemento: " + lista.extractFront());

        // Mostrar la lista después de la extracción
        System.out.println(lista.toString());

        // Probar isEmpty después de eliminar elementos
        System.out.println("¿La lista está vacía? " + lista.isEmpty());

        // Extraer todos los elementos
        lista.extractFront();
        lista.extractFront();

        // Mostrar la lista vacía
        System.out.println(lista.toString());
        System.out.println("¿La lista está vacía? " + lista.isEmpty());
        
        //comprobacion del ejercicio 3
        System.out.println("Posicion " + lista.indexOf(10));
        System.out.println("Posicion " + lista.indexOf(20));
        System.out.println("Posicion " + lista.indexOf(50));

	}

}
