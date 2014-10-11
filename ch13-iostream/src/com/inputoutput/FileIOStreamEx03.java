/*
스트림 기반의 파일 입출력  (바이트 단위 복사)

-------------------------------------------------
바이트 단위 복사(1바이트 씩 복사)가 수행됩니다.
큰 파일 사이즈를 파일 복사할 경우 많은 시간이 걸릴 수 있습니다.
*/
package com.inputoutput;

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