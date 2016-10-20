package stack;

public class ArrayStack implements Stack {
	private int top;
	private int stacksize;
	private char itemArray[];
	
	public ArrayStack(int stackSize){
		top = -1;
		this.stacksize = stackSize;
		itemArray = new char[stackSize];
	}
	
	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull(){
		return (top ==this.stacksize-1);
	}
	
	@Override
	public void push(char item) {
		if(isFull()){
			System.out.println("스택이 꽉찼습니다.");
		}
		else {
			itemArray[++top] = item;
			System.out.println("insert :" + item);
		}
	}

	@Override
	public char pop() {
		if(isEmpty()){
			System.out.println("스택이 비었습니다.");
			return 0;
		}
		else {
			return itemArray[top--];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()){
			System.out.println("스택이 비었습니다.");
		}
		else {
			top--;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()){
			System.out.println("스택이 비었습니다.");
			return 0;
		}
		else {
			return itemArray[top];
		}
	}
	public void printStack(){
		if(isEmpty()){
			System.out.println("스택이 비었습니다.");
		}
		else {
			System.out.println("Stack >>");
			for(int i = 0; i <=top; i++){
				System.out.println(itemArray[i]);
			}
			System.out.println("");
		}
	}
	public static void main(String args[]){
		int stackSize = 5;
		char deletedItem;
		ArrayStack s = new ArrayStack(stackSize);
		
		s.push('A');
		s.printStack();
		
		s.push('B');
		s.printStack();
		
		s.push('C');
		s.printStack();
		
		deletedItem = s.pop();
		deletedItem = s.pop();
		
		if(deletedItem != 0){
			System.out.println("삭제된 item : " + deletedItem);
			s.printStack();
		}

		System.out.println(s.peek());
	}

}
