package com.io2.filter;
/*
버퍼링 기능을 제공하는 필터 스트림
BufferedInputStream, BufferedOutputStream클래스

-------------------------------------------------------
BufferedOutputStream 클래스의 flush 메소드 호출을 통해서 버퍼링 된 데이터의 목적지로 전송하게 됩니다.
또한, close메소드를 통해 스트림을 종료하면  스트림의 버퍼는 flush를 수행합니다.


*/


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilterStreamEx02 {

	public static void main(String[] args) throws IOException {
		InputStream in=new FileInputStream("origin.bin");
		OutputStream out=new FileOutputStream("copy.bin");
		
		//내부적으로 버퍼링하는 스트림 생성
		BufferedInputStream bin=new BufferedInputStream(in);
		BufferedOutputStream bout=new BufferedOutputStream(out);
		
		int copyByte=0;
		int bData;
		
		while(true) {
			//버퍼링 되므로 read, write메소드의 호출이 빠르게 진행됩니다.
			bData=bin.read();
			if(bData==-1)
				break;
			
			bout.write(bData);
			copyByte++;
		}

		bin.close();	//close메소드를 통해 스트림을 종료하면  스트림의 버퍼는 flush를 수행합니다.
		bout.close();
		System.out.println("복사된 byte 크기: "+ copyByte);
	}
}
