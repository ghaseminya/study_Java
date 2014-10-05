/* Vector
 * 
 * 자원 추가
 * 요소 추출
 * 자원 검색
 * 자원 삭제
 */

package com.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
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
		int index = v.indexOf(search);
		if(index != -1){	//해당데이터가 없으면:-1 리턴
			System.out.println("검색요소" + search + "의 위치: " + index);			
		}else{
			System.out.println("검색요소" + search + "가 없습니다.");
		}
				
		double del = 3.14;	//삭제할 요소
		//데이터 포함 유무 확인하여 데이터 삭제
		if(v.contains(del)){
			v.remove(del);	//삭제
			System.out.println(del + "삭제완료");
		}
		
		for( Double dbl : v){
			System.out.println(dbl);
		}	
		
		System.out.println(v);

	}

}
