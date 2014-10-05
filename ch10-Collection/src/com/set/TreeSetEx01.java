/*
TreeSet 클래스 이해

출력순서가 정렬되는 것을 확인하고 이것이 TreeSet<E>의 특징임을 기억하시기 바랍니다.

*/
package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx01 {
	public static void main(String[] args)
	{
		TreeSet<Integer> sTree=new TreeSet<Integer>();
		sTree.add(7);
		sTree.add(1);
		sTree.add(5);
		sTree.add(2);
		sTree.add(4);
		sTree.add(3);
		sTree.add(2);
		
		System.out.println("저장된 데이터 수: "+sTree.size());
		
		//데이터는 정렬되어 저장이 되기 때문에 
		//iterator() 메소드의 호출로 생성된 반복자 는 오름차순의 데이터 참조를 잔행합니다다
		Iterator<Integer> itr=sTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
