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
http://codedragon.tistory.com/4393
http://cfile2.uf.tistory.com/image/2107C1435827AFF623F3CC
//------------------------------------------


for-each문(확장 for문)
	• 배열의 일부가 아닌, 배열의 전체를 참조할 필요가 있는 경우에 유용하게 사용할 수 있습니다.
	• for-each 문을 통한 값의 변경은 실제 배열에 반영되지 않으니, 값의 참조를 목적으로만 사용해야 합니다
	• 자바 5.0 이상(JDK 1.5 이상)에서 사용 가능




for-each문 형식
	• 콜론(:) 왼쪽에는 배열의 값이 반복 저장될 변수가 오고,
	• 오른쪽에는 반복대상(배열 or 컬렉션)이 위치합니다.
	• 저장원소타입은 배열 또는 컬렉션에 저장된 원소의 타입과 동일해야 합니다.
	• 중괄호는 일반적인 for문과 역할이 같습니다. 

for(저장원소타입 제어변수명 : 반복대상)


배열 요소 출력 예
	• 반복문이 한 번 반복될 때마다 변수 e에 컬렉션 arr의 인덱스가 하나씩 저장되며, e에 저장된 원소와 한 칸의 공백을 출력합니다.
	• 반복은 배열의 인덱스 0부터 n-1까지 반복되어집니다.
	• 배열 자체는 참조만 되기 때문에 변경되지 않습니다.

for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
}
for(int e: arr){
        System.out.println(e);
}
 



for-each문의 인스턴스 배열
	• 인스턴스 배열에 저장된 참조 값의 변경은 불가능하지만, 
	• 참조 값을 통한 인스턴스의 접근은(데이터 변경도)가능합니다.



*/


//Vector 클래스를 사용하기 위해서 임포트
import java.util.Vector;

public class GenericsEx01 {

	public static void main(String[] args) {
		//저장하려는 원소의 타입을 선언하여 제네릭을 생성
		Vector<String> gen = new Vector<String>();
		
		//벡터 객체에 원소를 저장
		//boolean add(Object o) : o 객체를 Vector 내에 저장하고 그 결과 여부를 true, false로 반환합니다.
		gen.add("대한만국");
		gen.add("미국");
		gen.add("중국");
		
		
		//TODO 1: for반복문을 이용하여 저장된 원소 출력
		//저장된 원소를 추출하하여 임시저장하기 위한 변수 선언
		String tmp;
		
		//int size(): Vector의 현재 size를 반환합니다.
		//벡터에 저장된 원소의 개수를 반환하므로 원소의 개수만큼 반복하는 구문을 구성할 수 있습니다
		for(int i=0; i<gen.size(); i++){
			//Object get(int index): Vector의 index 번째 요소를 Object 형태로 반환합니다.
			//벡터 객체에 저장된 원소를 다운캐스팅 하지 않고 추출하여 바로 출력하고 있습니다.
			tmp=gen.get(i);
			System.out.println(tmp);
		}
		
		
		//TODO 2: 확장 for문을 사용하여 저장된 모든 원소를 추출하기
//		for(String tmp : gen){
//			System.out.println(tmp);
//		}
	}
}


/*//출력결과
대한만국
미국
중국
*/