//main( )메소드로의 데이터(매개변수) 전달 확인

//main함수의 매개변수 전달 과정
//명령 프롬프트상에서 공백으로 구분되는 문자열로 String 배열이 구성
//String배열의 인스턴스가 생성되고 이 배열의 참조 값이 전달 main()메소드의 매개변수로 전달됨
//String배열 인스턴스의 참조값을 매개변수로 전달 받습니다.

//--------------------------------------
//결과 확인방법 (명령어프로프트 창에서 확인)
//C:\Users>java ArrayEx13 orange apple tomato


public class ArrayEx13 {

	public static void main(String[] args) {
		
		for(String e: args)
			System.out.println(e);
	}
}
