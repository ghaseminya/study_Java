package com.io10.file;
/*
상대 경로

--------------------------------
실제 프로그램 개발에서는 절대경로가 아닌 상대경로를 이용하여 개발하는 것이 일반적입니다.
왜냐하면 실행환경 및 실행위치가 변경될 경우 나타날수 있는 문제점을 최소화할수 있기 때문입니다.

*/


import java.io.File;

public class FileEx04 {
	public static void main(String[] args)
	{
		File curDir=new File("Orange");	//현재 디렉터리 기준으로 Orange디렉토리
		System.out.println(curDir.getAbsolutePath());
		
		//현대 디렉터리에 존재하는 Orange의 하위 디렉터리인 Apple
		File upperDir=new File("Orange"+File.separator+"Apple");
		System.out.println(upperDir.getAbsolutePath());
	}
}
