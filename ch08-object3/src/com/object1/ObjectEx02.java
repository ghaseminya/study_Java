/* Object Class - 객체 비교
 * 
 * 객체 비교1 - 참조값을 통한
 * 객체 비교2 - 비교 연산자를 통한 (가장 많이 사용함)
 * 객체 비교3 - Object.equals를 통한 
 * */

package com.object1;

public class ObjectEx02 {
	public static void main(String[] args){
		ObjectEx02 ob1 = new ObjectEx02();
		
		//객체 비교 - 참조값을 통한
		//주소값 출력
		System.out.println("ob1: \t\t" + ob1);
		
		ObjectEx02 ob2 = new ObjectEx02();
		//주소값 출력
		System.out.println("ob2: \t\t" + ob2);
		
		System.out.println();
		//객체 비교 - 연산자를 통한
		if(ob1 == ob2){
			System.out.println("같은 객체");
		}else{
			System.out.println("다른 객체");
		}
		
		System.out.println();
		//객체 비교 - Object.equals를 통한 
		if(ob1.equals(ob2)){
			System.out.println("같은 객체");
		}else{
			System.out.println("다른 객체");
		}
	}
}
