package T5E1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Backtracking grafo = new Backtracking();

        // Agregar conexiones al grafo
        grafo.agregarConexion("A", "B");
        grafo.agregarConexion("A", "C");
        grafo.agregarConexion("B", "D");
        grafo.agregarConexion("C", "D");
        grafo.agregarConexion("D", "E");
        grafo.agregarConexion("B", "E");
        grafo.agregarConexion("C", "E");

        // Definir el nodo de entrada y el de salida
        String entrada = "A";
        String salida = "E";

        // Buscar el mejor camino
        ArrayList<String> mejorCamino = grafo.encontrarElMejorCamino(entrada, salida);
        // Imprimir el mejor camino encontrado
        if (mejorCamino.isEmpty()) {
            System.out.println("No se encontró un camino de " + entrada + " a " + salida);
        } else {
            System.out.println("Mejor camino de " + entrada + " a " + salida + ": " + mejorCamino);
        }
	}
}
