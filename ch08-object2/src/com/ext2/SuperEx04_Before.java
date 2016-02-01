//super() 연습 - 처리 전 
//super()를 통해 초기화하기

//File Info
//SuperEx04_Before.java	자식클래스의 생성자를 통해 초기화
//SuperEx04_After.java	super()를 통해 초기화


package com.ext2;

//부모 클래스
class Point{
	
	int x;
	int y;
	
	
	public Point(){		
	}	
	
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String getLocation(){
		return "x : " + x + ", y" + y;
	}
}

//자식 클래스
class Point3D extends Point{
	
	int z;
	
	Point3D(){		
	}
	
	//자식클래스의 생성자를 통해 초기화
	Point3D(int x, int y, int z){		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override	//메소드 재정의
	public String getLocation(){
		return "x: " + x + ", y: " + y + ", z: " + z;
	}	
}

public class SuperEx04_Before {

	public static void main(String[] args) {
		//객체 생성
		Point3D p3d = new Point3D(1, 2, 3);
		//재정의한 메소드 호출
		System.out.println(p3d.getLocation());

	}
}
