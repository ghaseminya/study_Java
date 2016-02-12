package com.io1.inputoutput;
/*
스트림 기반의 파일 입출력  (바이트 단위 복사)

-------------------------------------------------
바이트 단위 복사(1바이트 씩 복사)가 수행됩니다.
큰 파일 사이즈를 파일 복사할 경우 많은 시간이 걸릴 수 있습니다.



FileInputStream
	• FileInputStream은 시스템에 있는 모든 파일을 읽을 수 있는 기능을 제공하는 클래스
	• 파일을 읽을 때는 파일의 경로와 파일 객체를 생성자의 매개 변수로 설정하여 FileInputStream객체를 생성할 수 있습니다.
	• 만약, 파일이 존재하지 않으면 FileNotFoundException을 발생하게 됩니다.



FileOutputStream
	• FileOutputStream은 시스템에 있는 모든 파일에 쓸 수 있는 기능을 제공합니다.
	• 만약 객체를 생성할 때 , 파일이 존재하지 않으면 FileNotFoundException이 발생하게 됩니다.
	• 객체가 생성되면 파일이 존재하는 경우에는 파일을 생성하지 않으며 파일이 없는 경우에는 파일을 생성하게 됩니다.
	• FileNotFoundException의 의미는 경로가 일치하지 않을 때 발생하는 예외로 경로는 일치하고 파일이 없는 경우에는 예외가 발생하지 않고 파일 생성하게 됩니다.

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
		
		int copyByte=0;
		int readLen;
		byte buf[]=new byte[1024];
		
		while(true)
		{
			readLen=in.read(buf);
			if(readLen==-1)
				break;
			out.write(buf, 0, readLen);
			copyByte+=readLen;			
		}

		in.close();
		out.close();		
		System.out.println("복사된 byte 크기: "+ copyByte);
	}
}