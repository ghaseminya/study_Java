/*
//인자값없는 생성자를 통한 초기화


public class ObjectEx02 {
	
	public static void main(String[] args)	{
		//인스턴스 생성
		Number myNumber1=new Number();
		//new Number	: 인스턴스 생성 의미
		//Number()		: 매개변수가 없는 Default생성자를 호출하여 인스턴스 생성
		Number myNumber2=new Number();
		
		System.out.println("myNumber1 메소드 호출 전 값: " + myNumber1.getNumber());
		instMethod(myNumber1);
		System.out.println("myNumber1 메소드 호출 후 값: " + myNumber1.getNumber());	
		
		System.out.println("myNumber2 메소드 호출 전 값: " + myNumber2.getNumber());
		instMethod(myNumber2);
		System.out.println("myNumber2 메소드 호출 후 값: " + myNumber2.getNumber());
	}

	public static void instMethod(Number number){
		number.addNum(10);
	}		
	
}

//클래스 정의(설계)
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
	
	public int getNumber()	{
		return num;
	}
}*/