package T1_2E1;

public class Main {

	public static void main(String[] args) {
		
		Number[] arr = {6,7,8};
		System.out.println("El arreglo esta ordenado: " + OrdenadoRecursivo.isOrder(arr, 0) + "\n");
		System.out.println("1) en el peor de los casos la complejidad seria O(n)\n");
		System.out.println("2) hacerlo recursivo puede generar un stackOverflow si el tamaño del arreglo es muy grande, ya que en cada llamado recursivo se almacena en la pila de ejecucion \n");
		System.out.println("3) si se hace con una lista cambiaria la complejidad O(n^2)??\n");
	}

}
