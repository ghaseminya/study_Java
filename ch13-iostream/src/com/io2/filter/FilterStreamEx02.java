package com.io2.filter;
/*
버퍼링 기능을 제공하는 필터 스트림
BufferedInputStream, BufferedOutputStream클래스

-------------------------------------------------------
BufferedOutputStream 클래스의 flush 메소드 호출을 통해서 버퍼링 된 데이터의 목적지로 전송하게 됩니다.
또한, close메소드를 통해 스트림을 종료하면  스트림의 버퍼는 flush를 수행합니다.



버퍼링 기능을 제공하는 필터 스트림
구분						클래스				역할
BufferedInputStream		버퍼 입력 필터 스트림	입력 버퍼 제공
BufferedOutputStream	버퍼 출력 필터 스트림	출력 버퍼 제공


BufferedInputStream
	• 버퍼링은 입출력 수행작업을 향상 시킨 기술
	• 버퍼링이란 논리적 데이터 덩어리들이 하나의 큰 물리적 입력 연산으로서 파일로 부터 읽혀서 버퍼로 입력되는 과정입니다.
	• 버퍼링을 이용하면 데이터를 읽어서 버퍼를 꽉 채우고, 
	연속된 read() 메서드 호출할 경우 단지 메모리 버퍼로 부터 데이터를 읽어 내는 작업으로 
	훨씬 효율적이고 빠르게 입력작업을 할 수 있습니다.
	• mark()과 reset() 메소드도 제공



BufferedOutputStream
	• BufferedOutputStream 클래스를 사용하면 버퍼가 채워질 때마다 한번에 대량으로 출력장치로의 실제 전송이 수행됩니다.
	• OutputStream은 출력 속도의 향상을 위해서 flush() 메서드를 정의하고 있습니다.
	• flush(플러쉬)란 버퍼가 다 차지 않더라도 버퍼를 비워주는 기능입니다.
	• 플러쉬 기능을 구현한 클래스가 바로 BufferedOutputStream 클래스입니다.

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
		InputStream in=new FileInputStream("datastream.bin");
		OutputStream out=new FileOutputStream("copy.bin");
		
		//내부적으로 버퍼링하는 스트림 생성
		BufferedInputStream bin=new BufferedInputStream(in);
		BufferedOutputStream bout=new BufferedOutputStream(out);
		
		int copyByte=0;
		int bData;
		
		while(true) {
			//버퍼링 되므로 read, write메소드의 호출이 빠르게 진행됩니다.
			//입력 Stream으로부터 다음 바이트 데이터를 읽어들 입니다
			bData=bin.read();
			if(bData==-1)
				break;
			
			//bData의 지정된 바이트수를 버퍼링 된 출력 Stream에 작성합니다.
			bout.write(bData);
			copyByte++;
		}

		//close메소드를 통해 스트림을 종료하면  스트림의 버퍼는 flush를 수행합니다.
		bin.close();
		bout.close();
		System.out.println("복사된 byte 크기: "+ copyByte);
	}
}
