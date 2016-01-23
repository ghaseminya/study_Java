/*
BufferedReader 클래스를 사용하여 콘솔에서 문자열을 입력 받아 화면에 출력하는 프로그램

출력결과
영어로 테스트

*/
package com.buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedRWEx01 {
	public static void main(String[] args) {
		
		//BufferedReader 생성자의 인자를 또 다른 스트림 클래스인 InputStreamReader 클래스로 지정
		//BufferedReader클래스를 사용하면 한번에 많은 양의 데이터를 버퍼에 읽어 놓은 후 데이터소스에 접근하지않고 
		//메모리상의 버퍼에서 바로 데이터를 읽을 수 있기 때문에 비교적 빠른 속도를 낼 수 있습니다. 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		try{
			while(true){
				//readLine()메소드로 한 행 단위로 문자열을 읽어서 String객체에 저장
				str = in.readLine();
				if(str == null)
					break;
				//출력
				System.out.println(str);
			}
			
		}catch(Exception e){
			System.err.println(e);
		}
	}
}
