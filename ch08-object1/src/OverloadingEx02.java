//비 오버로딩 예제
//자료형별로 개별적으로 함수 정의
//-> OverloadingEx03 오버로딩 구현

public class OverloadingEx02 {

	public static void main(String[] args) {
		OverloadingEx02 oe = new OverloadingEx02();

		//개별적으로 함수 호출
		oe.intLength(1000);
		oe.floatLength(3.14f);
		oe.stringLength("10000");
	}


	//자료형별로 개별적으로 함수 정의
	public void stringLength(String s){
		System.out.println("입력한 값의 길이 : " + s.length()); //입력한 값의 길이 : 4
	}
	public void intLength(int a){
		String s = String.valueOf(a);
		System.out.println("입력한 값의 길이 : " + s.length());  //입력한 값의 길이 : 4
															//3.14f: f는 길이에 포함되지 않습니다. 실수임을 표시하는 마킹 역할만합니다.
	}
	public void floatLength(float f){
		String s = String.valueOf(f);
		System.out.println("입력한 값의 길이 : " + s.length()); //입력한 값의 길이 : 5
	}
}
