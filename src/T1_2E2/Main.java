package T1_2E2;

public class Main {

	public static void main(String[] args) {
		
		int [] arr = {1,3,5,7,9,11,13,15};
		
		int resultado = BusquedaBinaria.busquedaBinariaRecursiva(arr, 9, 0, 7);
		
		System.out.println("Se encontro en la posicion: " + resultado);
		
	}

}
