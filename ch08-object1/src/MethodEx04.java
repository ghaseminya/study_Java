//가변인자 : Variable Arguements (Varargs)

//Varargs를 제외하고 자바에서 인자 전달시 전달하는 인자가 복사되어 전달됩니다. (값 복사, 주소 복사)
//JDK5.0 이전에는 특정 메서드를 정의할 때 인자(argument)의 타입과 수를 정해 두고 호출 시 전달되는 인자(argument)의 수가 일치하지 않을 경우에는 메서드를 호출할 수가 없었습니다(Error)
//이런 문제를 해결하기 위해 메서드의 이름은 같지만 인자의 수가 다른 여러 개의 메서드를 정의하는 메서드오버로딩(Overloading) 또는 메서드 정의 시에 배열객체를 인자로 지정하여 줍니다.
//이 경우 매번 호출 시에 배열화 작업을 해주어야 하는 불편함이 있었습니다.
//이런 문제점을 JDK v5.0이상부터 Varargs기능으로 해결하게 되었습니다.

//-----------------------
//전달되는 인자의 갯수 불일치 하는 경우의 결과 확인
//전달되는 인자의 타입이 불일치하는 경우의 결과 확인
//가변인자를 사용하는 메서드 호출을 통한 결과 확인

public class MethodEx04 {
	
	//일반적인 메서드는  타입과 인자의 갯수를 일치시켜야 합니다.
	public void getNum(int num){
		System.out.println("전달된 숫자 = " + num);		
	}
	
	//가변인자 : Variable Arguements
	//JDK v5.0이상부터 사용가능	
	//타입은 일지하고 인자의 갯수가 가변적인 형태
	public void argsTest(int ... n){	//인자전달하면 배열을 만든후 배열에 저장하고 그 주소값을 n으로 입력받는다.
		
		for(int i=0; i<n.length; i++){
			System.out.println("n[" + i+ "] :" + n[i]);			
		}	
		System.out.println("=========================");
	}	
	

	public static void main(String[] args) {		
		
		MethodEx04 m = new MethodEx04();
		
		//전달되는 인자의 갯수와 타입 모두 일치
		m.getNum(50);

		//전달되는 인자의 갯수 불일치
//		m.getNum(50, 60); //Error:The method getNum(int) in the type MethodTest04 is not applicable for the arguments (int, int)
		
		//전달되는 인자의 타입이 불일치
//		m.getNum(5.6);	//ERROR: The method getNum(int) in the type MethodTest04 is not applicable for the arguments (double)
		m.getNum( (int)5.6); System.out.println();
		
		
		//가변인자를 사용하는 메서드 호출
		m.argsTest(50, 60, 70);
		m.argsTest(22, 33);
		m.argsTest(11);
		m.argsTest(100, 200, 300, 400, 500, 600);
		m.argsTest();
	}
}
