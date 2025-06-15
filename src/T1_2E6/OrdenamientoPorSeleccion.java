package T1_2E6;

public class OrdenamientoPorSeleccion {
	
	public static void ordenamientoPorSeleccion(int[] arr) {
		int size = arr.length;
		// recorremos todos los elementos del arreglo
		for(int i =0; i<size-1; i++) {
			// Encontramos el indice del elemento mas pequeño en el subarreglo no ordenado
			int minIndex = i;
			for(int j = i+1; j < size; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			//intercambiamos el elemento mas pequeño con el primero no ordenado
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
