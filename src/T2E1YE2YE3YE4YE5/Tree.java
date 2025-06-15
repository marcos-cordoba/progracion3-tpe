package T2E1YE2YE3YE4YE5;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	
	private TreeNode root;
	
	public Tree() {
		this.root = null;
	}
	
	public Tree(TreeNode root) {
		this.root = root;
	}
	
	public Integer getRoot() {
		if(!this.isEmpty()) 
			return null;
		return this.root.getValue();
	}
	
	public boolean hasElem(Integer value) {
		return this.search(this.root, value);
	}
	
	private boolean search(TreeNode node, Integer value) {
		if(node == null)
			return false;
		if(node.getValue() == value)
			return true;
		if(value < node.getValue()) {
			return search(node.getLeft(), value);
		} else {
			return search(node.getRight(), value);
		}
	}
	
	private boolean isEmpty() {
		return this.root == null;
	}
	
	public void insert(Integer value) {
		TreeNode newNode = new TreeNode(value);
		if (this.isEmpty()) {
			this.root = newNode;
		} else {
			this.insert(this.root, newNode);
		}
	}

	public void insert(Integer value, String character) {
		TreeNode newNode = new TreeNode(value, character);
		if (this.isEmpty()) {
			this.root = newNode;
		} else {
			insert(this.root, newNode);
		}
	}

	private void insert(TreeNode node, TreeNode newNode) {
		int result = node.getValue().compareTo(newNode.getValue());
		if (result < 0) {
			if (node.getRight() == null) {
				node.setRight(newNode);
			} else {
				insert(node.getRight(), newNode);
			}
		} else {
			if (node.getLeft() == null) {
				node.setLeft(newNode);
			} else {
				insert(node.getLeft(), newNode);
			}
		}

	}
	
	public boolean delete(Integer value) {
	    if (!hasElem(value)) {
	        return false;
	    }
	    root = deleteNode(root, value);
	    return true;
	}

	private TreeNode deleteNode(TreeNode nodo, Integer value) {
	    if (nodo == null) {
	        return null;
	    }
	    if (value < nodo.getValue()) {
	        nodo.setLeft(deleteNode(nodo.getLeft(), value)); // Reasignación correcta
	    } else if (value > nodo.getValue()) {
	        nodo.setRight(deleteNode(nodo.getRight(), value)); // Reasignación correcta
	    } else {
	        // Caso 1: Nodo sin hijos
	        if (nodo.getLeft() == null && nodo.getRight() == null) {
	            return null;
	        }
	        // Caso 2: Nodo con un solo hijo
	        if (nodo.getLeft() == null) {
	            return nodo.getRight();
	        }
	        if (nodo.getRight() == null) {
	            return nodo.getLeft();
	        }
	        // Caso 3: Nodo con dos hijos
	        TreeNode sucesor = encontrarMinimo(nodo.getRight()); 
	        nodo.setValue(sucesor.getValue()); // Reemplazar el valor del nodo
	        nodo.setRight(deleteNode(nodo.getRight(), sucesor.getValue())); // Eliminar el sucesor
	    }
	    return nodo;
	}

	private TreeNode encontrarMinimo(TreeNode nodo) {
	    while (nodo.getLeft() != null) {
	        nodo = nodo.getLeft();
	    }
	    return nodo;
	}
	
	public int getHeigth() {
		return getHeigthTree(this.root);
	}
	
	private int getHeigthTree(TreeNode nodo) {
		if(nodo == null) {
			return -1;
		}
		int alturaIzquierda = this.getHeigthTree(nodo.getLeft());
		int alturaDerecha = this.getHeigthTree(nodo.getRight());
		return Math.max(alturaIzquierda, alturaDerecha) + 1;
	}
	
	public void printInOrder() {
		printInOrderTree(this.root);
	}
	
	private void printInOrderTree(TreeNode nodo) {
		if (nodo != null) {
	        printInOrderTree(nodo.getLeft());
	        System.out.print(nodo.getValue() + " ");
	        printInOrderTree(nodo.getRight());
	    }
	}
	
	public void printPreOrder() {
		printPreOrderTree(this.root);
	}
	
	private void printPreOrderTree(TreeNode nodo) {
		if (nodo != null) {
	        System.out.print(nodo.getValue() + " ");
	        printPreOrderTree(nodo.getLeft());
	        printPreOrderTree(nodo.getRight());
	    }
	}
	
	public void printPosOrder() {
		printPosOrderTree(this.root);
	}
	
	private void printPosOrderTree(TreeNode nodo) {
		if (nodo != null) {
	        printPosOrderTree(nodo.getLeft());
	        printPosOrderTree(nodo.getRight());
	        System.out.print(nodo.getValue() + " ");
	    }
	}
	
	public List<Integer> getLongestBranch(){
		List<Integer> actaul = new ArrayList<Integer>();
		List<Integer> ramaLarga = new ArrayList<Integer>();
		getLongestBranchTree(this.root, actaul, ramaLarga);
		return ramaLarga;
	}
	
	private void getLongestBranchTree(TreeNode nodo, List<Integer> actual, List<Integer> ramaLarga) {
		if(nodo == null) {
			return;
		}
		actual.add(nodo.getValue());
		if(nodo.isLeaft()) {
			if(actual.size() > ramaLarga.size()) {
				ramaLarga.clear();
				ramaLarga.addAll(actual);
			}
		}
		getLongestBranchTree(nodo.getLeft(), actual, ramaLarga);
		getLongestBranchTree(nodo.getRight(), actual, ramaLarga);
		actual.remove(actual.size() - 1);
	}
	
	public List<Integer> getFrontera(){
		List<Integer> frontera = new ArrayList<Integer>();
		getFronteraTree(this.root, frontera);
		return frontera;
	}
	
	private void getFronteraTree(TreeNode nodo, List<Integer> frontera) {
		if(nodo == null) {
			return;
		}
		if(nodo.isLeaft()) {
			frontera.add(nodo.getValue());
		}
		getFronteraTree(nodo.getLeft(), frontera);
		getFronteraTree(nodo.getRight(), frontera);
	}
	
	public Integer getMaxElem() {
		return getMaxElemTree(this.root);
	}
	
	private Integer getMaxElemTree(TreeNode nodo) {
		if(nodo == null) {
			return null;
		}
		if(nodo.getRight() == null) {
			return nodo.getValue();
		}
		return getMaxElemTree(nodo.getRight());
	}
	
	public List<Integer> getElemAtLevel(int level){
		List<Integer> lista = new ArrayList<Integer>();
		getElemAtLevelTree(this.root, 0, level, lista);
		return lista;
	}
	
	private void getElemAtLevelTree(TreeNode nodo, int actual, int level, List<Integer> lista) {
		if(nodo == null) {
			return;
		}
		if(actual == level) {
			lista.add(nodo.getValue());
		}
		actual+=1;
		getElemAtLevelTree(nodo.getLeft(), actual, level, lista);
		getElemAtLevelTree(nodo.getRight(), actual, level, lista);
		actual-=1;
	}
	
	//Ejercicio2
	public int suma() {
		return sumaTree(this.root);
	}
	
	private int sumaTree(TreeNode nodo) {
		if(nodo == null) {
			return 0;
		}
		return nodo.getValue() + sumaTree(nodo.getLeft()) + sumaTree(nodo.getRight());
	}
	
	//Ejercicio3
	public List<Integer> getHojasMayores(int k){
		List<Integer> lista = new ArrayList<Integer>();
		getHojasMayoresTree(this.root, k, lista);
		return lista;
	}
	
	private void getHojasMayoresTree(TreeNode nodo, int k, List<Integer> lista) {
		if(nodo == null) {
			return;
		}
		if((nodo.getLeft() == null && nodo.getRight() == null) && nodo.getValue() > k) {
			lista.add(nodo.getValue());
		}
		getHojasMayoresTree(nodo.getLeft(), k, lista);
		getHojasMayoresTree(nodo.getRight(), k, lista);
	}
	
	//Ejercicio4
	public void setPreEj4() {
		setPreEj4Tree(this.root);
	}
	
	private void setPreEj4Tree(TreeNode nodo) {
		if(nodo == null) {
			return;
		}
		if(!nodo.isLeaft()) {
			nodo.setValue(null);
		}
		setPreEj4Tree(nodo.getLeft());
		setPreEj4Tree(nodo.getRight());
	}
	
	public void completarValores() {
		completarValoresRecursivo(this.root);
	}
	
	private void completarValoresRecursivo(TreeNode nodo) {
		if(nodo == null) {
			return;
		}
		if(nodo.isLeaft()) {
			return;
		}
		completarValoresRecursivo(nodo.getLeft());
		completarValoresRecursivo(nodo.getRight());
		int izq;
		if(nodo.getLeft() == null) {
			izq = 0;
		} else {
			izq = nodo.getLeft().getValue();
		}
		int der;
		if(nodo.getRight() == null) {
			der = 0;
		} else {
			der = nodo.getRight().getValue();
		}
		nodo.setValue(der - izq);
	}
	
	//ejercicio5
	public List<String> buscarPalabrasConVocales(int n){
		List<String> resultado = new ArrayList<String>();
		buscarRecursiva(this.root, "", resultado, n);
		return resultado;
	}
	
	private void buscarRecursiva(TreeNode nodo, String palabraActual, List<String> result, int n) {
		if(nodo == null) {
			return;
		}
		palabraActual += nodo.getValue();
		if(nodo.isLeaft()) {
			int cantidadVocales = contarVocales(palabraActual);
			if(cantidadVocales == n) {
				result.add(palabraActual);
			}
		} else {
			buscarRecursiva(nodo.getLeft(), palabraActual, result, n);
			buscarRecursiva(nodo.getRight(), palabraActual, result, n);
		}
	}
	
	private int contarVocales(String palabra) {
		int cont = 0;
		for(char c : palabra.toUpperCase().toCharArray()) {
			if("AEIOU".indexOf(c) >= 0) {
				cont++;
			}
		}
		return cont;
	}
	
	
	//Ejercicio5
	public List<List<Integer>> getBranches() {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> listAux = new ArrayList<Integer>();
		getBranchesTree(root, listAux, result);
		return result;
	}

	private void getBranchesTree(TreeNode node, List<Integer> listAux, List<List<Integer>> result) {
		if (node == null) {
			return;
		}
		listAux.add(node.getValue());
		if (node.isLeaft()) {
			result.add(new ArrayList<Integer>(listAux));
		} else {
			getBranchesTree(node.getLeft(), listAux, result);
			getBranchesTree(node.getRight(), listAux, result);
		}
		listAux.remove(listAux.size() - 1);
	}

	public List<List<String>> getBranchesOfNVowels(int N) {
		List<List<String>> result = new ArrayList<List<String>>();
		List<String> listAux = new ArrayList<String>();
		getBranchesOfNVowelsTree(root, listAux, result, N);
		return result;
	}

	private void getBranchesOfNVowelsTree(TreeNode node, List<String> listAux, List<List<String>> result, int N) {
		if (node == null) {
			return;
		}
		listAux.add(node.getCharacter());
		if (node.isLeaft()) {
			if (totalWowels(listAux) == N) {
				result.add(new ArrayList<String>(listAux));
			}
		} else {
			getBranchesOfNVowelsTree(node.getLeft(), listAux, result, N);
			getBranchesOfNVowelsTree(node.getRight(), listAux, result, N);
		}

		listAux.remove(listAux.size() - 1);
	}

	private int totalWowels(List<String> listAux) {
		int total = 0;
		for (String c : listAux) {
			if (c == "A" || c == "E" || c == "I" || c == "O" || c == "U") {
				total++;
			}
		}
		return total;
	}
	
}
