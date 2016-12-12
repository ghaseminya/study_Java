package com.inner2;

/*
//Local 클래스의 지역변수, 매개변수 접근
	• 메소드가 반환하는 순간 매개변수와 지역변수는 소멸됩니다. 
	그러므로 매개변수와 지역변수의 접근할수 없습니다. 
	• 단, final로 선언된 변수의 접근은 허용합니다. 
	접근의 허용을 위해서 final 변수를 로컬 클래스의 인스턴스가 접근 가능한 영역에 복사하게 됩니다.(메모리의 스태틱 영역에 복사)
	메모리구조에서 클래스영역의 상수 메모리(constants pool)영역에 저장됩니다.
	(클래스 메모리영역은 정적코드 영역과 상수메모리 영역으로 구성되어 있습니다.

*/

interface Readable4{
	public void read();
}

class OuterClass4{
	private String myName;
	
	OuterClass4(String name){
		myName=name;
	}
	
	//TODO : final로 변수 선언 전/후 결과 확인하기
	//로컬 내부 클래스가 정의된 메소드내의 로컬변수에는 접근 할 수 없습니다.
	//final로 선언된 변수의 접근은 허용합니다. 
	//접근의 허용을 위해서 final 변수를 로컬 클래스의 인스턴스가 접근 가능한 영역에 복사하게 되므로 접근이 가능합니다.
	//함수의 매개변수도 지역변수
	public Readable4 createLocalClassInst(final String instName){
		
		class LocalClass implements Readable4{
			
			@Override
			public void read(){
				System.out.println("Outer instance name: "+ myName);
				System.out.println("Local instance name: "+ instName);
			}
		}
		
		return new LocalClass();
	}
}

class LocalEx04{	
	public static void main(String[] args){
		
		OuterClass4 out=new OuterClass4("Amanda");
		
		Readable4 localInst1=out.createLocalClassInst("Edwin");
		localInst1.read();
		
		Readable4 localInst2=out.createLocalClassInst("Bella");
		localInst2.read();
	}
}


/*
//출력결과
Outer instance name: Amanda
Local instance name: Edwin
Outer instance name: Amanda
Local instance name: Bella
*/