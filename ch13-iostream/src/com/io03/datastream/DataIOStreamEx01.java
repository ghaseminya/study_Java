package com.io03.datastream;
/*
필터스트림 클래스에 대한 이해
DataInputStream과 DataOutputStream클래스

DataOutputStream 클래스와 DataInputStream클래스는 기본 자료형 단위의 데이터 입출력을 가능하게 하는 필터 스트림입니다.

//---------------------------------------

DataInputStream
	• DataInput 인터페이스는 입력 스트림으로 부터 기본 자료형 데이터을 읽을 수 있는 각종 메서드와 
	문자를 읽을 수 있는 메서드를 정의 하고 있습니다.
	• DataInputStream 클래스의 생성자는 한 개로 구성되어 있으며, 어떠한 예외 처리도 되어 있지 않습니다.



DataOutputStream
	• DataOutput 인터페이스는 출력 스트림으로 부터 기본 자료형 데이터를 쓸 수 있는 각종 메서드와 문자를 쓸 수 있는 메서드를 정의 하고 있습니다.
	• DataOutputStream 클래스의 생성자는 한 개로 구성되어 있으며, 어떠한 예외 처리도 되어 있지 않다.

*/


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataIOStreamEx01 {

	public static void main(String[] args) throws IOException {
		
		OutputStream out=new FileOutputStream("datastream.bin"); //출력스트림
		//필터스트림에서 생성자를 통해 출력스트림과 연결
		DataOutputStream filterOut=new DataOutputStream(out);	
		
		//원하는 형태로 데이터를 쓸수 있습니다 (바이트형태로 쓰는것이 아니라 원하는 데이터 형태로 쓰면 됨)
		filterOut.writeInt(375);
		filterOut.writeDouble(35.67);
		filterOut.writeBoolean(true);
		filterOut.close();
		
		
		InputStream in=new FileInputStream("datastream.bin"); //입력 스트림
		//필터스트림에서 생성자를 통해 입력스트림과 연결
		DataInputStream filterIn=new DataInputStream(in);
		
		int num1=filterIn.readInt(); //4byte를 읽어들인 다음 int로 조합한 다음 반환
		double num2=filterIn.readDouble(); //8byte를 읽어들인 다음 double형 테이터로 조합한 다음 반환
		boolean bool=filterIn.readBoolean(); //1byte를 읽어들인 다음 boolean형 테이터로 조합한 다음 반환
		filterIn.close();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(bool);	
	}
}
