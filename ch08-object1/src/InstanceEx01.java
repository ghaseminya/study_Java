/*
//객체 선언/생성/호출


[객체 생성]
	• 클래스의 이름과 동일한 이름을 가진 생성자를 이용해서 객체를 생성합니다.
	• 이때 new 키워드와 함께 생성자함수를 호출하여 객체를 생성하게 됩니다.

클래스명 객체 = new 생성자(); 



[멤버 접근법]
	• mc와 같은 객체의 참조(reference)를 통해 . (점)를 사용하여 해당 객체의 메서드나 변수 즉 멤버들에 접근 할 수 있습니다. 
	•  .는 dot연산자라고도 하며 사용법은 객체참조.멤버명 형식으로 사용됩니다. 

[멤버 접근 형식]
객체참조.멤버명

MyClass mc;
mc = new MyClass();

mc.setAge(27);
 

*/
//주 클래스: public으로 선언된 클래스
public class InstanceEx01 {
	//클래스의 구성요소: 멤버필드, 생성자, 멤버메소드

	//멤버 필드
	int var1;	//변수
	final int NUM_TWO=2;	//상수
	
//	생성자: 객체 생성시 호출 되고 멤버변수를 초기화하는 역할
//	생성자를 호출하면
//	멤버 필드와 멤버 메소드가 생성되어 메모리에 올라갈 수 있도록 해줍니다.
	public InstanceEx01(){}
	
	//멤버 메소드
	public int sum(int a, int b){
		return a+b;
	}	
	
	//메인 메소드
	public static void main(String[] args) {		
		//객체 생성시 main은 객체에 포함되지 않음.
		//그냥 메인함수로만 취급
		//클래스 로더가 main을 메모리에 올리고 
		//그 다음 객체를 생성합니다. 멤버들만(멤버 변수, 멤버메소드)만 객체에 포함됩니다.
		
		//객체 선언
		InstanceEx01 me1;
		InstanceEx01 me2;
		
		//객체 생성
		me1 = new InstanceEx01();
		me2 = new InstanceEx01();
		//new : 객체 생성(인스턴스 생성) 의미
		//() : InstanceEx01() == 매개변수가 없는 디폴트 생성자를 의미
		
		
//		질문: 같은 클래스를 가지고 객체를 생성하게 되면 같은 참조값을 가지나?
//		답: 다른 참조값을 가지고 멤버필드도 개별적으로 존재하게 됩니다.
		//객체 출력(참조값)
		System.out.println(me1);	//InstanceEx01@659e0bfd
		System.out.println(me2);	//InstanceEx01@2a139a55
		
		//객체의 멤버 변수 출력
		System.out.println();		
		System.out.println(me1.var1);	//0
		
		//객체의 멤버 변수 변경하기
		System.out.println();		
		me1.var1 = 10;
		System.out.println(me1.var1);	//10
		System.out.println(me2.var1);	//0
	

//		멤버 상수 변경하기
//		멤버 상수는 변경할 수 없으므로 변경시 Error
//		me1.NUM_TWO = 20;	//Error: The final field InstanceEx01.NUM_TWO cannot be assigned
		
		System.out.println();
		//멤버 메소드 호출
		int result = me1.sum(20, 40);
		System.out.println("멤버 메소드 호출후 반환값 : " +  result );	//멤버 메소드 호출후 반환값 : 60
		
	}
}
