/*
문자열 스트림 이해
FileWriter

*/
package com.filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FilterStreamEx04 {

	public static void main(String[] args) throws IOException
	{
		char ch1='J';	//자바에서 유니코드이므로 각각 2byte로 표현됨
		char ch2='A';	//자바에서 유니코드이므로 각각 2byte로 표현됨
		char ch3='V';	//자바에서 유니코드이므로 각각 2byte로 표현됨\
		char ch4='A';	//자바에서 유니코드이므로 각각 2byte로 표현됨
		
		Writer out=new FileWriter("FileReaderWriter.txt");
		out.write(ch1);	//실행 운영체제(Windows)에 따라서 1바이트씩 인코딩 되어서 저장됩니다.
		out.write(ch2);
		out.write(ch3);
		out.write(ch4);
		out.close();
	}
}
