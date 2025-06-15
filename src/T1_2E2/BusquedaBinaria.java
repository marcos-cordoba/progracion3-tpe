package T1_2E2;

public class BusquedaBinaria {
	
	
	public static int busquedaBinariaRecursiva(int[] arr, int value, int inicio, int fin) {
		int medio;
		if(inicio > fin) {
			return -1; // este es el caso si no se encuentra el elemento
		}
		else {
			medio = (inicio + fin) / 2; 
			if(value > arr[medio]) {
				return busquedaBinariaRecursiva(arr, value, medio+1, fin);
			}
			else {
				if(value < arr[medio]) {
					return busquedaBinariaRecursiva(arr, value, inicio, medio-1);
				}
				else {
					return medio;
				}
			}
		}
	}
}
