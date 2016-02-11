package com.io1.inputoutput;
/*
InputStreamReader 클래스를 사용하여 문자열을 입력하고 엔터키를 누르면 바로 화면에 입력한 내용을 출력하는 프로그램



InputStreamReader와 OutputStreamWriter
InputStreamReader	바이트 입력 스트림 => 문자 입력 스트림
OutputStreamWriter	바이트 출력 스트림 => 문자 출력 스트림

//--------------------------------------------
출력결과 (영어로 입력, 한글입력이 바이트문자로 이상하게 출력될 수 있습니다)
java
java
stream
stream
test
test
*/


//java.io 패키지에는 자바 입출력 관련 클래스들이 모여 있습니다.
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamEx01 {
	
	public static void main(String[] args){
		//Reader 클래스를 생성하는데 InputStreamReader 클래스를 이용하여 객체를 생성하고 있으며
		//표준입력장치인 키보드로 부터(콘솔에서)문자열을 입력받게 됩니다.
		Reader reader = new InputStreamReader(System.in);
		
		//Reader클래스는 파일 또는 네트워크에서 사용되는 클래스이기 때문에 
		//프로그램 실행 중에 장치의 오동작이 발생될 수 있어 반드시 예외처리를 해주어야 합니다.
		try{
			//무한루프
			while(true){
				//입력스트림으로부터 1문자를 읽어 i 변수에 저장한다. 
				//읽은 값(반환된 값)은 int형이므로 문자로 처리하기 위해서는 형변환이 필요합니다.
				int i = reader.read();
				
				//i 변수의 값이 -1과 같은 경우는 데이터를 다 읽은 것이므로 반복문을 탈출
				if(i==-1)
					break;
				
				//i 변수의 값을 문자로 변환(문자 코드를 실제 문자로 변환)
				char c = (char)i;
				
				//화면에 변환한 문자를 출력
				System.out.print(c);
			}
			
		}catch(Exception e){
			//예외가 발생했을 경우 예외의 내용을 출력하는 문장
			System.err.println(e);
		}
		
		System.out.println();
	}
}
