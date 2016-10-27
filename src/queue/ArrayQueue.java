package queue;

public class ArrayQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public ArrayQueue(int queueSize){
		this.front= -1;
		this.rear = -1;
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
		if(rear==this.queueSize-1){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public void enQueue(char item) {
		if(isFull()){
			System.out.println("입력할 공간이 없습니다.");
			return;
		}
		else{
			itemArray[++rear]=item;
		}
	}

	@Override
	public char deQueue() {
		if(isEmpty()){
			System.out.println("삭제할 아이템이 없습니다.");
			return 0;
		}
		else{
			return itemArray[++front];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()){
			System.out.println("삭제할 아이템이 없습니다.");
			return ;
		}
		else{
			++front;
		}
	}

	@Override
	public void peek() {
		if(isEmpty()){
			System.out.println("아이템이 없습니다.");
			return ;
		}
		else{
		System.out.println("첫번째 원소 : " + itemArray[++front]); 
		}
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.println("아이템이 없습니다.");
			return;
		}
		else{
			System.out.print("Queue >> ");
			for(int i=front+1;i<=rear;i++){
				System.out.print(itemArray[i] +"\t");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		ArrayQueue q = new ArrayQueue(5);
		
		q.enQueue('A');
		q.printQueue();
		
		q.enQueue('B');
		q.printQueue();
		
		q.enQueue('C');
		q.printQueue();

		char deleteItem = q.deQueue();
		System.out.println("삭제할 원소 : " + deleteItem);
		q.printQueue();
		
		deleteItem = q.deQueue();
		System.out.println("삭제할 원소 : " + deleteItem);
		q.printQueue();
		
		deleteItem = q.deQueue();
		System.out.println("삭제할 원소 : " + deleteItem);
		q.printQueue();

	}

}
