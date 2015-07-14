/* 가변인자 : Variable Arguements 
 * */

public class MethodEx04 {
	
	/*일반적인 메서드는  타입과 인자의 갯수를 일치시켜야 합니다.*/
	public void getNum(int num){
		System.out.println("전달된 숫자 = " + num);		
	}
	
	/*가변인자 : Variable Arguements
	JDK v5.0이상부터 사용가능*/	
	//타입은 일지하고 인자의 갯수가 가변적
	public void argsTest(int ... n){	//인자전달하면 배열을 만든후 배열에 저장하고 그 주소값을 n으로 입력받는다.
		
		for(int i=0; i<n.length; i++){
			System.out.println("n[" + i+ "] :" + n[i]);			
		}	
		System.out.println("=========================");
	}	
	

	public static void main(String[] args) {		
		
		MethodEx04 m = new MethodEx04();
		m.getNum(50);

		//전달되는 인자의 갯수 불일치
//		m.getNum(50, 60); //Error:The method getNum(int) in the type MethodTest04 is not applicable for the arguments (int, int)
		
		//전달되는 인자의 타입이 불일치
//		m.getNum(5.6);	//ERROR: The method getNum(int) in the type MethodTest04 is not applicable for the arguments (double)
		m.getNum( (int)5.6);
		
		System.out.println();
		//가변인자를 사용하는 메서드 호출
		m.argsTest(50, 60, 70);
		m.argsTest(22, 33);
		m.argsTest(11);
		m.argsTest(100, 200, 300, 400, 500, 600);
		m.argsTest();
	}
}
