package com.io4.filereaderwriter;
/*

파일에서 지정된 수 만큼의 문자열을 읽어내는 프로그램

출력결과
지정된 수만큼 읽어오므로 뒤에 이상한 문자가 보일 수 있습니다.
//------------------------------------------

FileReader
	• FileReader클래스는 시스템에 있는 파일을 읽을 수 있는 기능을 제공
	• 파일을 읽을 때는 파일의 경로,  File 객체를 생성자의 매개변수로 지정하여 객체를 생성할 수 있습니다.
	• 파일이 존재 하지 않으면 FileNotFoundException 예외가 발생
	• FileReader 클래스는 문자 스트림으로 한문자를 읽기 때문에 화면에 출력하더라도 한글 깨지는 현상이 일어나지 않습니다.


*/


import java.io.FileReader;

public class FileReaderWriterEx01 {
	
	public static void main(String[] args){
		//256바이트 만큼의 문자형 배열을 선언한다
		char[] buffer = new char[256];
		
		try{
			//FileReader 클래스의 객체를 생성
			FileReader fReader = new FileReader("FileReaderWriter.txt");
			
			//write(배열, 문자열의 시작위치, 읽을 문자열의 개수):
			//스트림으로부터 0인 시작 위치부터100바이트만큼 읽어 buffer 배열에 저장한다
			fReader.read(buffer, 0, buffer.length);
			//스트림으로부터 0인 시작 위치부터100바이트만큼 읽어 buffer 배열에 저장한다
//			fReader.read(buffer, 0, 100);
			fReader.read(buffer, 0, buffer.length);
			
			//buf 배열에 있는 데이터를 문자열로 변환
			String str = new String(buffer);
			//화면에 출력
			System.out.println(str);
			
		}catch(Exception e){
			System.err.println(e);
		}
	}
}
