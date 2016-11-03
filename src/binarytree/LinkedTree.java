package binarytree;

public class LinkedTree {

	public class Node{
		Object data;
		Node left;
		Node right;
	}
	
	public Node make(Node left,Object data,Node right){
		Node root = new Node();
		root.data = data;
		root.left = left;
		root.right = right;
		return root;
	}
	
	public void preorder(Node root){
		if(root != null){
			System.out.print(root.data + "\t");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void inorder(Node root){
		if(root != null){
			inorder(root.left);
			System.out.print(root.data + "\t");
			inorder(root.right);
		}
	}
	
	public void postorder(Node root){
	if(root != null){
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + "\t");
		}
	}
	public static void main(String[] args) {
		LinkedTree t = new LinkedTree();
		
		Node n7 = t.make(null, 'D', null);
		Node n6 = t.make(null, 'C', null);
		Node n5 = t.make(null, 'B', null);
		Node n4 = t.make(null, 'A', null);
		Node n3 = t.make(n6, '/', n7);
		Node n2 = t.make(n4, '*', n5);
		Node n1 = t.make(n2, '-', n3);
		
		System.out.print("전위 : ");
		t.preorder(n1);
		System.out.println("");
		
		System.out.print("중위 : ");
		t.inorder(n1);
		System.out.println("");

		System.out.print("후위 : ");
		t.postorder(n1);
		System.out.println("");

	}

}
