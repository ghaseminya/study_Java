/* ArrayList - ArrayList에 객체가 저장됨을 출력으로 확인
 * 
 * import
 * ArrayList에 객체를 저장
 * ArrayList에 객체가 저장됨을 출력으로 확인하기
 * Object클래스의 ToString()재정의해서 데이터값 출력 확인하기 
 */

package com.list;

import java.util.ArrayList;

class A{
	
	//Object에 있는 toString()재정의: 참조값 출력되는 것을 데이터값이 출력되도록 재정의
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
		
		System.out.println(a1);
		//[com.list.A@40671416, 100, 계절]	//참조값이 반환된 것을 확인
		
		//toString()재정의 후 출력
		//[A, 100, 계절]	//toString()재정의를 통해 참조값이 아닌 리턴된 데이터값 출력
	}
}