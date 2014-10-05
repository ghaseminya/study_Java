/*
해시 알고리즘 적용

hashCode() 재정의
- 반환된 해시값을 통해 해당 그룹확인
equals() 재정의
- 해당 그룹에 있는 인스턴스와 equals()메소드를 호출하여 값이 같은지 비교
*/
package com.set;

import java.util.HashSet;
import java.util.Iterator;


class Number3 {
	int num;
	public Number3(int n) {
		num=n;
	}
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num%3;	//%3 의 연산이 해시 알고리즘, 해시 그룹은 세 그룹으로 나뉩니다.

	}
	
	//인스턴스 변수 num이 같을때 동일 인스턴스로 간주하는 내용이 담겨 있다
	@Override
	public boolean equals(Object obj) {
		Number3 comp=(Number3)obj;
		if(comp.num==num)
			return true;
		else
			return false;		
	}
}

public class HashSetEx03 {
	public static void main(String[] args) {
		HashSet<Number3> hSet=new HashSet<Number3>();
		hSet.add(new Number3(10));
		hSet.add(new Number3(20));
		hSet.add(new Number3(20));
		hSet.add(new Number3(30));
		
		System.out.println("저장된 데이터 수: "+hSet.size());
		
		Iterator<Number3> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
