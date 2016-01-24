/*
//Static 변수
//인스턴스 이름을 이용한 접근방법

//FileInfo
//StaticEx01.java	main부, Static 변수 호출
//StaticCount.java	Static 변수 선언


static 변수의 접근방법
	• 두가지 형태로 접근이 가능하며 어떠한 형태로 접근을 하든 접근의 내용에는 차이가 없습니다. 다만 접근하는 위치에 따라서 접근의 형태가 달라질 수 있습니다
	• static변수에 대한 접근은 클래스 이름을 이용한 접근방법을 권장합니다. (인스턴스 이름을 통해 접근할 경우 인스턴스변수에 대한 접근인지 static변수에 대한 접근인지 구분하기 힘들기 때문입니다.)

인스턴스 이름을 이용한 접근방법	
StaticCount sc1= new StaticCount();
sc1.count++;

클래스 이름을 이용한 접근방법(권장)	
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
