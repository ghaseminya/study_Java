package lambda01;
/*
//람다식 기본문법


File Info
Compare.java	• interface Compare
				• compareTo()라는 메소드를 가지고 있는 Compare 인터페이스 
				
*LambdaEx.java	• class LambdaEx
				• Compare 인터페이스를 이용하는 클래스
*/

//Compare 인터페이스를 이용하는 클래스
public class LambdaEx {

	//TODO 2: Compare 인터페이스를 받아들인 후, 해당 인터페이스를 이용하는 exec메소드 정의
	//compareTo메소드가 어떻게 구현되어 있느냐에 따라서 출력되는 값이 달라지게 딥니다.
	public static void execFunction(Compare compare){
        int a = 3;
        int b = 7;
        int value = compare.compareTo(a, b);
        System.out.println(value);
    }
	
	public static void main(String[] args) {
		//TODO 3: 람다식으로  execFunction() 호출
		//Java8에 람다식이 생기면서, 마치 함수만 전달하는 것처럼 메소드를 호출할 수 있게 되었습니다.
		//람다식을 이용해서 추상메소드 부분을 바로 구현하여 인자값으로 전달합니다.
		execFunction((i, j)->{
            return i - j;
        });
		//반환되는 값으로 음수값이 반환되면 j가 큰값
		//양수값이면 i가 큰값
		//0값이면 i와 j는 같은 값
	}
}
