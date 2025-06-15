package T1_2E4;

public class FibonacciRecursivo {
	
	public static int fibonacci(int num) {
		if(num == 0)
			return 0;
		if(num == 1)
			return 1;
		return fibonacci(num - 1) + fibonacci(num - 2);
	}
	
	public static void mostrarFibonacci(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(fibonacci(i) + " ");
		}
	}

}
