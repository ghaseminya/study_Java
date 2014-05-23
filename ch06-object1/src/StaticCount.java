/* static 변수
 * 
 * StaticCount
 * StaticEx01 * 
 * */


public class StaticCount {
	
	// 객체 생성시 heap영역에 객체가 만들어지고 객체에 포함
	int c;				//인스턴스 변수
	
	// 객체 생성과 관계 없음
	// 호출하면 static영역에 만들어 진다.
	static int count;	//static 변수
	
	public StaticCount(){
		c++;
		count++;
	}
	

}
