package T1_2E7;

public class MergeSort {
	
	public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        // Dividir el arreglo en dos mitades
        int mid = arr.length / 2;
        int[] izq = new int[mid];
        int[] der = new int[arr.length - mid];

        // Copiar los elementos en los subarreglos
        System.arraycopy(arr, 0, izq, 0, mid);
        System.arraycopy(arr, mid, der, 0, arr.length - mid);

        // Ordenar recursivamente ambas mitades
        mergeSort(izq);
        mergeSort(der);

        // Fusionar las mitades ordenadas
        merge(arr, izq, der);
    }

    // Método para fusionar dos mitades ordenadas en un solo arreglo ordenado
    private static void merge(int[] arr, int[] izq, int[] der) {
        int i = 0, j = 0, k = 0;

        // Fusionar los arreglos mientras haya elementos en ambos
        while (i < izq.length && j < der.length) {
            if (izq[i] <= der[j]) {
                arr[k++] = izq[i++];
            } else {
                arr[k++] = der[j++];
            }
        }

        // Si quedan elementos en la mitad izquierda
        while (i < izq.length) {
            arr[k++] = izq[i++];
        }

        // Si quedan elementos en la mitad derecha
        while (j < der.length) {
            arr[k++] = der[j++];
        }
    }
	
}
