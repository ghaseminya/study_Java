package com.io02.filestream;
/* 
FileOutputStream - 덮어쓰기, 이어쓰기

강의내용
	• FileOutputStream 객체 생성
	• 경로에 파일 생성
	• 명시할 데이터 입력
	• String -> byte[] 배열행태로 변환 - getBytes()
	• 이어쓰기

---------------------------------------------------
FileInpuStream, FileOutputStream 형태 반드시 숙지

 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamEx04 {

	public static void main(String[] args) {
		
		//FileOutputStream 객체 생성
		FileOutputStream fos = null;
		try{
			//경로에 파일 생성
			//기본값 : 덮어쓰기
//			fos = new FileOutputStream("C:" + File.separator + "CodeLab" + File.separator+ "fileout.txt");
			
			
			//byte로 파일에 출력하기 위한 FileOutputStream객체 생성
			//이어쓰기			
			fos = new FileOutputStream("C:" + File.separator + "CodeLab" + File.separator+ "fileout.txt", true);			
			
			//파일에 쓸 데이터
			String message = "Hello FileOut!! 파일의 내용입니다.";
			
			//String -> byte[] 배열행태로 변환 
			fos.write(message.getBytes());
			
			System.out.println("파일을 생성후 내용을 기술하였습니다.");	
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{	//자원 정리					
			//객체가 있는지 체크
			if( fos != null)try{fos.close();}catch(IOException e){} 
		}
	}
}