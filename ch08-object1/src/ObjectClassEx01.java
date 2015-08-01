/*
인스턴스 소멸 시 호출되는 finalize 메소드

실행과정에서 finalize 메소드는 호출되지 않을 수 있습니다.
왜냐하면, Garbage Collection이 실행되는 시기와 인스턴스의 완전한 소멸의 시기는 차이가 날 수 있기 때문이다.
finalize 메소드: Garbage Collection에 의해 완전 소멸될 때 호출됩니다.

*/
class MyName{
	String objName;
	public MyName(String name){
		objName=name;
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize메소드 호출");
		System.out.println(objName+"이 소멸되었습니다.");
	}

}



public class ObjectClassEx01 {

	public static void main(String[] args){
		MyName obj1=new MyName("인스턴스 1");	//가비지컬렉션 대상
		MyName obj2=new MyName("인스턴스 2");	//가비지컬렉션 대상
		MyName obj3=new MyName("인스턴스 3");	//가비지컬렉션 대상
		obj1=null;
		obj2=null;
		obj3=null;
		
		System.out.println("프로그램을 종료합니다.");
		
		//finalize()명시적 호출
		System.gc();	
		System.runFinalization();	
		
		/*System.gc();으로 Garbage Collection을 동작시키는 메소드입니다. 
		하지만 heap영역의 가비지컬렉션 대상을 바로 소멸시키지 않고 JVM에 상황에 따라 나중에 소멸시킬 수도 있기 때문에 바로 finalize()되지 않을 수 있습니다.
		System.runFinalization(); 호출로 추가적으로 인스턴스의 완전 소멸을 명령해 주어야 합니다.*/
	}
}
