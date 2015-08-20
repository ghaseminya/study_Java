/*
//인자값없는 생성자를 통한 초기화

// 주 클래스
public class ObjectEx02 {
	
	public static void main(String[] args)	{
		//인스턴스 생성
		Number myNumber1=new Number();
		//new		: 인스턴스 생성 의미
		//Number()	: 매개변수가 없는 Default생성자를 호출
		Number myNumber2=new Number();
		
		//myNumber1 메소드
		System.out.println("myNumber1 메소드 호출 전 값: " + myNumber1.getNum());
		instMethod(myNumber1);
		System.out.println("myNumber1 메소드 호출 후 값: " + myNumber1.getNum());	
		
		//myNumber2 메소드
		System.out.println("myNumber2 메소드 호출 전 값: " + myNumber2.getNum());
		instMethod(myNumber2);
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

*/