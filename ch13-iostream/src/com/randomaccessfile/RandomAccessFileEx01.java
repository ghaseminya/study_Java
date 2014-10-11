/*
RandomAccessFile클래스의 인스턴스 생성 및 활용

*/
package com.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx01 {

	public static void main(String[] args) throws IOException {
		//"data.bin": 파일이름, "rw": 생성모드
		//생성모드
		//r		:읽기 위한 용도 
		//rw	:읽고 쓰기 위한 용도
		RandomAccessFile raf=new RandomAccessFile("data.bin", "rw");
		
		System.out.println("Writting...............");
		System.out.printf("현재 위치: %d 바이트 \n", raf.getFilePointer());
		
		raf.writeInt(100);
		raf.writeInt(200);
		raf.writeInt(500);
		System.out.printf("현재 위치: %d 바이트 \n", raf.getFilePointer());
		
		raf.writeDouble(37.44);
		raf.writeDouble(72.85);
		raf.writeDouble(54.27);
		System.out.printf("현재 위치: %d 바이트 \n\n", raf.getFilePointer());
		
		System.out.println("Reading...............");
		raf.seek(0);	// 맨 앞으로 이동
		System.out.printf("현재 위치: %d 바이트 \n", raf.getFilePointer());
		
		System.out.println(raf.readInt());	//데이터를 읽을때마다 파일의 위치포인터가 이동함
		System.out.println(raf.readInt());
		System.out.println(raf.readInt());
		System.out.printf("현재 위치: %d 바이트 \n", raf.getFilePointer());
		
		System.out.println(raf.readDouble());
		System.out.println(raf.readDouble());
		System.out.println(raf.readDouble());
		System.out.printf("현재 위치: %d 바이트 \n", raf.getFilePointer());
		raf.close();
	}
}
