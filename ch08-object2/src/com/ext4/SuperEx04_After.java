//super() 연습 - 처리 후
//super()를 통해 초기화하기

//File Info
//SuperEx04_Before.java		자식클래스의 생성자를 통해 초기화
//SuperEx04_After.java		super()를 통해 초기화


package com.ext4;

//부모 클래스
class Point_{
	int x;
	int y;
	
	public Point_(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String getLocation(){
		return "x : " + x + ", y" + y;
	}
}


//자식 클래스
class Point3D_ extends Point_{		
	
	int z;
	
	Point3D_(int x, int y, int z){		
		//TODO 1: 초기화 순서가 있으므로 순서를 정확히 해줘야 한다.
//		this.z = z;
//		super(x, y); //ERROR-Constructor call must be the first statement in a constructor
	
		
		//TODO 2: super()를 통해 초기화하기
		super(x, y); //부모 먼저
		this.z = z;  //그다음 자식
		
	}
	
	@Override	//메소드 재정의
	public String getLocation(){
		return "x: " + x + ", y: " + y + ", z: " + z;
	}	
}

public class SuperEx04_After {

	public static void main(String[] args) {
		
		Point3D_ p3d = new Point3D_(7, 8, 9);
		System.out.println(p3d.getLocation());
		//x: 7, y: 8, z: 9
	}
}
