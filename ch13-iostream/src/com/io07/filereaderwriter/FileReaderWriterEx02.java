package com.io07.filereaderwriter;
/* FileWriter
문자열 스트림 이해 - FileWriter


File Info
*FileReaderWriterEx02.java	문자열 스트림 이해
							FileWriter
							
*FileReaderWriter.txt		생성된 결과 파일

FileReaderWriterEx03.java	문자열 스트림 이해
							FileReader

//-----------------------------------------

FileWriter
	• FileWriter 클래스는 문자를 파일에 출력할 때 사용하는 클래스
	• FileWriter 클래스의 생성자는 파일의 경로, File 객체를 이용하여 객체를 생성할 수 있습니다.
	• 만약, 경로가 실제로 존재하지 않으면 IOException이 발생하게 됩니다.(FileNotFoundException예외가 아님)

*/


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileReaderWriterEx02 {

	public static void main(String[] args) throws IOException{
		char ch1='J'; //자바에서 유니코드로 처리되므로 각각 2byte로 표현됩니다.
		char ch2='A';
		char ch3='V';
		char ch4='A';
		
		Writer out=new FileWriter("FileReaderWriter.txt");
		out.write(ch1);	//실행 운영체제(Windows)에 따라서 1바이트씩 인코딩 되어서 저장됩니다.
		out.write(ch2);
		out.write(ch3);
		out.write(ch4);
		out.close();
	}
}
