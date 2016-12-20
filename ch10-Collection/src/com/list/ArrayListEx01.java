/* ArrayList - ArrayList에 객체가 저장됨을 출력으로 확인
 * 
 * import
 * ArrayList에 객체를 저장
 * ArrayList에 객체가 저장됨을 출력으로 확인하기
 * Object클래스의 ToString()재정의해서 데이터값 출력 확인하기 

//--------------------

List 인터페이스
	• List구조는 Sequence라고도 하며 시작과 끝이 지정되어 저장되는 요소들을 일괄적인 정렬상태를 유지하면서 저장이 이루어집니다.
	• 이런 점 때문에 컬렉션의 List와 배열의 구조는 같다고 볼 수 있으며 
	다른점은 배열은 크기가 고정되어 있는 것이고 컬렉션의 List구조는 가변적 길이를 가진다는 것이 차이입니다. 
	• List 인터페이스를 구현한 클래스에는 Stack과 Vector, ArrayList가 있습니다.



Array vs List
구분		차이
Array	고정 길이
List	가변 길이



ArrayList
• List인터페이스를 구현하고 있는 것뿐 아니라 ArrayList는 배열의 크기를 조작하기 위한 메소드들이 제공됩니다.
• 공백을 포함한 모든 요소들을 저장 할 수 있으며  Vector와 유사하지만 ArrayList는 스레드의 동기화는 지원하지 않습니다.


 */

package com.list;

import java.util.ArrayList;

class A{
	
	//TODO 2: Object에 있는 toString()재정의: 참조값 출력되는 것을 데이터값이 출력되도록 재정의
	@Override
	public String toString(){
		return "A";
	}	
}

public class ArrayListEx01 {

	public static void main(String[] args) {
		//ArrayList에 객체를 저장
		ArrayList a1 = new ArrayList();
		
		//add()통해 데이터 삽입
		a1.add(new A());			//A -> Object
		a1.add(new Integer(100));	//Integer -> Object
		a1.add("계절");				//String -> Object
		
		
		//TODO 1: toString()재정의하지 않은 경우
		System.out.println(a1);
		//[com.list.A@40671416, 100, 계절]	//참조값이 반환된 것을 확인
		
		//TODO 3: toString()재정의 후 출력
		//[A, 100, 계절]	//toString()재정의를 통해 참조값이 아닌 리턴된 데이터값 출력
	}
}


/*
출력결과-toString()재정의하지 않은 경우
[com.list.A@6d06d69c, 100, 계절]


출력결과-toString()재정의 후 출력
[A, 100, 계절]

*/