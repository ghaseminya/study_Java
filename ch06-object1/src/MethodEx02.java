/* 인자 전달 방식: 값 호출(call by value)
 * 
 * */

public class MethodEx02 {
	
	
	//멤버변수
	
	//인자 전달 방식: 값 호출(call by value)
	public int increase(int v){
		++v;
		return v;
	}

	public static void main(String[] args) {
		
		//지역 변수
		int var1 = 100;
		MethodEx02 m = new MethodEx02();
		
		int var2 = m.increase(var1);	//메서드를 호출 시 기본 자료형의 값을 인자로 전달하는 방식

		System.out.println("var 1: " + var1);
		System.out.println("var 2: " + var2);

	}

}
