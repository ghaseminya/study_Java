//static 변수
 
//FileInfo
//StaticEx01.java	main부, Static 변수 호출
//StaticCount.java	Static 변수 선언


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
