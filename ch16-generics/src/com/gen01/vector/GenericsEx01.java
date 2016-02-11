package com.gen01.vector;
/*
Vector클래스를 이용한 제네릭 문법 예제

//TODO 1: for반복문을 이용하여 저장된 원소 출력
//TODO 2: 확장 for문을 사용하여 저장된 모든 원소를 추출하기


Vector 클래스
	• Vector클래스는 제네릭을 사용할 수 있는 대표적인 클래스
	• 제네릭을 표현하기 위해서는 클래스명 다음에 < >를 사용하여 자료형을 지정해야 합니다.



제네릭 사용시 별도의 형 변환(Casting)이 불필요
	• 컬렉션 클래스의 일종인 벡터 클래스를 사용할 경우 원소들은 Object형으로 업캐스팅되어 저장됩니다. 
	저장된 원소를 다시 추출할 경우 처음 저장 당시의 타입으로 다운캐스팅 해야 합니다. 
	• 제네릭을 사용하면 다운캐스팅 하지 않고서도 원소 추출이 가능합니다.



Vector 클래스 형식
< >를 사용하여 자료형을 지정합니다.
Vector<자료형> g = new Vector <자료형>();
Vector<String> g = new Vector <String>();



★ Vector 클래스 도식도

//------------------------------------------
*/


//Vector 클래스를 사용하기 위해서 임포트
import java.util.Vector;

public class GenericsEx01 {

	public static void main(String[] args) {
		//저장하려는 원소의 타입을 선언하여 제네릭을 생성
		Vector<String> gen = new Vector<String>();
		
		//벡터 객체에 원소를 저장
		gen.add("대한만국");
		gen.add("미국");
		gen.add("중국");
		
		
		//TODO 1: for반복문을 이용하여 저장된 원소 출력
		//저장된 원소를 추출하하여 임시저장하기 위한 변수 선언
//		String tmp;
		//size() 메서드 : 벡터에 저장된 원소의 개수를 반환하므로 원소의 개수만큼 반복하는 구문을 구성할 수 있습니다
//		for(int i=0; i<gen.size(); i++){
//			//벡터 객체에 저장된 원소를 다운캐스팅 하지 않고 추출하여 바로 출력하고 있습니다.
//			tmp=gen.get(i);
//			System.out.println(tmp);
//		}
		
		
		//TODO 2: 확장 for문을 사용하여 저장된 모든 원소를 추출하기
		for(String tmp : gen){
			System.out.println(tmp);
		}
	}
}
