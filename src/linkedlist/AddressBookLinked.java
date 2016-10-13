package linkedlist;

public class AddressBookLinked {
	
	private Node head;
	
	@Override
	public String toString() {
		return "AddressBookLinked [head=" + head + "]";
	}
	
	// 주소록 추가
	public void insertInfo(String name,String address,String email){
		Node newNode = new Node(name,address,email);
		newNode.link=null;
		
		if(head==null){
			head=newNode;
			newNode.link=null;
			return;
		}
		else{
			
		Node temp = head;

		while(temp.link !=null){
			temp = temp.link;
		}
		
		temp.link=newNode;
		
		//System.out.println(temp);
		}
	}
	
	// 주소록 검색
	public Node serchNode(String name){
		Node temp = head;
		Node result = null;
		
		while(temp.link !=null){
			if(temp.name.equals(name)){
				result= temp;
				break;
			}
			temp = temp.link;
		}
		return result;
	}
	
	//주소록 삭제
	public Node deleteNode(String name){
		Node old = serchNode(name);
		if(old==null){
			System.out.println("등록되지 않은 주소록 입니다.");
			return null;
		}
		Node temp = head;
		while(temp.link!=old){
			temp = temp.link;
		}
		temp.link=old.link;
		
		System.out.println(old + "가 삭제되었습니다.");
		return old;
	}
	
	//주소록 출력
	public void printNode(){
		if(head==null){
			System.out.println("주소록이 없습니다.");
			return;
		}
		Node temp = head;
		
		System.out.println("등록된 주소록");
		while(temp.link!=null){
			System.out.println("주소록 [이름 : "+temp.name+ ","
							 + "주소 : "+temp.address+","
							 + "이메일 : "+temp.email+ "]");
			temp = temp.link;
		}
		System.out.println("주소록 [이름 : "+temp.name+ ","
				 + "주소 : "+temp.address+","
				 + "이메일 : "+temp.email+ "]");
	}
}

