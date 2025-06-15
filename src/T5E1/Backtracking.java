package T5E1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Backtracking {
	private HashMap<String, List<String>> grafo = new HashMap<String, List<String>>();
	private ArrayList<String> mejorCamino = new ArrayList<String>();
	
	public void agregarConexion(String desde, String hasta) {
		if(!grafo.containsKey(desde)) {
			grafo.put(desde, new ArrayList<String>());
		}
		grafo.get(desde).add(hasta); // hace la conexion entre los adyacente
	}
	
	//metodo para buscar el mejor camino
	public ArrayList<String> encontrarElMejorCamino(String entrada, String salida){
		System.out.println(grafo);
		Set<String> visitadas = new HashSet<String>();
		ArrayList<String> caminoActual = new ArrayList<String>();
		visitadas.add(entrada);
		caminoActual.add(entrada);
		System.out.println(visitadas);
		System.out.println(caminoActual);
		System.out.println(mejorCamino);
		System.out.println(entrada);
		System.out.println(salida);
		this.buscarCamino(entrada,salida,visitadas,caminoActual);
		return mejorCamino;
	}
	
	
	// este es el metodo que hace la recursividad para el funciones el algoritmo de backtracking
	public void buscarCamino(String actual, String salida, Set<String> visitadas, ArrayList<String> caminoActual) {
		System.out.println("Entro en el metodo del mejor camino");
		System.out.println(actual);
		System.out.println(salida);
		System.out.println(visitadas);
		System.out.println(caminoActual);
		if(actual.equals(salida)) {
			System.out.println("entro en este if");
			if(caminoActual.size() > this.mejorCamino.size()) {
				this.mejorCamino = new ArrayList<String>(caminoActual);
				System.out.println("Mejor camino");
				System.out.println(this.mejorCamino);
			}
		}
		else {
			System.out.println("entro en el else ");
			if(grafo.containsKey(actual)) {
				for(String vecino : grafo.get(actual)) {
					if(!visitadas.contains(vecino)) {
						visitadas.add(vecino);
						caminoActual.add(vecino);
						this.buscarCamino(vecino, salida, visitadas, caminoActual);
						caminoActual.remove(caminoActual.size()-1);
						visitadas.remove(vecino);
					}
				}
			}
		}
	}
}
