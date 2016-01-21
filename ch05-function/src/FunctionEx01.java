/*
//함수 구조 이해

학습 내용
	• 함수 구조 이해
	• 메소드 정의
	• 메소드 호출/재호출
	• 매개변수 선언
	• 프로그램 흐름


메소드(Method, 메소드, 함수, Function)
	• 객체지향에서는 함수를 메소드(Method)라고 합니다.
	• 특정 작업을 하는 일련의 코드를 하나의 이름으로 묶어 놓은 코드의 집합
	• 입력값을 받아 그것을 처리한 후 하나의 결과값을 돌려주는 역할
	• 한번 정의하면 몇 번이든 실행할 수 있어 반복적인 작업을 처리할 때 유용


[main 메소드]
	• 자바 프로그램의 시작은 main이라는 이름의 메소드를 실행하는데서부터 시작합니다.
	• 메소드의 중괄호 내에 존재하는 문장들은 위에서 아래로 순차적 실행


[함수 형태]
http://codedragon.tistory.com/2010


*/
public class FunctionEx01 {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		
		//메소드 실행(호출)
		tellTime(9);
		tellTime(18); //정의한 메소드는 얼마든지 재호출 가능
		
		System.out.println("프로그램의 끝");
	}
	
	//메소드 정의
	//int hour: 매개변수
	//매개변수: 매소드 실행시 전달되는 값을 저장하기 위해 선언된 변수
	//hour = 9: hour에 메소드 호출하면서 전달된 9가 저장
	public static void tellTime(int hour)
	{
		System.out.println("즐거운 하루입니다.");
		System.out.println("현재 시간은 "+ hour +"시입니다.");
		
	}	//메소드 실행이 끝나면 메소드 호출한 곳으로 이동하게 됩니다. 이동후 프로그램의 흐름을 이어갑니다

}
