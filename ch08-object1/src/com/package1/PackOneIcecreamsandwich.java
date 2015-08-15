//eclipse를 사용하면 클래스 생성시 지정한 패키지이름이 자동 삽입되고 자동 컴파일이 되어 집니다
package com.package1;

public class PackOneIcecreamsandwich {	
	
	//접근 지정자를 지정하지 않은 경우 디폴트로 같은 클래스에서만 호출 가능합니다.
	//그러므로  getter메소드를 통해 조회및 변경이 가능하도록 코딩합니다.
	//인스턴스 변수를 public으로 지정할 수 도 있지만 getter메소드를 통해 제어하는 것을 강력히 추천합니다.
	
	String str = "Package1 - Icecreamsandwich"; //강추
	
	public String msg = "Package1";	//비추
	
	public String getStr(){
		return str;
	}
}
