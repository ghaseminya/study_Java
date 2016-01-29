/*
//Static 변수
//인스턴스 이름을 이용한 접근방법

//FileInfo
//StaticEx01.java	main부, static 변수 호출
//StaticCount.java	static 변수 선언


static예약어
	• static 예약어는 메서드(멤버함수)나 멤버변수에 정의 할 수 있으며
	• 지역 변수나 클래스에서는 정의 할 수 없습니다.
	• 메서드(멤버함수)나 멤버변수에 static이라는 예약어를 정의하면 static메서드 (클래스메서드)와 static변수(클래스변수)라고 불리게 됩니다.
	• 이유는 멤버변수나 메서드(멤버함수)들은 해당 객체가 생성될 때 객체가 생성된 메모리 공간에 같이 존재하게 되지만 
	  static으로 선언된 메서드(멤버함수)나 변수들은 
	  static영역(메소드영역)이라는 곳에 유일하게 만들어 지면서 모든 객체(Object)들이 사용 할 수 있도록 공유개념을 가지게 되기 때문입니다.


static정의 형식
접근제한과 static은 위치 교체가능
[접근제한] static [자료형] 변수명; 
[접근제한] static [반환형] 메서드명(자료형 인자1, 자료형 인자2, …){}

//-----------------------------------
StaticCount.java  정의 후 아래 설명보기

static 변수의 접근방법
	• 두가지 형태로 접근이 가능하며 어떠한 형태로 접근을 하든 접근의 내용에는 차이가 없습니다. 
	다만 접근하는 위치에 따라서 접근의 형태가 달라질 수 있습니다
	• static변수에 대한 접근은 클래스 이름을 이용한 접근방법을 권장합니다. 
	(인스턴스 이름을 통해 접근할 경우 인스턴스변수에 대한 접근인지 static변수에 대한 접근인지 구분하기 힘들기 때문입니다.)

1) 인스턴스 이름을 이용한 접근방법	
StaticCount sc1= new StaticCount();
sc1.count++;

2) 클래스 이름을 이용한 접근방법(권장)	
StaticCount.count+=3;


*/
public class StaticEx01 {

	public static void main(String[] args) {
		
		StaticCount sc1= new StaticCount();
		System.out.println("c = " + sc1.c + "\t count = " + StaticCount.count);
		System.out.println("sc1 = " + sc1.count);	//인스턴스 이름을 이용한 접근방법
//		System.out.println("sc1 = " + StaticCount.count); //클래스 이름을 이용한 접근방법(권장)
		System.out.println();
		
		System.out.println("=================================");
		StaticCount sc2= new StaticCount();
		System.out.println("c = " + sc2.c + "\t count = " + StaticCount.count);
		System.out.println("sc2 = " + sc2.count);	//인스턴스 이름을 이용한 접근방법
		System.out.println();
		
		System.out.println("=================================");
		StaticCount sc3= new StaticCount();
		System.out.println("c = " + sc3.c + "\t count = " + StaticCount.count);
		System.out.println("sc3 = " + sc3.count);	//인스턴스 이름을 이용한 접근방법

	}
}
