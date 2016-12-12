/* Object Class - 객체 비교 정리
TODO : 객체 비교1 - 참조값을 통한 비교
TODO : 객체 비교2 - 비교 연산자를 통한 비교(가장 많이 사용함)
TODO : 객체 비교3 - Object.equals를 통한 비교
*/

package com.object1;

public class ObjectClassEx04 {
	public static void main(String[] args){
		ObjectClassEx05 ob1 = new ObjectClassEx05();
		
		//TODO : 객체 비교 - 참조값을 통한
		//주소값 출력
		System.out.println("ob1: " + ob1); //ob1: com.object1.ObjectClassEx05@6d06d69c
		
		ObjectClassEx05 ob2 = new ObjectClassEx05();
		//주소값 출력
		System.out.println("ob2: " + ob2); //ob2: com.object1.ObjectClassEx05@7852e922
		

		//TODO : 객체 비교 - 연산자를 통한 비교 (가장 많이 사용함)
		if(ob1 == ob2){
			System.out.println("같은 객체");
		}else{
			System.out.println("다른 객체");
		}
		//다른 객체
		
		
		//TODO : 객체 비교 - Object.equals를 통한 비교
		if(ob1.equals(ob2)){
			System.out.println("같은 객체");
		}else{
			System.out.println("다른 객체");
		}
		//다른 객체
	}
}


/*//출력결과
ob1: com.object1.ObjectClassEx05@6d06d69c
ob2: com.object1.ObjectClassEx05@7852e922
다른 객체
다른 객체

*/
