package com.gen13;
/*//제네릭 메소드와 배열

제네릭 메소드와 배열
	• 배열도 인스턴스이므로 제네릭 매개변수에 전달이 가능합니다.
	• 하지만 이렇게 전달을 하면 다음과 같은 문장을 쓸 수 없습니다

System.out.println(arr[i]);



제네릭에 배열 사용
	• 다음과 같이 매개변수를 선언하면, 매개변수에 전달되는 참조 값을 배열 인스턴스의 참조 값으로 제한할 수 있습니다.
	• 그리고 이렇게 되면 참조 값은 배열 인스턴스의 참조 값임을 100% 보장하게 되므로 [ ] 연산을 허용하게 됩니다.

T[ ] arr

*/
public class GenericEx01 {
	//[ ] 연산이 필요하다면 매개변수의 선언을 통해서 전달 되는 참조 값을 배열 의 참조 값으로 제한해야 합니다.
	public static <T> void showArrayData(T[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
//		for( String str: arr){
//			System.out.println(str);
//		}
	}
	
	public static void main(String[] args) {
		String[] stArr=new String[]{
				"Hi! Everyone!",
				"I'm study JAVA",
				"Java Generic Programming",
				"I'm Programmer!"
		};
		
		showArrayData(stArr);
	}
}
