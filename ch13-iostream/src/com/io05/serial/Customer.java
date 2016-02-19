package com.io05.serial;
/* 객체 직렬화 - 직렬화 대상

File Info
*Customer.java		객체 직렬화(직렬화 대상)
CustomerMain1.java	객체 직렬화(ObjectOutputStream)
CustomerMain2.java	역 직렬화(ObjectInputStream)


//-------------------------------------------------------------
Serializable인터페이스가 구현된 클래스는 객체 직렬화 대상이 됩니다.
멤버 변수에 있는 데이터가 중요한 것이므로 멤버 변수가 있어야 직렬화를 하며
멤버 변수가 없는 경우 직렬화하는 것은 무의미합니다.


직렬화전 반드시 명시해야 됩니다.
implements 하지 않으면 ERROR 납니다.
java.io.NotSerializableException: com.serial.Customer
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1183)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:347)
	at com.serial.CustomerMain.main(CustomerMain.java:46)
	object.ser에 ERROR를 포함한 여러줄의 내용이 저장됨(정상 직렬화는 한줄로 저장됨)
 */


import java.io.Serializable;

//Serializable인터페이스가 구현된 클래스는 객체 직렬화 대상이 됩니다.
public class Customer implements Serializable{
//public class Customer {
	//멤버 변수(인스턴스 변수)
	private String name;
	
	//인스턴스 변수 초기화하는 생성자
	public Customer(String name){
		this.name = name;
	}
	
	public String toString(){
		return "Your name is " + name;
	}

}
