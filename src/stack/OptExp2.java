package stack;

public class OptExp2 {
	
	//수식의 후위표기
	public String toPostfix(String infix){
		
		char temp;
		
		String exp = infix;
		
		String postfix = "";
		
		LinkedStack s = new LinkedStack();
		
		for(int i=0; i<infix.length(); i++){
			temp = exp.charAt(i);
			switch(temp){
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				postfix += temp; 	// 숫자만 스트링에 +
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				s.push(temp);		// 연산자만 스택에 push
				break;
			case ')':
				postfix += s.pop(); // 닫는 괄호를 만날때 연산자 pop
				break;
			default:
			}
		}
		while(true){				// 스택에 남아있는 연산자 모두 pop
			if(s.isEmpty()){
			return postfix;
			}
			else{
				postfix += s.pop();
			}
		}
	}
	
	// 후위표기 수식 계산
	public int evalPostfix(char[] exp){
		
		LinkedStack2 s = new LinkedStack2();
		
		char[] exp1 = exp;
		
		int opr1,opr2,value;
		
		char testCh;
		
		for(int i = 0; i<exp1.length; i++){
			
			testCh = exp1[i];
			
			// 연산될 숫자 push
			if(testCh != '+' && testCh != '-' && testCh != '*' && testCh != '/'){
				value = testCh - '0';
				s.push(value);
			}
			
			// 연산자에 따라 숫자 연산 
			else{
				opr2 = s.pop();
				opr1 = s.pop();
				switch(testCh){
				case'+' : s.push(opr1+opr2); break;
				case'-' : s.push(opr1-opr2); break;
				case'*' : s.push(opr1*opr2); break;
				case'/' : s.push(opr1/opr2); break;
				}
			}
		}
		return s.pop();
	}
	
	public static void main(String args[]){
		OptExp2 opt = new OptExp2();
		
		int result =0;
		
		String ex = "(3*5)-(6/2)*(2-3)";
		
		char[] exp1 = opt.toPostfix(ex).toCharArray();
		
		result = opt.evalPostfix(exp1);
		
		System.out.println("입력된 수식 : " + ex);
		
		
		System.out.print("수식의 후위표기 : ");
		for(char value : exp1){
			System.out.print(value);
		}
		System.out.println("");
		
		
		System.out.println("연산 결과  : " + result);
	}
}
