package com.object2;
/*
//확인 후 주석 처리

package com.object1;
////얇은 복사(Shallow Copy)
//	• Object 클래스의 clone 메소드는 인스턴스를 통째로 복사는 하지만, 
//	• 인스턴스가 참조하고 있는 또 다른 인스턴스까지 복사하지는 않습니다. 단순히 참조 값만을 복사합니다.
//
//
//
//clone() 메소드
//	• Object 클래스에는 인스턴스의 복사를 목적으로 clone이라는 이름의 메소드가 정의되어 있습니다.
//	• 단, 이 메소드는 Cloneable 인터페이스를 구현하는 클래스의 인스턴스에서만 호출할수 있습니다.
//	• Cloneable 인터페이스의 구현은 "이 클래스의 인스턴스는 복사를 해도 됩니다.“라는 의미를 가집니다.
//	• 인스턴스의 복사는 매우 민감한 작업입니다. 
//	그래서 클래스를 정의할 때 복사의 허용여부를 결정하도록 Cloneable 인터페이스를 통해서 정의하도록 요구하고 있습니다.
//
//
//
//★ 얇은 복사(Shallow Copy) 도식도
////------------------------
////결과적으로 얇은 복사가 이루어져 동일한 결과가 나오게 됩니다.
////출력결과
//이름, 나이 정보
//한국: [김프로, 32]
//미국: [Bill, 37]
//
//이름, 나이 정보
//한국: [김프로, 32]
//미국: [Bill, 37]

class InfoPerson implements Cloneable {
	private String strName;
	private int intAge;
	
	public InfoPerson(String x, int y) {
		strName=x;
		intAge=y;
	}
	public void showPosition() {
		System.out.printf("[%s, %d]", strName, intAge);
	}
	public void changePos(String x, int y) {
		strName=x;
		intAge=y;
	}
	public Object clone() throws CloneNotSupportedException	{
		return super.clone();
	}
}

class Nation implements Cloneable {
	InfoPerson infoKorean, infoAmerican;
	
	public Nation(String x1, int y1, String x2, int y2) {
		infoKorean=new InfoPerson(x1, y1);
		infoAmerican=new InfoPerson(x2, y2);
	}
	public void showPosition() {
		System.out.println("이름, 나이 정보");
		System.out.print("한국: ");
		infoKorean.showPosition();
		System.out.println("");	
		System.out.print("미국: ");
		infoAmerican.showPosition();	
		System.out.println("\n");
	}
	public void changePos(String x1, int y1, String x2, int y2) {
		infoKorean.changePos(x1, y1);
		infoAmerican.changePos(x2, y2);
	}
	public Object clone() throws CloneNotSupportedException	{
		return super.clone();
	}
}

class CloneEx01 {	
	public static void main(String[] args) {
		Nation orgin=new Nation("홍길동", 27, "Sara", 18);
		Nation copy;
		
		try	{
			copy=(Nation)orgin.clone();
			orgin.changePos("김프로", 32, "Bill", 37);
			orgin.showPosition();
			copy.showPosition();
		}
		catch(CloneNotSupportedException e)	{
			e.printStackTrace();
		}
	}
}
*/