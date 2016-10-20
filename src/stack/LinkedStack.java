package stack;

public class LinkedStack implements Stack {

	private StackNode top;
	
	public class StackNode{
		char data;
		StackNode link;
	}
	
	@Override
	public boolean isEmpty() {
		return (top == null);
	}

	@Override
	public void push(char item) {
		StackNode newnode = new StackNode();
		newnode.data = item;
		newnode.link = top;
		
		top = newnode;
		System.out.println("insert :"+ item);
	}
	
	@Override
	public char pop() {
		if(isEmpty()){
			System.out.println("스택이 비었습니다");
			return 0 ;
		}
		else{
			char item = top.data;
			top = top.link;
			return item;
		}
	}

	@Override
	public void delete() {
		if(isEmpty()){
			System.out.println("스택이 비었습니다");
		}
		else{
			top = top.link;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()){
			System.out.println("스택이 비었습니다");
			return 0 ;
		}
		else{
			return top.data;
		}
	}

	public void printStack(){
		if(isEmpty()){
			System.out.println("스택이 비었습니다");
		}
		else{
			StackNode temp = top;
			System.out.print("Linked stack  >>  ");
			
			while(temp !=null){
				System.out.print(temp.data + "\t");
				temp = temp.link;
			}
			System.out.println("");
		}
	}
	


	public static void main(String[] args) {
		char deItem;
		LinkedStack ls = new LinkedStack();
		
		ls.push('A');
		ls.printStack();
		
		ls.push('B');
		ls.printStack();
		
		System.out.println(ls.peek());
		
		ls.push('C');
		ls.printStack();
		
		deItem = ls.pop();
		if(deItem != 0){
			System.out.println("삭제된 item" + deItem);
			ls.printStack();
		}
	
		ls.pop();
		ls.printStack();
		
	}
}
