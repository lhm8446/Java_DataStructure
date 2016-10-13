package linearlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
//		list.addLast(10);
//		list.addLast(20);
//		list.addLast(30);		
		System.out.println(list.removeLast());
	}
}
