public class LinkedList {

	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node{
		private Object data;
		private Node next;
		
		public Node(Object input){
			this.data=input;
			this.next=null;
		}
		public String toString(){
			return String.valueOf(this.data);
		}
	}
	public void addFirst(Object input){
		Node newNode = new Node(input);
		newNode.next=head;
		head = newNode;
		size++;
		if(head.next==null){
			tail=head;
		}
	}
	
	public void addLast(Object input){
		Node newNode = new Node(input);
		if(size==0){
			addFirst(input);
		}else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public Node node(int index){
		Node x = head;
		for(int i = 0; i <index; i++){
		x = x.next;
		}
		return x;
	}
	
	public void add(int k, Object input){
		if(k==0){
			addFirst(input);
		}
		else{
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			if(newNode.next == null){
				tail = newNode;
			}
		}
	}
	public String toString(){
		if(head==null){
			return "X";
		}
		Node temp = head;
		while(temp.next !=null){
			System.out.println(temp.data+", ");
			temp = temp.next;
		}
		System.out.println(temp.data);
		return "";
	}
	
	public Object removeFirst(){
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		size--;
		return returnData;
	}
	public Object remove(int k){
		if(k==0){
			return removeFirst();
		}
		else{
			Node temp = node(k-1);
			Node deleteNode = temp.next;
			temp.next = temp.next.next;			
			if(deleteNode == tail){
				tail = temp;
			}
			size --;
			return deleteNode.data;
		}
	}
	public Object removeLast(){
		return remove(size-1);
	}
	
	
	
	
	
	
	
}
