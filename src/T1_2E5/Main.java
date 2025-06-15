package T1_2E5;

public class Main {

	public static void main(String[] args) {

		int[] arr = {-3,-1,0,2,4,6,20};
		boolean resultado = VerificarIndice.verificarIndice(arr, 0);
		System.out.println("¿Existe un elemento tal que A[i] == i? " + resultado);

	}

}
