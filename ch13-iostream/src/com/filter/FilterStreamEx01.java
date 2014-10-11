/*
필터스트림 클래스에 대한 이해
DataInputStream과 DataOutputStream클래스

DataOutputStream 클래스와 DataInputStream클래스는 
기본 자료형 단위의 데이터 입출력을 가능하게 하는 필터 스트림입니다.



*/
package com.filter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilterStreamEx01 {

	public static void main(String[] args) throws IOException {
		
		OutputStream out=new FileOutputStream("datastream.bin");	//출력스트림
		//필터스트림에서 생성자를 통해 출력스트림과 연결
		DataOutputStream filterOut=new DataOutputStream(out);	
		
		//원하는 형태로 데이터를 쓸수 있음 (바이트형태로 쓰는것이 아니라 원하는 데이터 형태로 쓰면 됨)
		filterOut.writeInt(375);
		filterOut.writeDouble(35.67);
		filterOut.writeBoolean(true);
		filterOut.close();
		
		InputStream in=new FileInputStream("datastream.bin");	//입력 스트림
		//필터스트림에서 생성자를 통해 입력스트림과 연결
		DataInputStream filterIn=new DataInputStream(in);
		
		int num1=filterIn.readInt();	//4byte를 읽어들인 다음 int로 조합한 다음 전달
		double num2=filterIn.readDouble();	//8byte를 읽어들인 다음 double형 테이터로 조합한 다음 전달
		boolean bool=filterIn.readBoolean();
		filterIn.close();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(bool);	
	}
}
