/*

파일에서 지정된 수 만큼의 문자열을 읽어내는 프로그램

출력결과
지정된 수만큼 읽어오므로 뒤에 이상한 문자가 보일 수 있습니다.
*/
package com.io4.filereaderwriter;

import java.io.FileReader;

public class FileReaderWriterEx01 {
	
	public static void main(String[] args){
		//256바이트 만큼의 문자형 배열을 선언한다
		char[] buffer = new char[256];
		
		try{
			//FileReader 클래스의 객체를 생성
			FileReader fReader = new FileReader("FileReaderWriter.txt");
			
			//스트림으로부터 100바이트만큼 읽어 buffer 배열에 저장한다
			fReader.read(buffer, 0, 100);
//			fReader.read(buffer, 0, buffer.length);
			
			//buf 배열에 있는 데이터를 문자열로 변환
			String str = new String(buffer);
			//화면에 출력
			System.out.println(str);
			
		}catch(Exception e){
			System.err.println(e);
		}
	}
}
