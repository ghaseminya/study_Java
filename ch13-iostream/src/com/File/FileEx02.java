/* File Class - 
파일의 주요 정보를 알아내는 프로그램
파일정보 확인, 파일 생성/변경/삭제

강의내용
	• import
	• 파일 객체 생성
	• 파일 생성 후 결과값 출력하기

---------------------------------------------------
파일 만들기
 
 */

package com.File;

import java.io.File;
import java.io.IOException;

public class FileEx02 {
	
	public static void main(String[] args){
		//파일 객체 생성
		File f1 = new File("C:" + File.separator + "javanAndroid" + File.separator + "sample.txt");
		
		System.out.println("=== 파일 생성===");
		try{
			//파일 생성
			System.out.println(f1.createNewFile());
		}catch(IOException e){
			e.printStackTrace();
		}		
		
		System.out.println("\n=== 파일 정보===");
		//절대경로
		System.out.println("절대경로 : " + f1.getAbsolutePath());
		System.out.println("디렉토리명 : " + f1.getParent());
		System.out.println("파일명 : " + f1.getName());
		System.out.println("파일크기 : " + f1.length());
		
		//파일명 변경하기
		System.out.println("\n=== 파일명 변경===");		
		//변경하고자하는 파일 객체 생성
		File f2 = new File("C:" + File.separator + "javanAndroid" + File.separator + "sampleNameChanged.txt");
		//File.separator	: 컴파일환경의 운영체제에 따른 구분자로 각각 치환됩니다.
		System.out.println(f1.getName() + " -> " + f2.getName());
		//renameTo()는 파일의 이름을 변경하는 메소드인데, 경로의 변경에 사용이 가능
		System.out.println(f1.renameTo(f2));	//파일 이동
		System.out.println("절대경로 : " + f2.getAbsolutePath());
		System.out.println("디렉토리명 : " + f2.getParent());
		System.out.println("파일명 : " + f2.getName());
		System.out.println("파일크기 : " + f2.length());
		
		//파일 삭제
		System.out.println("\n=== 파일명 삭제===");
		//파일이 존재할 경우 파일 삭제
		if( f2.delete()){
			System.out.println(f2.getName() + " 파일 삭제완료");
		}else{
			System.out.println("파일이 존재하지 않습니다");
		}		
	}
}