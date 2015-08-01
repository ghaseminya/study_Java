//Static 변수
//인스턴스 이름을 이용한 접근방법

//FileInfo
//StaticCount.java	static 변수 선언
//StaticEx01.java	Static 변수 호출



public class StaticEx01 {

	public static void main(String[] args) {
		
		StaticCount sc1= new StaticCount();
		System.out.println("c = " + sc1.c + "\t count = " + StaticCount.count);
		System.out.println("sc1 = " + sc1.count);	//인스턴스 이름을 이용한 접근방법
//		System.out.println("sc1 = " + StaticCount.count);	//클래스 이름을 이용한 접근방법(권장)
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
