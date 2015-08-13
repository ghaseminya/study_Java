
//메소드의 매개변수

//학습내용
//	• 두개의 매개변수를 호출하는 함수 정의 및 호출
//	• 매개변수가 없는 함수 정의 및 호출

public class FunctionEx02 {
	
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		
		int minute = 30;
		
		//메소드 실행(호출)
		tellTime(9, 11);
		tellTime(18, 30);
		
		//변수를 통한 메소드 호출
		tellTime(20, minute);
		byEveryone();
		System.out.println("프로그램의 끝");
	}
	
	//매개변수가 있는 함수 정의
	//매개변수는 전달 순서대로 저장
	//hour = 9, minute = 11
	public static void tellTime(int hour, int minute)
	{
		System.out.println("즐거운 하루입니다.");
		System.out.println("현재 시간은 "+ hour +"시입니다.");
		System.out.println("현재 시간은 "+ minute +"분입니다.");
		
	}
	
	//매개변수 없는 함수 정의
	public static void byEveryone()
	{
		System.out.println("내일 뵙겠습니다.");
	}
}
