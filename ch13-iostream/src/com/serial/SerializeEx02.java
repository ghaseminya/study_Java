/*
직렬화 대상 제외-transient

--------------------------------------
transient로 선언된 멤버는 직렬화의 대상에서 제외됩니다.
따라서 복원 시 자료형 별 디폴트 값(0, 0.0, null등)이 대신 저장되어 집니다.
*/
package com.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeEx02 {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException {
		//인스턴스 저장
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("PersonInfo.ser"));
		PersonInfo info=new PersonInfo("Dorothy", "엉덩이에 점", 27, 1234567);
		
		//오리지널 데이터 정보 출력
		info.showPersonInfo();
		out.writeObject(info);
		out.close();

		
		//인스턴스 복원 
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("PersonInfo.ser"));
		PersonInfo recovInfo=(PersonInfo)in.readObject();
		in.close();

		 //복원된 정보 출력 
		recovInfo.showPersonInfo();
	}

}


class PersonInfo implements Serializable {
	String name;
	transient String secretInfo;	//직렬화 대상 제외

	int age;
	//transient로 선언된 멤버는 직렬화의 대상에서 제외됩니다.
	//따라서 복원 시 자료형 별 디폴트 값(0, 0.0, null등)이 대신 저장되어 집니다.
	transient int socialNumber;

	public PersonInfo(String name, String sInfo, int age, int sNumber) {
		this.name=name;
		secretInfo=sInfo;
		this.age=age;
		socialNumber=sNumber;
	}
	public void showPersonInfo() {
		System.out.println("Name: "+name);
		System.out.println("Secret info: "+secretInfo);
		System.out.println("Age: "+age);
		System.out.println("Social Number: "+socialNumber);
		System.out.println("");
	}
}