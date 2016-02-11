package com.io1.inputoutput;
/*

바이트 단위 read & write 메소드를 대신해서 바이트 배열 단위의 메소드 호출 (속도 향상)
public int read(byte[] b) throws IOException
public int write(byte[] b, int off, int len) throws IOException

-----------------------------------------------
FileInputStreamEx02와의 가장 큰 차이점은 1KB 크기의 버퍼를 이용해서 데이터를 입출력 한다는 점.
실제로 속도의 향상을 느낄 수 있습니다.

*/


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIOStreamEx04 {

	public static void main(String[] args) throws IOException
	{
		InputStream in=new FileInputStream("origin.bin");
		OutputStream out=new FileOutputStream("copy.bin");
		
		int copyByte=0;
		int readLen;
		byte buf[]=new byte[1024];	//1KB 버퍼생성
		
		while(true)
		{
			readLen=in.read(buf);
			if(readLen==-1)
				break;
			//b: 데이터, off: start offset in the data. len: 쓰기할 바이트의 수
			out.write(buf, 0, readLen);
			copyByte+=readLen;			
		}

		in.close();
		out.close();		
		System.out.println("복사된 byte 크기: "+ copyByte);
	}
}
