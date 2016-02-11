/*
PrintWriter

--------------------------
PrintWriter는 입력 필터 스트림이 존재하지 않는 대표적인 스트림 클래스입니다.
PrintStream과 PrintWriter는 유사합니다.
PrintWriter는 PrintStream을 대신할 수 있도록 정의된 클래스이며  PrintWriter클래스 활용을 권장합니다.



 */

package com.io2.filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilterStreamEx08 {

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
