package T1_2E5;

public class VerificarIndice {
	
	public static boolean verificarIndice(int[] arr, int index) {
		
		if(index >= arr.length)
			return false;
		if(arr[index] == index)
			return true;
		return verificarIndice(arr, index+1);
	}
}
