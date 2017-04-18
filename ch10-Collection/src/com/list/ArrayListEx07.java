package com.list;

import java.util.ArrayList;
import java.util.Collections;

//ArrayList 기본적인 메소드로 객체 다루기


//Type safety: The method add(Object) belongs to the raw type ArrayList. References to generic type ArrayList<E> should be parameterized
//http://codedragon.tistory.com/5265


public class ArrayListEx07 {

	public static void main(String[] args) {
		

		//Type unsafety 해결하기
//		ArrayList list1 = new ArrayList(10);
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		// list1의 1자리부터 4번째의 자리값을 가지고 list2 생성
		// list2에는 list1에 "문자열"도 요소로 추가할 것이기 때문에 제네릭 타입을 명시하지 않겠습니다.
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		// ArrayList는 list 인터페이스를 구현했기 때문에 저장된 순서를 유지합니다.
		

		// Collections클래스의 sort()메소드를 이용하여 ArrayList에 저장된 객체들의 정보를 정렬
		// Collection: 인터페이스 / Collections:클래스 (주의)
		Collections.sort(list1); // list1과 list2를 정렬한다.
		Collections.sort(list2); // Collections.sort(List l)
		print(list1, list2);

		
		//list1이 list2의 모든 요소들을 포함하고 있을 때만 true를 반환합니다.
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		
		//add(Object o)를 이용하여 새로운 객체를 추가합니다.
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);

		
		// set(int index, Object o)
		// 해당 위치(index)에 있는 객체를 두번째 인자의 객체로 변경시킵니다.
		list2.set(3, "AA");
		print(list1, list2);

		
		// boolean retainAll(Collection c): ArrayList에 저장된 객체 중에서 주어진 컬렉션과 공통된 것들만을 남기고 나머지는 삭제합니다.
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제합니다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		print(list1, list2);

		
		
		// list2에서 list1에 포함된 객체들을 삭제하기 -> i=0부터 순차적으로 비교후 삭제
		//비정상적인 결과 확인 후 주석처리
		//변수 i를 증가시키면서 삭제시 자리이동으로 인한 비정상적인 결과 확인하기
		for (int i = 0; i <= list2.size() - 1; i++) {
			// Object get(int index): 지정된 위치에 저장된 객체를 반환합니다.
			// list2객체의 각 요소에 접근하기 위해 get()메소드를 사용
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제하기 -> 거꾸로 비교하면서 삭제
		// list2.size() - 1로 거꾸로 반복시키면서 삭제해야 자리 변동없이 올바른 결과를 얻을 수 있습니다.
		for (int i = list2.size() - 1; i >= 0; i--) {
			// Object get(int index): 지정된 위치에 저장된 객체를 반환합니다.
			// list2객체의 각 요소에 접근하기 위해 get()메소드를 사용
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		

	} // main()

	//print() 재정의
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}

}
