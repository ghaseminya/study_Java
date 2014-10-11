/*
파일 대상의 문자열 입력

*/
package com.filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStreamEx07 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("String.txt"));
		String str;
		
		while(true){
			//readLine 메소드 호출 시 개행 정보는 문자열의 구분자로 사용되기 때문에
			//문자열 출력 후 개행을 하기 위해서는 println 메소드를 호출해주어야 합니다.

			str = in.readLine();
			if(str==null){
				break;
			}
			System.out.println(str);	
			
		}
		in.close();
		
	}
}
