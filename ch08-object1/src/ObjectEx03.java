/*
//확인 후 전체 주석처리

//인자값이 있는 생성자를 통한 초기화
//-생성자를 통해 원하는 값으로 초기화


//디폴트 생성자(Default Constructor)
//	• 생성자를 정의하지 않았을 경우에만 호출 되어 집니다.
//	• 생성자가 없어도 인스턴스 생성이 가능한 이유는 자바 컴파일러가 자동으로 아래와 같은 디폴트 생성자를 자동으로 삽입시켜주기 때문입니다.
//	• 모든 클래스는 자동으로 기본 생성자(디폴트 생성자)가 생성됩니다.
//	• 인수를 가지지 않는 생성자(생성자는 오버로딩이 가능하므로 여러 개를 둘 수 있는데 그 중 인수가 없는 생성자)
//	• 디폴트 생성자의 접근제어 지시자는 클래스의 선언형태에 따라서 결정됩니다
//	• 초기화 역할을 하는 생성자가 아닙니다.
//	• 프로그래머가 생성자를 직접 정의한 경우 컴파일러는 매개변수가 없는 기본 생성자를 제공하지 않습니다.



//--------------------------------------------

// 주 클래스
public class ObjectEx03 {
	
	public static void main(String[] args){
		//인스턴스 생성
		Number myNumber1=new Number(10);
		//new			: 인스턴스 생성 의미
		//Number(10)	: 매개변수10을 인자로 전달하여 초기화하는 생성자를 호출
		
		Number myNumber2=new Number(20);
		
		//TODO : 인자값이 있는 생성자 정의후 default 생성자 호출
		//ERROR-Number myNumber2=new Number(20);
		//• 만약 개발자가 직접 생성자를 지정하게되면 기본 생성자는 자동 생성되지 않습니다.
		//• public Number(){} (자동 생성 안됨)
		//• 디폴트 생성자로 객체를 생성하고자 할 경우 명시적으로 디폴트 생성자를 정의해 주어야 합니다.
//		Number myNumber3=new Number();
		
		
		System.out.println("myNumber1 의 값: " + myNumber1.num);
		System.out.println("myNumber2 의 값: " + myNumber2.num);
		
		//myNumber1 메소드
		instMethod(myNumber1);
		System.out.println("myNumber1 의 값: " + myNumber1.num);
		System.out.println("myNumber2 의 값: " + myNumber2.num);
		
		
		//myNumber2 메소드
		instMethod(myNumber2);
		System.out.println("myNumber1 의 값: " + myNumber1.num);
		System.out.println("myNumber2 의 값: " + myNumber2.num);
	}

	public static void instMethod(Number number){
		number.addNum(10);
	}		
}

//클래스 정의(클래스 설계)
class Number{
	//멤버변수 = 인스턴스 변수
	int num;
	
	//인자값이 있는 생성자 정의
	public Number(int number){
		num=number;
		System.out.println("생성자 호출됨!");
		System.out.println("전달된 인자값: " + number);
	}
	
	//멤버 메소드 = 인스턴스 메소드
	public void addNum(int n){
		num+=n;
	}
	
	public int getNum()	{
		return num;
	}
}


//출력결과
//생성자 호출됨!
//전달된 인자값: 10
//생성자 호출됨!
//전달된 인자값: 20
//myNumber1 의 값: 10
//myNumber2 의 값: 20
//myNumber1 의 값: 20
//myNumber2 의 값: 20
//myNumber1 의 값: 20
//myNumber2 의 값: 30

*/