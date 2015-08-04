//함수 구조 이해

//학습 내용
//	• 함수 구조 이해
//	• 메소드 정의
//	• 메소드 호출/재호출
//	• 매개변수 선언
//	• 프로그램 흐름


public class FunctionEx01 {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		//메소드 실행(호출)
		tellTime(9);
		tellTime(18);	//정의한 메소드는 얼마든지 재호출 가능
		System.out.println("프로그램의 끝");
	}
	
	//int time	: 매개변수
	//매개변수: 매소드 실행시 전달되는 값을 저장하기 위해 선언된 변수
	//메소드 정의
	public static void tellTime(int hour)
	{
		System.out.println("즐거운 하루입니다.");
		System.out.println("현재 시간은 "+ hour +"시입니다.");
		
	}	//메소드 실행이 끝나면 메소드 호출한 곳으로 이동하게 됩니다. 이동후 프로그램의 흐름을 이어갑니다

}
