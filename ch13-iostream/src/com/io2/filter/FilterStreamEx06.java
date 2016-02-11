/*
파일 대상의 문자열 출력

*/
package com.io2.filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilterStreamEx06  {

	public static void main(String[] args) throws IOException
	{
		BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
		System.out.println("입력 시작");
		out.write("A B C D E F G");
		out.newLine();	//newLine 메소드의 호출을 통해 개행(줄바꿈)을 수행합니다. 
		//\n이 아닌 newLine메소드 호출을 통해서 개행을 구분하는 이유는 시스템에 따라 개행을 표현하는 방법이 다르기 때문입니다.
		out.write("가 나 다 라 마 바 사");
		out.newLine();
		out.write("H I J K L M N");
		out.newLine();
		out.write("아 자 차 카 타 파 하");
		out.newLine();
		out.newLine();
		out.write("O P Q R S T U V W X Y Z");
		out.newLine();
		out.close();
		System.out.println("입력 종료!");
	
	}
}
