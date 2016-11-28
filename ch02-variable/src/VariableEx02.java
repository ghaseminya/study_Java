/*
양의 정수, 음의 정수 출력

//--------------------

short vs int
	• CPU는 int형 데이터의 크기만 연산 가능합니다. 
	• 그렇기 때문에 연산직전에 short형 데이터는 int형 데이터로 자동변환되어 연산을 수행합니다.
	• 그러므로 프로그램 수행중 변환 과정이 생략될 수 있도록 int를 선택하는 것이 좋습니다.
	• 특별한 경우아닌경우 일반적으로 정수 표현시 int 자료형 선택을 권장합니다.


short & byte
	• 연산보다 데이터의 양이 중요시 되는 상황에서 사용이 됩니다.
	• 데이터의 성격이 강하다면 short와 byte를 활용해야 합니다.
	• MP3 파일, 동영상 파일, 게임 캐릭터 정보를 처리할 때 활용하게 됩니다.


not unsigned
JAVA 는 C/C++ 언어와 다르게 unsigned type을 지원하지 않습니다.


*/
public class VariableEx02 {

	public static void main(String[] args) {
		int num1=10;
		int num2=-10;
		System.out.println(num1); //10
		System.out.println(num2); //-10
	}
}
