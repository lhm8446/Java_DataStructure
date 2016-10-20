package stack;

public class OptExp2 {
	private String exp;
	
	public char[] toPostfix(String infix){
		char testCh;
		exp = infix;
		int expSize = infix.length();
		int j = 0;
		char postfix[] = new char[expSize];
		LinkedStack s = new LinkedStack();
		
		for(int i=0; i<expSize; i++){
			testCh = this.exp.charAt(i);
			switch(testCh){
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
				postfix[j++] = testCh; 
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				s.push(testCh);
				break;
			case ')':
				postfix[j++] = s.pop();
				break;
			default:
			}
		}
		postfix[j] = s.pop();
		return postfix;
	}
	
	public int evalPostfix(char[] exp){
		LinkedStack2 s = new LinkedStack2();
		char[] exp1 = exp;
		int opr1,opr2,value;
		char testCh;
		
		for(int i = 0; i<7; i++){
			testCh = exp1[i];
			if(testCh != '+' && testCh != '-' && testCh != '*' && testCh != '/'){
				value = testCh - '0';
				s.push(value);
			}
			else{
				opr2 = s.pop();
				opr1 = s.pop();
				switch(testCh){
				case'+' : s.push(opr1 + opr2); break;
				case'-' : s.push(opr1 - opr2); break;
				case'*' : s.push(opr1 * opr2); break;
				case'/' : s.push(opr1 / opr2); break;
				}
			}
		}
		return s.pop();
	}
	
	public static void main(String args[]){
		OptExp2 opt = new OptExp2();
		int result ;
		
		String exp = "(3*5)-(6/2)";
		
		char[] exp1 = opt.toPostfix(exp);
		
		result = opt.evalPostfix(exp1);
		
		System.out.println("수식  :" + exp);
		
		System.out.print("수식의 후위표기 : ");
		for(char value : exp1){
			System.out.print(value);
		}
		System.out.println("");
		System.out.println("연산 결과  : " + result);

	}
}
