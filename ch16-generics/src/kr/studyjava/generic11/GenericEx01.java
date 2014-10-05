/*
제네릭 메소드와 배열

*/
package kr.studyjava.generic11;

public class GenericEx01 {
	//[ ] 연산이 필요하다면 매개변수의 선언을 통해서 전달 되는 참조 값을 배열 의 참조 값으로 제한해야 합니다.
	public static <T> void showArrayData(T[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
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
