/*
//참조변수와 참조 메소드의 관계 확인



public class ObjectEx01 {
	
	public static void main(String[] args){
		//인스턴스 생성
		Number myNumber=new Number();
		System.out.println("메소드 호출 전 값: "+myNumber.getNumber());
		
		//인스턴스 참조값을 메소드의 매개변수로 전달
		instMethod(myNumber);
		System.out.println("메소드 호출 후 값: "+myNumber.getNumber());	
	}

	public static void instMethod(Number number){
		number.addNum(10);
	}		
	
}

//클래스 정의(설계)
class Number{
	//멤버변수 = 인스턴스 변수
	int num=0;
	
	//멤버 메소드 = 인스턴스 메소드
	public void addNum(int n){
		num+=n;
	}
	
	public int getNumber()	{
		return num;
	}
}*/