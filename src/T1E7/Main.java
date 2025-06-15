package T1E7;

public class Main {

	public static void main(String[] args) {
		
		MyDoubleLinkedList<Number> list = new MyDoubleLinkedList<Number>();
		System.out.println("Size: " + list.size());
		System.out.println("Is empty: " + list.isEmpty());
		
		list.insertFront(2);
		System.out.println("Size: " + list.size());
		System.out.println("Is empty: " + list.isEmpty());
		
		System.out.println("ExtractFront: " + list.extractFront());
		System.out.println("Size: " + list.size());
		System.out.println("Is empty: " + list.isEmpty());
		
		list.insertFront(5);
		list.insertFront(7);
		list.insertFront(1);
		list.insertFront(3);
		
		System.out.println("Size: " + list.size());
		System.out.println("Is empty: " + list.isEmpty());
		
		int index = 2;
		System.out.println("Value in index " + index + ": " + list.get(index));
		
		System.out.println(list);
	}

}
