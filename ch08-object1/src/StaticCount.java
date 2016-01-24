/*
//static 변수
 
//FileInfo
//StaticEx01.java	main부, Static 변수 호출
//StaticCount.java	Static 변수 선언


static변수(class 변수)
	• 인스턴스의  생성과  상관없이 초기화되는 변수
	• 하나만 선언되는 변수
	• public으로 선언되면 누구나 어디서든 접근 가능
	• static변수 = class변수(인스턴스와 관계없이 클래스와 관계가 깊기 때문에)


static변수의 초기화 시점
	• 인스턴스의 생성과 상관없이 초기화되는 변수
	• JVM은 실행과정에서 필요한 클래스의 정보를 메모리에 로딩(Loading)하는데
	• 바로 이 로딩 시점에서 static 변수가 초기화됩니다.


*/
public class StaticCount {
	
	// 객체 생성시 heap영역에 객체가 만들어지고 객체에 포함
	int c;				//인스턴스 변수
	
	// 객체 생성과 관계 없음
	// 호출하게되면 static영역(메소드 영역)에 만들어지며 공유개념을 가지게 됩니다.
	static int count;	//static 변수
	
	public StaticCount(){
		c++;
		count++;
	}
}
