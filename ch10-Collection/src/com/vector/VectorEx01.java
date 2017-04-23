/* Vector
	• 자원 추가
	• 요소 추출
	• 자원 검색
	• 자원 삭제



//--------------------
Vector 클래스
	• Vector클래스는 제네릭을 사용할 수 있는 대표적인 클래스
	• 제네릭을 표현하기 위해서는 클래스명 다음에 < >를 사용하여 자료형을 지정해야 합니다.


http://codedragon.tistory.com/4393

 */

package com.vector;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		
		//Double 데이터를 저장할 수 있는 Vector 객체 생성
		Vector<Double> v = new Vector<Double>();
		
		//자원 추가
		v.add(new Double(100.3));
		v.add(3.14);
		v.add(1000.);	//1000.0 동일의미
		
		
		//요소추출
		for( Double dbl : v){
			System.out.println(dbl);
		}		
		
		
		
		System.out.println();
		//자원검색
		double search = 1000.0;	//검색할 요소
		
		//해당 요소가 저장된 인덱스 구하기
		//int indexOf(Object elem): elem 객체의 위치를 반환합니다.
		int index = v.indexOf(search);
		
		//해당 인덱스에 데이터가 존재하면
		if(index != -1){ //해당데이터가 없으면:-1 리턴
			System.out.println("검색요소" + search + "의 위치: " + index);			
		}else{
			System.out.println("검색요소" + search + "가 없습니다.");
		}
				
		double del = 3.14;	//삭제할 요소
		
		
		
		System.out.println();
		//자원 삭제
		//데이터 포함 유무 확인하기 - 데이터 포함 유무 확인 후 데이터 삭제
		if(v.contains(del)){
			//자원 삭제
			v.remove(del);	
			System.out.println(del + "삭제완료");
		}
		
		
		
		System.out.println();
		//데이터 확인하기
		for( Double dbl : v){
			System.out.println(dbl);
		}	
		
		System.out.println(v);

	}
}

/* 출력결과
100.3
3.14
1000.0

검색요소1000.0의 위치: 2

3.14삭제완료

100.3
1000.0
[100.3, 1000.0]


*/