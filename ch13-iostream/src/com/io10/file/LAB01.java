//파일을 바이트 스트림을 이용하여 바이너리 파일 복사하기
//메모장 프로그램 파일을 CodeLab폴더에 복사해 오기
//C:\\Windows\\notepad.exe파일을 
//C:\\CodeLab\\temp\\notepad.exe에 복사하기

/*
C:\CodeLab\temp 폴더 생성 후 테스트
*/

package com.io10.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LAB01 {

	public static void main(String[] args) {

		//import java.io.File;
		//File객체를 이용하여 복사할 파일의 소스파일 경로 설정
		File source = new File("C:\\Windows\\notepad.exe");
		//소스파일을 복사할 목적지 파일의 경로 설정
		File destination = new File("C:\\CodeLab\\temp\\notepad.exe");
		
		//스트림 객체 생성
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		//복사 단위(문자)
		int ch;
		
		try{
			//복사할 원본파일 할당
			fi = new FileInputStream(source);
			//붙여넣기할 대상파일 할당
			fo = new FileOutputStream(destination);
			in = new BufferedInputStream(fi);
			out = new BufferedOutputStream(fo);
			
			//파일의 끝인지 확인하여 파일이 끝까지 반복하여 읽어들이기
			//in.read(): 1byte을 가져와서 가져온 1byte의 값을 ASCII값으로 반환합니다.
			//더이상 값이 없으면 -1을 반환합니다.
			while((ch=in.read())!=-1){
				//문자 단위로 쓰기
				//반환 값은 아스키 값 형태이므로 캐릭터(char)타입으로 형변환 후 문자를 출력해 줍니다.
				out.write((char)ch);
			}
			
			//복사 완료 메시지 출력
			System.out.println("파일 복사 완료");
			
			//자원 정리
			in.close();
			out.close();
			fi.close();
			fo.close();
			
		}catch(IOException e){ //import java.io.IOException;
			//복사 오류 메시지 출력
			System.out.println("파일 복사 실패");
		}
	} //main
} //LAB01
