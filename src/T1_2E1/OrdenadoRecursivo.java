package T1_2E1;

public class OrdenadoRecursivo {
	
	public static boolean isOrder(Number[] arr, int i) {
		// Este es el caso base, en el cual se llega al final del arreglo y esta ordenado
		if(i == arr.length -1 ) {
			return true;
		}
		// Verificamos si el elemento actual es mayor al siguiente
		if(arr[i].intValue() > arr[i + 1].intValue()) {
			return false;
		}
		//llamado recursino para el siguiente elemento
		return isOrder(arr, i+1);
	}
}
