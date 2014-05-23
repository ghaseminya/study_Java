
public class OperatorEx04 {
	public static void main(String[] args){
		
		System.out.println("=========논리 연산자 =========");
		boolean t, f, result;
		t = true;
		f = false;
		
		result = t && f;	//논리곱
		System.out.println("t && f : " + result);
		
		System.out.println("");
		result = t || f;	//논리합
		System.out.println("t || f : " + result);
		
		System.out.println("");
		result = ! t;	//부정
		System.out.println("!t : " + result);
		
		
	}

}
