/*
//인자 전달 방식: 값 호출(call by value)

[인자 전달 방식]
값 호출				• 값을 복사하여 전달
(Call by Value)		• 호출 시의 인자는 별도의 값으로 인식되어 영향을 받지 않습니다.

참조 호출				• reference(주소)가 복사되어 전달
(Call by Reference)	• 하나의 객체를 참조하는 변수가 2개가 되어 어느 한 곳에서 수정을 하게 되면 
같은 객체를 참조하는 다른 쪽에서도 영향을 받게 됩니다

Varargs					• 가변인자
(Variable Arguments)	• 타입은 일치하지만 인자의 개수가 가변적
						• ... (3개 dot) 사용해서 구현하며 넘어온 인자는 모두 배열로 관리되어 짐
						• JDK ver5 부터 사용 가능

값 호출 (Call by Value)
	• 메서드를 호출 시 기본 자료형의 값을 인자로 전달하는 방식


//참조 도식도

//-------------------------------------------------------
int var1(실인자)의 값이 복사된 복사본이 int v(형식인자)에 대입되고 이 값을 증가 시키더라도 
int var1(실인자)는 영향을 전혀 받지 않지 않습니다. 
즉 int v(형식인자)만 증가하게 되는 것이고 인자로 전달된 int var1(실인자)의 값은 변함이 없습니다. 

*/
public class MethodEx02 {
	
	//인자 전달 방식: 값 호출(call by value)
	public int increase(int v){ // v: var1의 값 복사
		++v;
		return v;
	}

	public static void main(String[] args) {
		
		//지역 변수
		int var1 = 100;
		MethodEx02 m = new MethodEx02();
		
		//메서드를 호출 시 기본 자료형의 값을 인자로 전달하는 방식
		//int var1(실인자)의 값이 복사된 복사본이 int v(형식인자)에 대입
		int var2 = m.increase(var1); 

		System.out.println("var 1: " + var1); //var 1: 100
		System.out.println("var 2: " + var2); //var 2: 101

	}
}
