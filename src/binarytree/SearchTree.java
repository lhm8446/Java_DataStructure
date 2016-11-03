package binarytree;

public class SearchTree {
	
	private Node root;
	
	public class Node{
		char data;
		Node right;
		Node left;
	}
	
	public Node insertKey(Node root,char data){
		Node temp = root;
		Node newNode = new Node();
		newNode.data = data;
		newNode.right = null;
		newNode.left = null;
		if(temp==null){
			return newNode;
		}
		else if(newNode.data < temp.data){
			temp.left = insertKey(temp.left,data);
			return temp;
		}else if(newNode.data > temp.data){
			temp.right = insertKey(temp.right, data);
			return temp;
		}else{
			return temp;	
		}
	}
	
	public void insertTree(char data){
		root = insertKey(root,data);
	}
	
	public Node searchKey(char data){
		Node temp =  root;
		while(temp!=null){
			if(data < temp.data){
				temp = temp.left;
			}
			else if(data > temp.data){
				temp = temp.right;
			}
			else return temp;
		}
		return temp;
	}
	
	public void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.print(root.data + "\t");
			inorder(root.right);
		}
	}
	
	public void printTree(){
		System.out.print("트리   : \t");
		inorder(root);
		System.out.println("");
		
	}
	public static void main(String[] args) {
		SearchTree st = new SearchTree();
		
		st.insertTree('G');
		st.insertTree('I');
		st.insertTree('H');
		st.insertTree('D');
		st.insertTree('B');
		st.insertTree('M');
		st.insertTree('N');
		st.insertTree('A');
		st.insertTree('J');
		st.insertTree('E');
		st.insertTree('Q');
		
		st.printTree();
		
		Node test = st.searchKey('C');
		if(test!=null){
			System.out.println("검색한 트리 : " + test.data);
		}else if(test==null){
			System.out.println("검색결과가 업습니다.");
		}
	}
}
