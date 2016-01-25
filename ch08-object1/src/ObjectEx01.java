/*
//확인 후 전체 주석
//참조변수와 참조 메소드의 관계 확인

//객체(Object) 의미
//	• 객체(object)는 인스턴스(instance)라고 부르기도 합니다.
//	• 인스턴스는 클래스(청사진)을 통해 만들어진 실체입니다.
//	• 객체는 자신의 정보를 가지고 있는 독립적인 주체


//클래스 헤더
//	• 클래스를 선언하는 부분
//	• class라는 예약어를 중심으로 오른쪽은 클래스 명이며
//	• 왼쪽은 접근 제한(Access Control/Access Modifier)과 클래스의 형태 및 클래스 종류를 나타내게 됩니다.

//[클래스 헤더 형식]
//[접근제한] [클래스종류] class [클래스명] 

//[접근제한]	• 접근제한은 말 그대로 현재 클래스를 접근하여 생성하고 사용하는데 있어 제한을 두겠다는 의미에서 정의하는 것입니다. 
//			• 클래스에서 쓰이는 접근 제한은 public을 정의하는 방법과 아예 정의하지 않는 방법 두 가지가 있습니다.

//[클래스종류]	• 현재 클래스가 어떤 클래스인지를 알리는 수식어의 일종으로 최종(final)클래스 또는 추상(abstract)클래스와 같은 클래스 종류를 의미하며 현재 클래스가 어떤 클래스인지를 알리는 수식어의 일종입니다.
//			• 이 부분이 생략되게 되면 일반 클래스임을 의미 하게 됩니다.

//[클래스명]	클래스의 이름을 의미


//---------------------------------


// 주 클래스
public class ObjectEx01 {
	
	public static void main(String[] args){
		//인스턴스 생성 == 참조변수 선언/생성
		//new		: 인스턴스 생성 의미
		//Number()	: 매개변수가 없는 Default생성자를 호출
		Number myNumber=new Number();
		
		System.out.println("메소드 호출 전 값: "+myNumber.getNum());	//0
		
		//인스턴스 참조값을 메소드의 매개변수로 전달
//		instMethod(myNumber);
		myNumber.addNum(10);
		
		System.out.println("메소드 호출 후 값: "+myNumber.getNum());	//10
	}

//	public static void instMethod(Number number){
//		number.addNum(10);
//	}		
	
}

//클래스 정의(클래스 설계)
class Number{ //클래스의 구성요소: 멤버필드, 생성자, 멤버메소드
	//멤버변수 = 인스턴스 변수
	int num=0;
	
	//멤버 메소드 = 인스턴스 메소드
	public void addNum(int n){
		num+=n;
	}
	
	public int getNum()	{
		return num;
	}
}

*/