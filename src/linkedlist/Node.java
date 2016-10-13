package linkedlist;

public class Node {
	public String name;
	public String address;
	public String email;
	public Node link;
	
	public Node(String name,String address,String email){
		this.name= name;
		this.address=address;
		this.email=email;
		}

	@Override
	public String toString() {
		return "주소록 [이름 : " + name + ", 주소 : " + address + ", 이메일 : " + email + "]";
	}
}
