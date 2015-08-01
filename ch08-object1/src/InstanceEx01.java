//객체 선언/생성/호출

public class InstanceEx01 {

	//멤버 필드
	int var1;	//변수
	final int NUM_TWO=2;	//상수
	
	/*생성자: 객체 생성시 호출 되고 멤버변수를 초기화하는 역할
	생성자를 호출하면
	멤버 필드와 멤버 메소드가 생성되어 메모리에 올라갈 수 있도록 해줍니다.*/
	public InstanceEx01(){}
	
	
	//멤버 메소드
	public int sum(int a, int b){
		return a+b;
	}	
	
	//메인 메소드
	public static void main(String[] args) {
		//객체 선언
		InstanceEx01 me1;
		InstanceEx01 me2;
		
		//객체 생성
		me1 = new InstanceEx01();
		me2 = new InstanceEx01();

		
//		질문: 같은 클래스를 가지고 객체를 생성하게 되면 같은 참조값을 가지나?
//		답: 다른 참조값을 가지고 멤버필드도 개별적으로 존재하게 됩니다.
		//객체 출력(참조값)
		System.out.println(me1);
		System.out.println(me2);
		
		
		//객체의 멤버 변수 출력
		System.out.println();		
		System.out.println(me1.var1);
		
		//객체의 멤버 변수 변경하기
		System.out.println();		
		me1.var1 = 10;
		System.out.println(me1.var1);
		System.out.println(me2.var1);
	

//		멤버 상수 변경하기
//		멤버 상수는 변경할 수 없으므로 변경시 Error
//		me1.NUM_TWO = 20;	//Error: The final field InstanceEx01.NUM_TWO cannot be assigned
		
		System.out.println();
		//멤버 메소드 호출
		int result = me1.sum(20, 40);
		System.out.println("멤버 메소드 호출후 반환값 : " +  result );
		
	}
}
