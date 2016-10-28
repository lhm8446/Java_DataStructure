package queue;

public class DQueue {
	DQNode front;
	DQNode rear;
	
	public class DQNode{
		char data;
		DQNode rlink = null;
		DQNode llink = null;
	}
	public boolean isEmpty(){
		return (front==null);
	}

	public void insertfront(char item){
		DQNode newNode = new DQNode();
		newNode.data = item;
		if(isEmpty()){
			front = newNode;
			rear = newNode;
			newNode.rlink = null;
			newNode.llink = null;
		}
		else{
			front.llink = newNode;
			newNode.rlink = front;
			newNode.llink = null;
			front = newNode;
		}
	}
	public char deletefront(){
		if(isEmpty()){
			System.out.println("리스트가 비었습니다.");
			return 0;
		}
		else{
			if(front.rlink==null){
				front = null;
				rear = null;
				return 0;
			}
			DQNode old = front;
			front = front.rlink;
			front.llink = null;
			return old.data;
		}
	}
	
	public void insertRear(char item){
		DQNode newNode = new DQNode();
		newNode.data = item;
		if(isEmpty()){
			front = newNode;
			rear = newNode;
			newNode.rlink=null;
			newNode.llink=null;
		}
		else{
			rear.rlink = newNode;
			newNode.llink = rear;
			newNode.rlink =null;
			rear = newNode;
		}
	}
	
	public char deleteRear(){
		if(isEmpty()){
			System.out.println("리스트가 비었습니다.");
			return 0;
		}
		else{
			if(rear.llink==null){
				front = null;
				rear = null;
				return 0;
			}
			DQNode old = rear;
			rear = rear.llink;
			rear.rlink = null;
			return old.data;
		}
	}
	public void printDQueue(){
		if(isEmpty()){
			System.out.println("리스트가 비었습니다.");
		}
		else{
			DQNode temp = front;
			System.out.print("DQueue >> ");
			while(temp!=null){
				System.out.print(temp.data + "\t");
				temp= temp.rlink;
			} 
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		DQueue dq = new DQueue();
		
		dq.insertfront('A');
		dq.insertRear('A');
		dq.printDQueue();
		
		dq.insertfront('B');
		dq.insertRear('B');
		dq.printDQueue();
		
		dq.insertfront('C');
		dq.insertRear('C');
		dq.printDQueue();
		
		dq.deletefront();
		dq.deleteRear();
		dq.printDQueue();
		
		dq.deletefront();
		dq.deleteRear();
		dq.printDQueue();
		
		dq.deletefront();
		dq.deleteRear();
		dq.printDQueue();
	}
}
