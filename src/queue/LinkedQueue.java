package queue;

public class LinkedQueue implements Queue {
	
	QNode front;
	QNode rear;
	
	public class QNode{
		char data;
		QNode link;
	}
	
	public LinkedQueue(){
		front = null;
		rear =null;
	}
	@Override
	public boolean isEmpty() {
		return (front==null);
	}

	@Override
	public void enQueue(char item) {
		QNode newNode = new QNode();
		
		newNode.data = item;
		newNode.link = null;
		
		if(isEmpty()){
			front = newNode;
			rear = newNode;

		}
		else{
			rear.link = newNode;
			rear = newNode;
		}
		System.out.println("insert : " + item);
	}

	@Override
	public char deQueue() {
		if(isEmpty()){
			System.out.println("삭제할 원소가 없습니다.");
			return 0;
		}
		else{
			char item = front.data;
			front = front.link;
			if(front == null){
				rear = null;
			}
			return item;
		}
	}

	@Override
	public void delete() {
		if(isEmpty()){
			System.out.println("삭제할 원소가 없습니다.");
		}
		else{
			front = front.link;
			if(front == null){
				rear = null;
			}
		}
	}

	@Override
	public void peek() {
		if(isEmpty()){
			System.out.println(" 원소가 없습니다.");
		}
		else{
			System.out.println(front.data);
		}
	}
	public void printQueue(){
		if(isEmpty()){
			System.out.println("원소가 없습니다.");
		}
		else{
			QNode temp = front;
			System.out.print("Linked Queue >>  ");
			
			while(temp!=null){
				
				System.out.print(temp.data + "\t");
				temp = temp.link;
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		LinkedQueue lq = new LinkedQueue();
		
		lq.enQueue('A');
		lq.printQueue();
		
		lq.enQueue('B');
		lq.printQueue();
		
		lq.enQueue('C');
		lq.printQueue();
		
		char deleteItem = lq.deQueue();
		System.out.println(deleteItem);
		
		deleteItem = lq.deQueue();
		System.out.println(deleteItem);
		
		deleteItem = lq.deQueue();
		System.out.println(deleteItem);
		
		deleteItem = lq.deQueue();
		System.out.println(deleteItem);
	}

}
