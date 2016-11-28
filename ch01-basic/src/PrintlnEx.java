//System.out.println의 활용
//표준 출력 방법 확인하기

//System.out.println()
//Sytem 클래스의 멤버 out이 참조하는 인스턴스의 println 메소드를 호출하는 문장

//System	out				println
//클래스 이름	static 참조 변수	메소드


//System
//	• java.lang 패키지에 묶여있는 클래스의 이름
//	• import java.lang.*; 자동 삽입되므로 System이란 이름을 직접 쓸 수 있습니다.

//out
//	• static 변수이되 인스턴스를 참조하는 참조변수
//	• PrintStream이라는 클래스의 참조변수


public class PrintlnEx {

	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(-10);
		System.out.println(3.14);
		System.out.println(3.14 + "는 실수입니다.");
		System.out.println("10+20=" + 30);
		System.out.println("10+20" + "의 연산결과는 30입니다.");
		System.out.println("자바 " + "열공 중");
		System.out.println(10+20);
		System.out.println(10*20);
		System.out.println(10/20);
		System.out.println(10-20);

	}
}
