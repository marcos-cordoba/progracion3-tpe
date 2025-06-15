package T1_2E3;

public class DecimalABinarioRecursivo {
	
	public static String convertirBinario(int num) {
		
		if(num == 0)
			return "0";
		if(num == 1)
			return "1";
		return convertirBinario(num/2) + (num%2);
	}
}
