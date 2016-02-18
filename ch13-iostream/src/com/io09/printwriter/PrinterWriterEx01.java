package com.io09.printwriter;
/*
PrintWriter

--------------------------

PrintWriter
	• PrintWriter 클래스는 다른 스트림과 다르게 바이트 출력 스트림과 문자 출력 스트림을 가지고 객체를 생성할 수 있는 클래스입니다.
	• 자동 플러쉬 기능을 가지고 있습니다.
	• PrintWriter 클래스의 생성자에는 FileNotFoundException 예외를 발생하기 때문에 반드시 예외처리를 해야 합니다.
	• PrintWriter는 입력 필터 스트림이 존재하지 않는 대표적인 스트림 클래스입니다.
	• PrintStream과 PrintWriter는 유사합니다.
	• PrintWriter는 PrintStream을 대신할 수 있도록 정의된 클래스이며  PrintWriter클래스 활용을 권장합니다.

 */


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinterWriterEx01 {

	public static void main(String[] args) throws IOException
	{
		PrintWriter out=
				new PrintWriter(new FileWriter("printwriter.txt"));

		//printf, println등 문자열 단위의 출력이 필요하다면 반드시 PrintWriter를 사용합니다.
		out.printf("올해는 %d 년도 입니다", 2014);
		out.println("");
		out.println("미래는 많은 이름을 갖고 있습니다\n\n\n\n");
		out.println("약한 자에게는 \'도달할 수 없는 것\'");
		out.println("두려워하는 자에게는\'알려지지 않는 것\' ");
		out.println("용감한 자에게는 \'기회\'");	
		//문자열에 \n이 삽입되었다고 해서 파일 내에서 개행이 이뤄지지는 않습니다.
		//그러나 println()메소드 호출 시 시스템에 따른 개행정보를 삽입해줍니다.
		out.print("당신의 꿈에 올인하세요 !");
		out.close();
	}
}
