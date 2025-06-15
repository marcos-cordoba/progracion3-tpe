package T1_2E7;

public class Main {

	public static void main(String[] args) {
		
		int[] arr1 = {15, 34, 9, 12, 22, 11, 75};
		int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
		
		MergeSort.mergeSort(arr1);
		QuickSort.quickSort(arr2, 0, arr2.length-1);
		
		System.out.println("Arreglo ordenado por mergeSort:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nArreglo ordenado por quickSort:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n \n Para el caso de ordenamiento del merge sort la complejidad \n del peor de los caso va a ser O(n log n) tambien para el caso promedio");
        System.out.println("\n Para el caso de ordenamiento del quick sort la complejidad \n del peor de los cado va a ser O(n^2) pero en el caso promedio va a ser O(n log n)");
	}

}
