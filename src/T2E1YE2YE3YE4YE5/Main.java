package T2E1YE2YE3YE4YE5;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Tree arbol = new Tree();
        int[] valores = {8, 3, 21, 10, 1, 6, 14, 4, 7, 13}; // Insertamos los valores del ejemplo
        for (int v : valores) {
        	System.out.println(v);
            arbol.insert(v);
        }

        arbol.delete(20);
        System.out.println("\n");
        System.out.println("nivel: " + arbol.getHeigth());
        arbol.printInOrder();
        System.out.println("\n");
        arbol.printPosOrder();
        System.out.println("\n");
        arbol.printPreOrder();
        System.out.println("\n");
        List<Integer> rama = arbol.getLongestBranch();
        System.out.println("Rama mas larga del arbol: " + rama);
        System.out.println("\n");
        // Probar getMaxElem
        Integer max = arbol.getMaxElem();
        System.out.println("Elemento máximo del árbol: " + max);
        System.out.println("\n");
        // Probar getElemAtLevel
        int nivel = 2;
        List<Integer> elementosNivel = arbol.getElemAtLevel(nivel);
        System.out.println("Elementos en el nivel " + nivel + ": " + elementosNivel);
        System.out.println("\n");
        System.out.println("Suma total del arbol: " + arbol.suma());
        
        //probando el ejercicio3
        System.out.println("\n");
        Tree arbol1 = new Tree();
        int[] valores1 = {6, 2, 10, 1, 4, 8, 11, 7, 9};
        for (int v : valores1) {
            arbol1.insert(v);
        }

        int k = 8;
        List<Integer> hojasMayores = arbol1.getHojasMayores(k);
        System.out.println("Hojas con valor mayor a " + k + ": " + hojasMayores);

        
        //probando el ejercicio4
        Tree arbol5 = new Tree();
        int[] arr = { 14,7,-5,9,20 };
        for (int v1 : arr) {
            arbol5.insert(v1);
		}

		
		arbol5.setPreEj4();
		arbol5.completarValores();
		arbol5.printPreOrder();
		System.out.println("\n");
		//ejercicio5
		Tree tree = new Tree();
		
		tree.insert(6,"M");
		tree.insert(1,"A");
		tree.insert(0,"L");
		tree.insert(3,"N");
		tree.insert(2,"A");
		tree.insert(4,"O");
		tree.insert(9,"I");
		tree.insert(7,"S");
		tree.insert(8,"A");
		tree.insert(10,"O");

		System.out.println("Ramas de 0 vocales " + tree.getBranchesOfNVowels(0).toString());
		System.out.println("Ramas de 1 vocales " + tree.getBranchesOfNVowels(1).toString());
		System.out.println("Ramas de 2 vocales " + tree.getBranchesOfNVowels(2).toString());
		System.out.println("Ramas de 3 vocales " + tree.getBranchesOfNVowels(3).toString());
	}

}
