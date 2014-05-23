/* String 클래스 - 암시적 객체 생성/명시적 객체 생성
 * 
 * <암시적 객체 생성>
 * 스트링 객체 생성-리터럴을 이용하여 문자열 생성
 * 객체 비교 
 * 객체의 내용(문자열) 비교
 * 
 * 
 * <명시적 객체 생성>
 * 명시적 객체 생성- new연산자를 이용하여 문자열 생성
 * 객체 비교- 동일위치를 참조하는지 조건 검사
 * 객체의 내용(문자열) 비교
 * - 명시적으로 객체 생성시 다른 객체이며 hashCode() 값이 동일하게 나와도 다른 것이다. 그래서 객체 비교를 해보면 객체가 다름을 확인 할 수 있다.
 * 이는 내부적으로 String이 다르게 처리해 주고 있기 때문입니다. 
 * 
 * (중요) 문자열 비교시 equals()로 비교해야 합니다.
 * 
 * */

package com.langex;

public class StringEx01 {

	public static void main(String[] args) {
		// 암시적 객체 생성
		String str1 ="Hello";
		String str2 ="Hello";

		//객체 비교 
		if( str1 == str2){
			System.out.println("str1과 str2는 같은 객체");
		}else{
			System.out.println("str1과 str2는 다른 객체");
		}
				
		//객체의 내용(문자열)비교
		if(str1.equals(str2)){
			System.out.println("str1과 str2의 내용이 같다");
		}else{
			System.out.println("str1과 str2의 내용이 다르다");
		}
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("\n================================");
		//명시적 객체 생성
		String msg1 = new String("World");
		String msg2 = new String("World");
		
		//객체 비교- 동일위치를 참조하는지 조건 검사
		if( msg1 == msg2){	
			System.out.println("msg1과 msg2는 같은 객체");
			//동일한 World문자열이지만 매번 새롭게 생성되기 때문에 위치값이 서로 다르게 된다.
		}else{
			System.out.println("msg1과 msg2는 다른 객체");
		}
		
		//객체의 내용 비교
		if(msg1.equals(msg2)){
			System.out.println("msg1과 msg2의 내용이 같다");
		}else{
			System.out.println("msg1과 msg2의 내용이 다르다");
		}
		
		System.out.println(msg1.getClass());
		System.out.println(msg2.getClass());
		System.out.println(msg1.hashCode());
		System.out.println(msg2.hashCode());
		System.out.println(msg1);
		System.out.println(msg2);
	}

}
