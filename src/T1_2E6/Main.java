package T1_2E6;

public class Main {

	public static void main(String[] args) {

		int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
		int[] arr2 = {64, 25, 12, 22, 11};
		
		OrdenamientoPorSeleccion.ordenamientoPorSeleccion(arr1);
		OrdenamientoPorBurbujeo.ordenamientoPorBurbujeo(arr2);
		
		System.out.println("Arreglo ordenado por seleccion:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nArreglo ordenado burbujeo:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nLa compeljidad que tiene ambos algoritmo es de O(n^2)");
	}

}
