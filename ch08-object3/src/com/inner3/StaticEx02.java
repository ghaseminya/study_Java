//Nested 클래스 이해


package com.inner3;

class OuterClass{
	
	OuterClass(){
		//클래스 내부에서는 직접 객체 생성 가능
		NestedClass nc = new NestedClass();
		nc.getData();
	}
	
	//Nested 클래스
	//클래스 외부에서 이 클래스의 이름은 OuterClass.NestedClass가 됩니다.
	//NestedClass가 private으로 선언되면, 선언된 클래스 내부에서만 인스턴스를 생성할 수 있습니다.
	static class NestedClass{
		
		public void getData(){
			System.out.println("Nested Instance Method");
		}		
	}	
}

public class StaticEx02 {

	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		
		//Nested 클래스의 인스턴스 생성방법
		OuterClass.NestedClass ocnc = new OuterClass.NestedClass();
		ocnc.getData();
		
//		OuterClass.NestedClass ocnc2 = oc.new NestedClass(); //ERROR, 참고
		
	}
}


/*//출력결과
Nested Instance Method
Nested Instance Method
*/