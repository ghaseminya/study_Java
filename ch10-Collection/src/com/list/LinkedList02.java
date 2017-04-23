package com.list;

//ArrayList와 LinkedList의 성능차이 비교하기 - 접근시간 성능 비교

//ArrayList
//배열은 각 요소들이 연속적으로 메모리상에 존재하기 때문에 인덱스를 통해 또는 참조값을 통해 n번째 데이터의 주소를 얻어서 저장된 데이터를 곧바로 얽어올 수 있습니다.

//LinkedList
//LinkedList는 불연속적으로 위치한 각 요소들이 서로 연결된 구조이므로 처음부터 n번째 데이터까지 차례대로 읽어가야만(따라가야만) 원하는 값을 얻을 수 있습니다.
//그래서 읽어오는 데이터의 수가 많아질 수록 읽어온 시간(접근시간; access time)이 길어지게 됩니다.

//결론
//다루고자하는 데이터의 개수가 변하지 않는 다면 ArrayList가 효율적입니다.
//데이터의 개수의 변경이 잦은 경우라면 LinkedList를 사용하는 것이 효율적입니다.

//실무 사용
//두 컬렉션프레임의 장점을 이용해서  조합해서 사용하는 방법도 있습니다.
//처음에 데이터를 저장할 때는 ArrayList를 사용하고 데이터의 추가/삭제등 변경 작업을 할 때는 LinkedList로 데이터를 옮겨서 작업하면 좋은 성능을 얻을 수 있습니다.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {
	public static void main(String args[]) {
		ArrayList al = new ArrayList(1000000);
		LinkedList ll = new LinkedList();
		add(al);
		add(ll);

		System.out.println("접근시간(access time) 성능 비교 >>>");
		System.out.println("ArrayList : " + accessTime(al));
		System.out.println("LinkedList : " + accessTime(ll));
	}

	public static void add(List list) {
		for (int i = 0; i < 100000; i++)
			list.add(i + "");
	}

	public static long accessTime(List list) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++)
//		for (int i = 0; i < 100000; i++) //접근시간이 길어지는 것 확인 하는 코드
			list.get(i);

		long end = System.currentTimeMillis();

		return end - start;
	}
}


//출력결과
//접근시간 성능 비교 >>>
//ArrayList : 1
//LinkedList : 250
