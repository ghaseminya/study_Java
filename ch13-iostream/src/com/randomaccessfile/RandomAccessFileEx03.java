/*
RandomAccessFile클래스를 이용하여 파일로 저장하기

파일 저장시 한글 깨짐 현상 확인하고 해결하기 

인코딩 처리 후에도
생성된 파일 오픈시 한글 깨짐 확인 될 경우 인코딩을 EUC_KR으로 다시 오픈

*/
package com.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx03 {

	public static void main(String argv[]) {

		String str = "안녕하세요";

		try { 

			RandomAccessFile file = new RandomAccessFile("FileIOStream.txt","rw");

			file.writeBytes("=======\n");

			//EUC_KR 대신 KSC5601을 써도 무방. 인코딩 표준은 EUC_KR
			str=new String(str.getBytes("EUC_KR"), "8859_1"); 
			
			file.writeBytes(str);
			
			//또다른 방법
//			file.writeBytes( new String(str.getBytes("KSC5601"), "8859_1") );

			file.writeBytes("\n-------\n");

			file.close();

		} catch (IOException e) {

			System.out.println("Error: " + e);

		} // catch

	} // main
}
