//조건(삼항) 연산자  - 절대값 만들기

public class OperatorEx06 {
	public static void main(String[] args){
		System.out.println("=========조건(삼항) 연산자 =========");
		
		System.out.println("절대값 만들기: ");
		int x = 10;
		int y = -20;
		
		//조건식(true or false) ? 참값 : 거짓값
		int absX = (x >=0) ? x : -x;
		int absY = (y >=0) ? y : -y;
		System.out.println("x=10일 때, x의 절대값: " + absX);	//x=10일 때, x의 절대값: 10
		System.out.println("y=-20일 때, y의 절대값: " + absY);	//y=-20일 때, y의 절대값: 20
			
		System.out.println("");
	}
}
