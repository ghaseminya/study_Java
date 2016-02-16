package com.io2.filter;
/*
기본 자료형 데이터 입출력 + 버퍼 스트림
-> 파일에 double형 데이터 저장 + 버퍼링

*/


import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterStreamEx03 {

	public static void performanceTest(DataOutputStream dataOut)
			throws IOException
			{
		long startTime=System.currentTimeMillis();
		for(int i=0; i<1000; i++)
			for(int j=0; j<1000; j++)
				dataOut.writeDouble(12.345);

		dataOut.flush();
		long endTime=System.currentTimeMillis();	
		System.out.println("경과시간: "+ (endTime-startTime));	
			}

	public static void main(String[] args) throws IOException
	{
		OutputStream out1=new FileOutputStream("filterdata1.bin");
		DataOutputStream dataOut=new DataOutputStream(out1);
		performanceTest(dataOut);
		dataOut.close();

		//기본 자료형 데이터 입출력 + 버퍼 스트림
		OutputStream out2=new FileOutputStream("filterdata2.bin");	//기본 출력 스트림
		BufferedOutputStream bufFilterOut = new BufferedOutputStream(out2, 1024*10);	//버퍼출력스트림의 생성자를 통해 기본출력 스트림과  연결
		DataOutputStream dataBufOut=new DataOutputStream(bufFilterOut);					//데이터 스트림의 생성자를 통해 버퍼출력스트림과 연결
		performanceTest(dataBufOut);
		dataBufOut.close();
	}
}
