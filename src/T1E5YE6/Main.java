package T1E5YE6;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		MySimpleLinkedList<Integer> list1 = new MySimpleLinkedList<Integer>();
		list1.insertFront(2);
		list1.insertFront(99);
		list1.insertFront(7);
		list1.insertFront(1);
		list1.insertFront(8);
		
		MySimpleLinkedList<Integer> list2 = new MySimpleLinkedList<Integer>();
		list2.insertFront(5);
		list2.insertFront(2);
		list2.insertFront(1);
		list2.insertFront(3);
		list2.insertFront(7);
		
		MySimpleLinkedList<Integer> list3 = new MySimpleLinkedList<Integer>();
		
		// ejercicio5 
		// a) Las listas están desordenadas y la lista resultante debe quedar ordenada. la complejidad computacional con el foreach 
		//    es de O(n^2) suponiendo que las dos lista tenga el mismo tamaño.
		// b) Las listas están ordenadas y la lista resultante debe mantenerse ordenada. la complejidad computacional con el foreach 
		//    es de O(2n) suponiendo que las dos lista tenga el mismo tamaño.
		for (Integer l1 : list1) {
			for (Integer l2 : list2) {
				if(l1.equals(l2)) {
					list3.insertOrdered(l1);
				}
			}
        }
		
		System.out.println("Lista numero 3 ordenada cuando existen elementos iguales en las dos listas");
		System.out.println(list3);
		
		// ejercicio6
		MySimpleLinkedList<Integer> list4 = new MySimpleLinkedList<Integer>();
		Iterator<Integer> iter1 = list1.iterator();

		 while (iter1.hasNext()) {
	            Integer info1 = iter1.next();
	            Iterator<Integer> iter2 = list2.iterator();
	            boolean noComun = true;
	            while (iter2.hasNext()) {
	                Integer info2 = iter2.next();

	                if (info1.equals(info2)) {
	                    noComun = false;
	                    break;
	                }
	            }
	            // Agregar si es elemento no comun y ya se recorrió toda la lista 2
	            if (noComun) {
	                list4.insertOrdered(info1);
	            }
	    }
		
		System.out.println("Lista numero 4 ordenada cuando solamente los elementos estan en la primera lista");
		System.out.println(list4);
		
	}

}
