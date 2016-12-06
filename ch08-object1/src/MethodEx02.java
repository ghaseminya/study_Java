/*
//인자 전달 방식: 값 호출(call by value)

[인자 전달 방식]
값 호출 (Call by Value)
• 값을 복사하여 전달
• 호출 시의 실인자는 별도의 값으로 인식되어 영향을 받지 않습니다.
• 메서드를 호출 시 기본 자료형의 값을 인자로 전달하는 방식

참조 호출 (Call by Reference)	
• reference(주소)가 복사되어 전달
• 하나의 객체를 참조하는 변수가 2개가 되어 어느 한 곳에서 수정을 하게 되면 같은 객체를 참조하는 다른 쪽에서도 영향을 받게 됩니다
• 메서드 호출 시 전달하려는 인자를 참조(객체) 자료형을 사용하는 경우를 의미
• 여기에는 기본 자료형이 아닌 일반 객체 또는 배열들이 여기에 속합니다.

Varargs (Variable Arguments)
• 가변인자
• JDK 5.0에서 새롭게 추가된 기능
• 타입은 일치하지만 인자의 개수가 가변적
• 메서드 정의 시 통일된 인자의 자료형에 ‘…’라고 명시하여 이를 통해 메서드를 수행하는데 필요한 인자의 수를 유연하게 구현할 수 있습니다.
• 넘어온 인자는 내부적으로 배열화 작업을 자동적으로 해 주게 됩니다.
• ... (3개 dot) 사용해서 구현하며 넘어온 인자는 모두 배열로 관리되어집니다.

//-------------------------------------------------------
//참조 도식도
http://codedragon.tistory.com/4615
http://cfile28.uf.tistory.com/image/242D234858460B682735D5

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
