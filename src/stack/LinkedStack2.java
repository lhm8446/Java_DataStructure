package stack;

public class LinkedStack2 {
private StackNode top;
	
	public class StackNode{
		int data;
		StackNode link;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}

	public void push(int item) {
		StackNode newnode = new StackNode();
		newnode.data = item;
		newnode.link = top;
		
		top = newnode;
		System.out.println("insert :"+ item);
	}
	
	public int pop() {
		if(isEmpty()){
			System.out.println("스택이 비었습니다");
			return 0 ;
		}
		else{
			int item = top.data;
			top = top.link;
			return item;
		}
	}
}
