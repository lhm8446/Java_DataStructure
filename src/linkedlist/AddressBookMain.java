package linkedlist;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		AddressBookLinked abl= new AddressBookLinked();
		
		//주소록 입력받기 , 'quit'입력으로 중지
		while(true){
			System.out.print("이름, 주소, 이메일 입력 : ");
			String info = s.nextLine();
			String[] line=info.split(" ");
		
			if("quit".equals(info)){
				break;
			}
			Node node = new Node(line[0],line[1],line[2]);
		
			abl.insertInfo(line[0],line[1], line[2]);			
		}
		
		//전체 주소록 출력
		abl.printNode();
		System.out.println("=================================================");
		
		//삭제할 주소록 이름 입력 ,
		System.out.print("삭제할 이름 :");
		String delete = s.nextLine();
				
		//주소록 삭제
		abl.deleteNode(delete);
		
		System.out.println("=================================================");
		
		//전체 주소록 출력
		abl.printNode();
	}
}
