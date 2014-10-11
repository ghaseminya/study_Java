/*
문자열 스트림 이해
FileReader

*/
package com.filter;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FilterStreamEx05 {

	public static void main(String[] args) throws IOException
	{
		char[] cbuf=new char[10];
		int readCnt;
		
		

		Reader in=new FileReader("FileReaderWriter.txt");	//문자스트림으로 읽어들임
		readCnt=in.read(cbuf, 0, cbuf.length);	//읽어 들이는 과정에서 1바이트 데이터가 2바이트로 표현될 수 있다	(문자스트림이기때문에 운영체제방식 인코딩된 문자를 자바프로그램에서 유니코드로 디코딩하여 표현)
		for(int i=0; i<readCnt; i++)
			System.out.println(cbuf[i]);
		
		in.close();
	}
}
