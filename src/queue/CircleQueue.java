package queue;

public class CircleQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public CircleQueue(int queueSize){
		this.front= 0;
		this.rear = 0;
		this.queueSize=queueSize;
		this.itemArray=new char[this.queueSize];
	}
	
	@Override
	public boolean isEmpty() {
		if(front==rear){
			return true;
		}
		else{
		return false;
		}
	}
	
	public boolean isFull(){
		return (((rear+1)%this.queueSize)==front);
	
	}

	@Override
	public void enQueue(char item) {
		if(isFull()){
			System.out.println("입력할 공간이 없습니다.");
		}
		else{
			rear=(rear+1)%this.queueSize;
			itemArray[rear]=item;
		}
	}

	@Override
	public char deQueue() {
		if(isEmpty()){
			System.out.println("삭제할 아이템이 없습니다.");
			return 0;
		}
		else{
			front = (front+1) % this.queueSize;
			return itemArray[front];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()){
			System.out.println("삭제할 아이템이 없습니다.");
			return ;
		}
		else{
			front = (front+1) % this.queueSize;
		}
	}

	@Override
	public void peek() {
		if(isEmpty()){
			System.out.println("아이템이 없습니다.");
			return ;
		}
		else{
			front = (front+1) % this.queueSize;
			System.out.println("첫번째 원소 : " + itemArray[front]); 
		}
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.println("아이템이 없습니다.");
			return;
		}
		else{
			System.out.print("Queue >> ");
			for(int i=(front+1)%this.queueSize;
					i!=(rear+1)%this.queueSize;
					i=++i%this.queueSize){
				System.out.print(itemArray[i] +"\t");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		CircleQueue c = new CircleQueue(4);
		
		c.enQueue('A');
		c.printQueue();
		
		c.enQueue('B');
		c.printQueue();
		
		c.enQueue('C');
		c.printQueue();
		
		c.enQueue('D');
		c.printQueue();
		
		
//		char deleteItem = c.deQueue();
//		System.out.println(deleteItem);
//		c.printQueue();
//		
//		c.enQueue('C');
//		c.printQueue();
//		
//		c.enQueue('D');
//		c.printQueue();
//		
//		c.enQueue('E');
//		c.printQueue();

	}

}
