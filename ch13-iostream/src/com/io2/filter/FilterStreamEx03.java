package com.io2.filter;
/*
기본 자료형 데이터 입출력 속도와 버퍼 스트림의 입출력 속도 확인하기
TODO: 기본 자료형 단위의 데이터 필터 스트림 생성
TODO: 버퍼 스트림 생성
*/


import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterStreamEx03 {

	//double형 데이터 저장 및 경과한 시간 체크하는 메소드
	public static void performanceTest(DataOutputStream dataOut) throws IOException{
		long startTime=System.currentTimeMillis();
		for(int i=0; i<1000; i++)
			for(int j=0; j<1000; j++)
				dataOut.writeDouble(12.345);

		dataOut.flush();
		long endTime=System.currentTimeMillis();	
		System.out.println("경과시간: "+ (endTime-startTime));	
	}

	public static void main(String[] args) throws IOException{
		//TODO : 기본 자료형 데이터 입출력
		OutputStream out1=new FileOutputStream("filterdata1.bin");
		//기본 자료형 단위의 데이터 입출력을 가능하게 하는 필터 스트림 생성
		DataOutputStream dataOut=new DataOutputStream(out1);
		performanceTest(dataOut);
		dataOut.close();

		
		//TODO : 버퍼 출력 스트림 생성
		OutputStream out2=new FileOutputStream("filterdata2.bin"); //기본 출력 스트림
		//버퍼출력스트림의 생성자를 통해 기본출력 스트림과  연결
		//매개변수인 OutputStream객체로 BufferedOutputStream객체를 생성하고 
		//size는 버퍼의 용량을 지정하며, 만약 지정하지 않으면 8,192 byte로 지정됩니다.
		BufferedOutputStream bufFilterOut = new BufferedOutputStream(out2, 1024*10);
		//데이터 스트림의 생성자를 통해 버퍼출력스트림과 연결
		DataOutputStream dataBufOut=new DataOutputStream(bufFilterOut);
		performanceTest(dataBufOut);
		dataBufOut.close();
	}
}
