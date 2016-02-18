package com.io07.filereaderwriter;
/* FileReader
문자열 스트림 이해
FileReader

File Info
FileReaderWriterEx02.java	문자열 스트림 이해
							FileWriter
*FileReaderWriter.txt		생성된 결과 파일
*FileReaderWriterEx03.java	문자열 스트림 이해
							FileReader

//-------------------------------------------------------------

FileReader
	• FileReader클래스는 시스템에 있는 파일을 읽을 수 있는 기능을 제공
	• 파일을 읽을 때는 파일의 경로,  File 객체를 생성자의 매개변수로 지정하여 객체를 생성할 수 있습니다.
	• 파일이 존재 하지 않으면 FileNotFoundException 예외가 발생
	• FileReader 클래스는 문자 스트림으로 한문자를 읽기 때문에 화면에 출력하더라도 한글 깨지는 현상이 일어나지 않습니다.

*/


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderWriterEx03 {

	public static void main(String[] args) throws IOException
	{
		char[] cbuf=new char[10];
		int readCnt;
		
		//문자스트림으로 읽어들이기
		Reader in=new FileReader("FileReaderWriter.txt");
		
		//읽어 들이는 과정에서 1바이트 데이터가 2바이트로 표현될 수 있습니다	
		//(문자스트림이기때문에 운영체제방식 인코딩된 문자를 자바프로그램에서 유니코드로 디코딩하여 표현)
		//cbuf: 읽어들인 데이터를 cbuf배열에 저장합니다. 
		//0: 읽어들일 데이터의 시작 위치
		//cbuf.length: 읽어들일 데이터의 길이
		readCnt=in.read(cbuf, 0, cbuf.length);	
		for(int i=0; i<readCnt; i++)
			System.out.println(cbuf[i]);
		
		in.close();
	}
}
