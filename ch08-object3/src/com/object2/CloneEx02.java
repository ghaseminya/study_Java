/*
//확인 후 주석 처리
package com.object2;
//깊은 복사(Deep Copy)
//참조변수의 인스턴스값을 카피하고 이 인스턴스가 참조하고 있는 인스턴스의 값까지 복사하게 되어
//깊은 복사가 이루어져 다른 결과를 출력하게됩니다
//얇은 복사 => 다시 얇은 복사
//얇은 복사후 참조하고 있는 인스턴스의 클론메소드 호출하게 됩니다.

//★ 깊은 복사(Deep Copy) 도식도
//
//
//-----------------------------
//출력결과
//이름, 나이 정보
//한국: [김프로, 32]
//미국: [Bill, 37]
//
//이름, 나이 정보
//한국: [홍길동, 27]
//미국: [Sara, 18]


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
		//얇은 복사
		Nation copy=(Nation)super.clone();
		//다시 얇은 복사
		copy.infoKorean=(InfoPerson)infoKorean.clone();
		copy.infoAmerican=(InfoPerson)infoAmerican.clone();
		
		return copy;
	}
}

class CloneEx02
{	
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