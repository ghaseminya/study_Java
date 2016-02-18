/* 객체 직렬화 - ObjectOutputStream
 * 
 * 파일 생성후 파일 직렬화하기
 * 
 * ------------------------------------------------------------------------------
 * Customer.java
 * CustomerMain.java
 *  
 * ------------------------------------------------------------------------------
 * 객체안에 저장된 데이터 위주
 * (클래스를 다 저장하는 것이 아니라 멤버변수에 저장된 데이터를 저장하는 것임) 
 * 
 * 참조하지(사용하지) 않을 경우 쓰레기 객체가 되어 사용할 수 없는데 
 * 객체 직렬화를 해놓으면 다시 사용할 수 있습니다. 객체를 보관 후 재사용할 수 있습니다.
 * (객체 정의 및 생성/저장되는 과정이 필요없이 바로 사용가능하게 하기 위해)
 * 작업일시 정지했다가 다시 작업 재개할 때도 효율적임.
 * 
 * object.ser: JVM이 읽을수 있는 것이다.
 *  
 * 객체 직렬화 사용이유:
 * 서버간 데이터 전송을 위해서 사용(네트워크 전송)
 */

package com.io05.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class CustomerMain1 {

	public static void main(String[] args) {
		// 
		System.out.println("===객체 직렬화 하기===");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//직렬화할 객체 생성
		//참조하지(사용하지) 않을 경우 쓰레기 객체가 되어 사용할 수 없는데 객체 직렬화를 해놓으면 다시 사용할 수 있습니다. 
		//"Steve스티브" 데이터를 가진 객체 생성
		Customer c = new Customer("Steve스티브");
		
		try{
			//객체 직렬화할때는 dat/ser로 확장자하는 것이 보통
			//byte처리를 해야하기 때문에 FileOutputStream객체 생성
			fos = new FileOutputStream("object.ser");
			//객체 직렬화를 위해서 ObjectOutputStream객체 생성
			oos = new ObjectOutputStream(fos);
			//객체 직렬화 수행
			//writeObject()이용해서 Customer객체를 파일에 출력
			oos.writeObject(c);
			
			System.out.println("객체 직렬화 완료!!!");			
			
		}catch(IOException e){ 
			e.printStackTrace(); 
		}finally{	//자원 관리
			if( oos!=null){ try{oos.close();}catch(IOException e){e.printStackTrace();} }
			if( fos!=null){ try{fos.close();}catch(IOException e){e.printStackTrace();} }			
		}	
	}
}
