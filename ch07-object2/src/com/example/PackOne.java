package com.example;

public class PackOne {	
	
	/*접근 지정자를 지정하지 않은 경우 디폴트로 같은 클래스에서만 호출 가능하다.
	그러므로  getter메소드를 통해 조회및 변경이 가능하도록 코딩합니다.
	인스턴스 변수를 public으로 지정할 수 도 있지만 getter메소드를 통해 제어하는 것을 강력히 추천합니다.*/
	
	String str = "PackOne";
	
	//public String str = "PackOne";	//비추
	
	public String getStr(){
		return str;
	}
}
