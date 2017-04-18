/* ArrayList에서 삭제시 인덱스 변동에 문제
입력된 데이터중 짝수만 삭제하기


//--------------------
ArrayList의 데이터 삭제시 인덱스 변경이 이뤄나기 때문에
인덱스 뒤에서 부터 삭제해야 인덱스 변경에 대한 문제를 해결할 수 있다.
그러기 위해
마지막 인덱스 부터 시작해서 조건 체크하면
건너뛰는 데이터가 발생하지 않고 모든 요소의 조건 체크 가능 

 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx06 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		//데이터의 저장
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(16);
		
		System.out.println(al);
		System.out.println("-------------------------");
		
		for(int num : al)
			System.out.println(num);
		
		
		//데이터의 참조
		System.out.println("---데이터의 참조---");
		for(int i=0; i<al.size(); i++ ){
				System.out.println(al.get(i));			
		}	

		
		
		System.out.println("---순차적으로 데이터 삭제 시 인덱스가 변경되는 문제발생 ---");
		for(int i=0; i<al.size(); i++ ){
			if(al.get(i)%2 ==0){//짝수
				//데이터의 삭제
				al.remove(i);				
			}			
		}	
		
		
//		System.out.println("---인덱스 마지막 부터 조건 체크시 문제 해결 ---");
//		//인덱스 마지막 부터 조건 체크
//		for(int i=al.size()-1; i>=0; i-- ){
//			if(al.get(i)%2 ==0){//짝수
//				//데이터의 삭제
//				al.remove(i);				
//			}
//		}
		System.out.println(al);
	}
}

/*
출력결과
순차적으로 데이터 삭제 시 인덱스가 변경되는 문제발생되어 짝수값이 정확이 비교가 되지 않아 짝수값이 존재하게 됩니다.
[10, 20, 15, 16]
-------------------------
10
20
15
16
---데이터의 참조---
10
20
15
16
---순차적으로 데이터 삭제 시 인덱스가 변경되는 문제발생 ---
[20, 15]

출력결과
인덱스 마지막 부터 조건 체크시 문제 해결
[10, 20, 15, 16]
-------------------------
10
20
15
16
-------------------------
10
20
15
16
[15]



*/