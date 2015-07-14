/* 인자 전달 방식: 값 호출(call by value)
 
int var1(실인자)의 값이 복사된 복사본이 int n(형식인자)에 대입되고 이 값을 증가 시키더라도 
int var1(실인자)는 영향을 전혀 받지 않지 않습니다. 즉 int n(형식인자)만 증가하게 되는 것이고 인자로 전달된 int var1(실인자)의 값은 변함이 없습니다. 

 * */

public class MethodEx02 {
	
	
	//멤버변수
	
	//인자 전달 방식: 값 호출(call by value)
	public int increase(int v){ // v: var1의 값 복사
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
