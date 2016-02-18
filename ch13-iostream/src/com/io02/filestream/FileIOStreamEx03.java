package com.io02.filestream;
/*
스트림 기반의 파일 입출력  (바이트 단위 복사)


바이트 단위 read & write 메소드를 대신해서 바이트 배열 단위의 메소드 호출 (속도 향상)
public int read(byte[] b) throws IOException
public int write(byte[] b, int off, int len) throws IOException
-------------------------------------------------
바이트 단위 복사(1바이트 씩 복사)가 수행됩니다.
큰 파일 사이즈를 파일 복사할 경우 많은 시간이 걸릴 수 있습니다.
FileInputStreamEx02와의 가장 큰 차이점은 1KB 크기의 버퍼를 이용해서 데이터를 입출력 한다는 점.
실제로 속도의 향상을 느낄 수 있습니다.



FileOutputStream
	• FileOutputStream은 시스템에 있는 모든 파일에 쓸 수 있는 기능을 제공합니다.
	• 만약 객체를 생성할 때 , 파일이 존재하지 않으면 FileNotFoundException이 발생하게 됩니다.
	• 객체가 생성되면 파일이 존재하는 경우에는 파일을 생성하지 않으며 파일이 없는 경우에는 파일을 생성하게 됩니다.
	• FileNotFoundException의 의미는 경로가 일치하지 않을 때 발생하는 예외로 경로는 일치하고 
	파일이 없는 경우에는 예외가 발생하지 않고 파일을 생성하게 됩니다.

*/


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//import java.io.*;

class FileIOStreamEx03
{
	public static void main(String[] args) throws IOException
	{
		InputStream in=new FileInputStream("origin.bin");
		OutputStream out=new FileOutputStream("copy.bin");
		
		int copyByte=0; //복사된 량 누적
		int readLen; //읽어들인 바이트데이터 임시 저장
		byte buf[]=new byte[1024]; //버퍼크기 설정 (1KB 버퍼생성)
		
		while(true)
		{
			readLen=in.read(buf);
			if(readLen==-1)
				break;
			//void write(byte buf[], int index, int size) throws IOException 
			//b: 데이터, off: start offset in the data. len: 쓰기할 바이트의 수
			//buf(b)의 index(off) 위치부터 size(len)만큼의 바이트를 출력합니다. 
			out.write(buf, 0, readLen);
			copyByte+=readLen;			
		}

		in.close();
		out.close();		
		System.out.println("복사된 byte 크기: "+ copyByte);
	}
}