/*
직렬화 연계

*/
package com.io6.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeEx01 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
			//인스턴스 저장
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Object.ser"));
			
			out.writeObject(new Circle(10, 10, 12.4));
			out.writeObject(new Circle(22, 22, 24.6));	
			out.writeObject(new String("String implements Serializable"));
			out.close();
			
			//인스턴스 복원
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("Object.ser"));
			Circle cl1=(Circle)in.readObject();
			Circle cl2=(Circle)in.readObject();
			String message=(String)in.readObject();
			in.close();
			
			//복원된 정보 출력
			cl1.showCirlceInfo();
			cl2.showCirlceInfo();
			System.out.println(message);
		}
}

//implements Serializable 직렬화 가능
class Position implements Serializable
{
	int x, y;
	
	public Position(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}

//implements Serializable 직렬화 가능
class Circle implements Serializable
{
	//멤버인 position가 참조하는 인스턴스도 직렬화 가능하다면(Serializable 인터페이스를 	구현하는 클래스의 인스턴스라면), 
	//position가 참조하는 인스턴스도 Circle 인스턴스가 직렬화 될 때 함께 직렬화 됩니다.

	Position position;
	double radius;
	
	public Circle(int x, int y, double r) {
		position=new Position(x, y);
		radius=r;
	}
	public void showCirlceInfo() {
		System.out.printf("Position: [%d, %d] \n", position.x, position.y);
		System.out.println("radius: "+radius);
	}
}