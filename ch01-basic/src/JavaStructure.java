//프로그램의 기본 골격 및 구성 확인

//클래스명이 JavaStructure
public class JavaStructure
{	//클래스 명이 FirstJava이면, 해주면,JavaStructure.java 생성되며
	//컴파일시 FirstClass.class가 생성됩니다.
	public static void main(String[] args)	// 메소드명 main
	{	//프로그램을 실행하면 main메소드안에 있는 문장이 순차적으로 실행됩니다.

		//System.out.println안에 출력하고 싶은 문자열을 "(큰따옴표)로 감싸서 함수 호출을 하면 출력됩니다.
		//println()메소드는 출력 후 다음행으로 이동합니다.
		//처리는 함수를 통해 이뤄지고 함수의 끝에는 반드시 ;(세미콜론)을 붙여서 실행의 끝을 표시해 주어야 합니다.
		System.out.println("Hello World!!!");
		System.out.println("안녕 자바월드!!");
		System.out.println("First Java");
		//System.out.println(): 
		//System 클래스의 멤버 out이 참조하는 인스턴스의 println() 메소드를 호출하는 문장
	}
}