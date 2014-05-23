/* 표준 입출력
 * 
 * 영문입력
 * 한글입력
 * ----------------------------------------------------
 * 영문텍스트(1byte)만 처리가능하고 
 * 2byte(한글)로 처리되어야하는 문자는 깨짐,
 * 따라서 이방법은 저수준의 입력을 처리하는 방법입니다.
 * 
 */

package com.input;

import java.io.IOException;

public class StandardInputEx {
	
	public static void main(String[] args){
		//
		try{
			int input = 0;
			//표준입력			
			//System.in을 이용해 InputStream을 얻어 바로 read()를 사용하여 입력한 데이터 중
			//1byte만을 읽어서 처리
			while( (input=System.in.read()) != -1){
				// byte로 처리되기 때문에 출력을 위해서는 (char)로 형변환해주어야 합니다.
				//abcd우리나라문자를 입력하면 1byte만을 읽기때문에 a문자를 아스키 코드값인 97값을 출력하고
				//(char)형변환하여야 정상적인 문자를 확인할 수 있습니다.
				System.out.println("input: " + input + ",(char)input: " + (char)input);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
