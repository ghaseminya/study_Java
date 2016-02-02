package com.object1;
/*
//Object클래스의 equals()메소드 재정의
	• ObjectClassEx02에서 별도의 isEquals메소드를 정의하여 사용하는 것이 아니라
	• Object클래스의 equals()메소드를 재정의하여 내용비교하도록 처리


equals() 메소드
	• 객체의 인스턴스 값 비교
	• 객체 비교시 실제 값을 비교하지 않고 위치값을 비교
	• 실제값을 비교하기 위해서는 equals 메소드를 오버라이딩하여 사용해야 합니다.
	• Object 클래스의 equals 메소드를 인스턴스의 내용비교 메소드로 지정해 놓았기 때문에, 
	처음 접하는 클래스의 인스턴스라 하더라도 equals 메소드의 호출을 통해서 인스턴스간 내용 비교를 할 수 있습니다.


*/
class IntNumber3 {
	int num;
	
	public IntNumber3(int num) {
		this.num=num;
	}
	
	//Object클래스의 equals()메소드 재정의
	@Override
	public boolean equals(Object obj) {
		if(this.num==((IntNumber3)obj).num)
			return true;
		else
			return false;
	}
}

public class ObjectClassEx03 {
	public static void main(String[] args) {
		IntNumber3 num1=new IntNumber3(10);
		IntNumber3 num2=new IntNumber3(15);
		IntNumber3 num3=new IntNumber3(10);
		
		if(num1.equals(num2))
			System.out.println("num1과 num2는 같은 정수");
		else
			System.out.println("num1과 num2는 다른 정수");
		//num1과 num2는 다른 정수
		
		if(num1.equals(num3))
			System.out.println("num1과 num3는 같은 정수");
		else
			System.out.println("num1과 num3는 다른 정수");
		//num1과 num3는 같은 정수
	}

}
