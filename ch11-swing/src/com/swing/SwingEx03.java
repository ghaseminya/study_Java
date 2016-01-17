/*
exec 메소드를 통한 다른 자바 프로그램의 실행

exec 메소드를 통해서 다른 자바 프로그램의 실행을 명령할 수 있습니다. 
그리고 이러힌 상황에서 실행을 명령한 자바 프로그램이 종료시 전달한 값,
예를 들어서 exit 함수 호출 시 전달한 값을 얻을 수 있습니다.

*/
package com.swing;

import java.io.IOException;

public class SwingEx03 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		//Runtime클래스의 getRuntime()메소드의 반환되는 참조값을 이용해서
		//exec()메소드 호출시 자바명령문을 입력하면 SwingEx02자바 프로그램이 실행됩니다.
		Process proc=Runtime.getRuntime().exec("java SwingEx03");
		proc.waitFor();	//프로그램이 종료되기를 기다리기
						//실행후 결과값을 받기 위해 기다림
		
		if(proc.exitValue()==0)	//프로그램의 종료값(exit value) 얻기
			System.out.println("정상 종료!!!");
		else
			System.out.println("문제 발생!!!");
	}
}
