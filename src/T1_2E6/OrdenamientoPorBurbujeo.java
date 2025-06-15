package T1_2E6;

public class OrdenamientoPorBurbujeo {
	
	public static void ordenamientoPorBurbujeo(int[] arr) {
		int size = arr.length;
		
		//Recorrer todo los elementos del arreglo
		for(int i = 0; i < size-1; i++) {
			// ultimos i elementos ya estan ordenados, por lo que no se revisan
			for(int j = 0; j < size-1; j++) {
				// si el elemento actual es mayjor que el siguiente, los intercambiamos
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
