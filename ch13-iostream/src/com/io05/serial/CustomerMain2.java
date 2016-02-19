package com.io05.serial;
/* 
//역 직렬화 - ObjectInputStream


File Info
Customer.java		객체 직렬화(직렬화 대상)
CustomerMain1.java	객체 직렬화(ObjectOutputStream)
*CustomerMain2.java	역 직렬화(ObjectInputStream)

-------------------------------------------------------------------------------
파일의 내용을 객체로 복원하기
파일에 있는 정보는 객체 정보의 일부이기 때문에 객체를 정의한 클래스정보는 반드시 존재해야 합니다.
object.ser에는 클래스의 데이터인 최소한의 정보만 저장되어 있습니다.
현 예제에서는 Cusomer.java가 반드시 존재해야 해야하며 존재해야 복원(역 직렬화)할 수 있습니다. 

서버간 전송시 클래스의 정보를 서로 가지고 있어야 객체 직렬화 및 역직렬화를 할 수 있습니다.


활용분야:
채팅시
네트워크의 소켓통신시
두개 화면에서 오브젝트를 넘길 때 객체를 직렬화해서 넘겨줘야 함


*/

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomerMain2 {
	public static void main(String[] args){
		System.out.println("===객체 역직렬화 하기===");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;		
		
		try{
			//byte처리를 해야하기 때문에 FileInputStream객체 생성
			fis = new FileInputStream("object.ser");
			//역직렬화를 위해서 ObjectInputStream객체 생성
			ois = new ObjectInputStream(fis);
			
			//역 직렬화 수행
			//Object -> Customer
			//readObject() 실행해서 Customer객체 정보를 읽어들임 
			Customer m = (Customer)ois.readObject();
			//객체 정보 출력
			System.out.println(m);			
			
		//파일이 존재하지 않는 경우 오류
		}catch(FileNotFoundException e){
			
		//입력할 때 오류
		}catch(IOException e){
			e.printStackTrace();
			
		//복원할 때 클래스 정보가 없는 경우 오류
		}catch(ClassNotFoundException e){
			e.printStackTrace();			
		}finally{	//자원 관리
			if(ois!=null){ try{ois.close();}catch(IOException e){e.printStackTrace();} }
			if(fis!=null){ try{fis.close();}catch(IOException e){e.printStackTrace();} }			
		}		
	}
}
