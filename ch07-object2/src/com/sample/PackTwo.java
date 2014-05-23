/*패키지 생성 및 
같은 패키지의 클래스 호출
다른 패키지의 클래스 호출*/


package com.sample;

//클래스 하나만 import
import com.example.PackOne;

//클래스 여러개 import: 해당 패키지내의 모든 클래스 import 됨
//import com.example.*;

public class PackTwo {
	
	
	//java.lang 패키지의 모든 클래스는 자동으로 import됨
	String str = "PackTwo";
	
	public static void main(String[] args){
		
		//com.sample.PackThree p3 = new com.sample.PackThree();
		//같은 패키지의 클래스를 호출할 때는 패키지 생략
		PackThree p3 = new PackThree();
		System.out.println(p3.str);
		
		PackTwo p2 = new PackTwo();
		System.out.println(p2.str);
		
		
		//다른 패키지의 클래스를 호출할 때는 패키지를 명시해야 함
		//PackOne p1 = new PackOne();
		//com.example.PackOne p1= new com.example.PackOne();
		
		//다른 패키지의 인스턴스 변수를 직접 호출할 수 없음 (public이나 getter메소드 사용하여 호출)
		//System.out.println( p1.str );		
		
		//클래스 상단에 import문을 이용해 패키지와 클래스(패키지 포함)를 등록하면 코드 작성시 클래스명만 기재할 수 있음
		PackOne p1 = new PackOne();
		System.out.println(p1.getStr());		
		
		
	}

}
