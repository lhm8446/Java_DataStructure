package stack;

public class OptExp {
	
	private String exp;
	private int expSize;
	private char testCh,openPair;
	
	public boolean testPair(String exp){
		this.exp = exp;
		LinkedStack s = new LinkedStack();
		expSize = this.exp.length();
		
		for(int i = 0; i <expSize; i++){
			testCh = this.exp.charAt(i);
			switch(testCh){
			case'(':
			case'{':
			case'[':
				s.push(testCh); break;
			case')':
			case'}':
			case']':	
				if(s.isEmpty()) return false;
				else{
					openPair = s.pop();
					if((openPair == '(' && testCh != ')')|| 
						(openPair == '{' && testCh != '}') || 
						(openPair == '[' && testCh != ']')){
					return false;
					}
					else break;
				}
			}
		}
		if(s.isEmpty()){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		OptExp opt= new OptExp();
		String exp = "(3*5)-(6/2)";
		char postfix[];
		int value;
		System.out.println(exp);
		if(opt.testPair(exp)){
			System.out.println("괄호맞음");
		}else{
			System.out.println("괄호 틀림");
		}

	}

}
