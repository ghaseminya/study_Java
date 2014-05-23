/* super() 연습 - 처리 후
 * 
 * 
 * */

package com.ext2;

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

	
Point3D_(int x, int y, int z){		
		//초기화 순서가 있으므로 순서를 정확히 해줘야 한다.
		/*this.z = z;
		super(x, y);*/	
	
		super(x, y);	
		this.z = z;
		
	}
	
	int z;
	
	@Override	//메소드 재정의
	public String getLocation(){
		return "x: " + x + ", y: " + y + ", z: " + z;
	}	
}

public class SuperEx04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point3D_ p3d = new Point3D_(7, 8, 9);
		System.out.println(p3d.getLocation());

	}
}
