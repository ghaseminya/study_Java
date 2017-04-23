/*
HashSet의 동일 인스턴스의 판단기준 

HashSet<E> 클래스의 인스턴스 동등비교 방법
Object 클래스에 정의되어 있는 equals() 메소드 의 호출결과와 hashCode() 메소드의 호출결과를 
참조하여 인스턴스의 동등비교를 진행합니다.
equals 메소드 : 인스턴스 참조값 비교
hashCode() 메소드: 해시값을 통해 그룹을 만듬

실행결과를 보면, 동일 인스턴 스의 판단기준이 별도로 존재 함을 알 수 있습니다.


*/
package com.set;

import java.util.HashSet;
import java.util.Iterator;


class Number {
	int num;
	public Number(int n) {
		num=n;
	}
	public String toString() {
		return String.valueOf(num);
	}
}

public class HashSetEx02 {
	public static void main(String[] args) {
		HashSet<Number> hSet=new HashSet<Number>();
		hSet.add(new Number(10));
		hSet.add(new Number(20));
		hSet.add(new Number(20));
		hSet.add(new Number(30));
		
		System.out.println("저장된 데이터 수: "+hSet.size());
		
		Iterator<Number> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
