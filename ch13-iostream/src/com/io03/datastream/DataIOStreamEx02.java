package com.io03.datastream;
/*
DataOutputStream 클래스를 활용하여
자바 기본 데이터형을 파일에 출력시키는 프로그램

*/


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataIOStreamEx02 {

	public static void main(String[] args) {
		
		try{
			//파일명을 인자로 하여 File 객체 생성
			File f = new File("DataIOStream.dat");
			//FileOutputStream 객체 생성
			FileOutputStream fout = new FileOutputStream(f);
			//FileOutputStream의 객체를 인자로 하여 DataOutputStream 객체 생성
			DataOutputStream dout = new DataOutputStream(fout);
			
			//자바기본데이터형을 스트림에 출력
			dout.writeInt(567);
			dout.writeDouble(3.1415);
			
			//자원 해제
			//먼저 생성한 스트림을 가장 나중에 해제 합니다.
			dout.close();
			fout.close();
			
		}catch(Exception e){ //예외가 발생했을 경우 예외의 내용을 출력
			System.err.println(e.toString());
		}
	}
}
