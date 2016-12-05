/*
//확인 후 전체 주석처리

//인자값없는 생성자를 통한 초기화
//---------------------------------------------
//생성자(Constructor)
//	• 생성자라는 것은 메모리상에 객체가 생성될 때 자동적으로 단 한번 호출되어 
//	• 객체의 구조를 인식하게 하고 
//	• 생성되는 객체의 멤버 변수들을 초기화 하는 역할
//
//
//생성자의 특징(조건)
//	• 생성자의 이름은 클래스명과 같아야 합니다.
//	• Return Type이 정의되지 않으며, 반환하지도 않는 메소드 입니다
//	• 인스턴스 생성시 생성자는 반드시 호출됩니다.
//	• 생성자에서 final상수의 초기화 가능
//
//
//생성자의 구성 형식
//class 클래스명{
//    [접근제한] [생성자명](자료형 인자1, 자료형 인자2,…){
//           수행문1;
//           수행문2;
//           …;
//    }
//}
//
//
//생성자의 필요성
//	• 특정 클래스가 생성될 때마다 가지는 인스턴스(instance)의 변수가 있다면 항상 값을 설정해 주어야 하는 번거로움이 발생합니다.
//	• 이를 해결하기 위해 생성자를 이용하여 1차적으로 초기화 작업을 거치면서 객체를 생성하면 좀 더 편리하게 사용할 수 있습니다.


// 주 클래스
public class ObjectEx02 {
	
	public static void main(String[] args)	{
		//인스턴스 생성
		Number myNumber1=new Number();
		//new		: 인스턴스 생성 의미
		//Number()	: 매개변수가 없는 Default생성자를 호출
		
		Number myNumber2=new Number();
		

		System.out.println("myNumber1 메소드 호출 전 값: " + myNumber1.getNum());
		System.out.println("myNumber2 메소드 호출 전 값: " + myNumber2.getNum());
			
		//myNumber1 메소드		
		instMethod(myNumber1);
		System.out.println("myNumber1 메소드 호출 후 값: " + myNumber1.getNum());
		System.out.println("myNumber2 메소드 호출 후 값: " + myNumber2.getNum());
		
		//myNumber2 메소드
		instMethod(myNumber2);
		System.out.println("myNumber1 메소드 호출 후 값: " + myNumber1.getNum());
		System.out.println("myNumber2 메소드 호출 후 값: " + myNumber2.getNum());
	}

	public static void instMethod(Number number){
		number.addNum(10);
	}		
}

//클래스 정의(클래스 설계)
class Number{
	//멤버변수 = 인스턴스 변수
	int num;
	
	//인자값이 없는 생성자 정의
	public Number()	{
		num=30;	//초기화
		System.out.println("생성자 호출됨!");
	}
	
	//멤버 메소드 = 인스턴스 메소드
	public void addNum(int n)	{
		num+=n;
	}
	
	public int getNum()	{
		return num;
	}
}


//출력결과
//생성자 호출됨!
//생성자 호출됨!
//myNumber1 메소드 호출 전 값: 30
//myNumber2 메소드 호출 전 값: 30
//myNumber1 메소드 호출 후 값: 40
//myNumber2 메소드 호출 후 값: 30
//myNumber1 메소드 호출 후 값: 40
//myNumber2 메소드 호출 후 값: 40


*/