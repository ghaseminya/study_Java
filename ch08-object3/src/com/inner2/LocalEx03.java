package com.inner2;

/*
Local 클래스의 적절한 사용 모델
	• 인터페이스의 구현을 기반으로 로컬 클래스를 정의하면
	• 외부에 정의된 인터페이스의 참조변수를 통해서 인스턴스의 참조가 가능합니다.


*/
interface Readable{
	public void read();
}

class OuterClass{
	private String strName;

	OuterClass(String name)	{
		strName=name;
	}

	public Readable createLocalClassInst(){
		
		//인터페이스의 구현을 기반으로 로컬 클래스를 정의하면
		//외부에 정의된 인터페이스의 참조변수를 통해서 인스턴스의 참조가 가능합니다.
		class LocalClass implements Readable{
			@Override
			public void read(){
				System.out.println("Outer inst name: "+strName);
			}
		}

		return new LocalClass();
	}
}

class LocalEx03{	
	public static void main(String[] args){
		OuterClass out1=new OuterClass("Kung Fu Panda Po");
		Readable localInst1=out1.createLocalClassInst();
		localInst1.read();

		OuterClass out2=new OuterClass("Master Shifu");	
		//외부에 정의된 인터페이스의 참조변수를 통해서 인스턴스의 참조 가능
		Readable localInst2=out2.createLocalClassInst();
		localInst2.read();
	}
}


/*
//출력결과
Outer inst name: Kung Fu Panda Po
Outer inst name: Master Shifu
*/

