//인자값이 있는 생성자를 통한 초기화
//-생성자를 통한 원하는 값으로 초기화


public class ObjectEx03 {
	
	public static void main(String[] args){
		//인스턴스 생성
		Number myNumber1=new Number(10);
		//new Number	: 인스턴스 생성 의미
		//Number()		: 매개변수10을 인자로 전달하여 초기화하는 생성자를 호출하여 인스턴스 생성
		Number myNumber2=new Number(20);
		
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
	
	public int getNumber()	{
		return num;
	}
}