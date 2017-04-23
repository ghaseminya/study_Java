package com.list;

//ArrayList와 LinkedList의 성능차이 비교하기 - 추가/삭제 시간 비교
//이를 통해 ArrayList와 LinkedList의 장단점을 확인하고 필요한 상황에 따라 적절한 자료구조를 사용하도록 합니다.

//--------------------
//결과1 - 순차적으로 추가/삭제한 경우에는 ArrayList > LinkedList보다 빠릅니다.
//add_order()
//remove_order()

//결과2 - 중간에 데이터를 추가/삭제한 경우에는 LinkedList > ArrayList보다 빠릅니다.  
//add_middle()
//remove_middle()
// 중간에 요소를 추가또는 삭제하는 경우 LinkedList는 각 요소간의 연결만 변경해주면 되기때문에 처리 속도가 상당히 빠릅니다.
// 반면, ArrayList는 각 요소드릉ㄹ 재배치하여 추가할 공간을 확보하거나 빈 공간을 채워야하기 때문에 처리 속도가 느리게 됩니다.

// 테스트에서는 rrayList와 LinkedList의 성능차이를 비교하기 위하여 데이터의 개수를 크게 잡았지만, 데이터의 개수가 크지 않다면 어느 것을 사용하여도 큰 차이가 나지않습니다.
// 그렇지만 rrayList와 LinkedList의 성능차이 및 장단점을 이해하고 상황에 따라 적절히 선택하여 사용할 수 있어야 겠습니다.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

	public static void main(String args[]) {
		// 추가할 데이터의 개수를 고려하여 충분한 크기로 ArrayList 생성
		// 단순히 저장하는 시간만을 비교할 수 있도록 ArrayList 생성시 저장할 데이터의 개수만큼 충분한 초기용량을 확보해서
		// 저장공간이 부족해서 새로운 ArrayList를 생성해야 하는 상황이 일어나지 않도록 생성합니다.
		// 그렇지 않으면 새로운 크기의 ArrayList를 생성하고 데이터를 복사하는 작업이 발생하게 되므로 
		// 이로 인해 순차적으로 데이터 를 추가해도 ArrayList보다 LinkedList가 더 빠를 수 있게 됩니다.
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();

		System.out.println("순차적으로 추가한 경우 >>>");
		System.out.println("ArrayList : " + add_order(al));
		System.out.println("LinkedList : " + add_order(ll));
		System.out.println();
		System.out.println("중간에 추가한 경우 >>>");
		System.out.println("ArrayList : " + add_middle(al));
		System.out.println("LinkedList : " + add_middle(ll));
		System.out.println();
		System.out.println("중간에서 삭제한 경우 >>>");
		System.out.println("ArrayList : " + remove_middle(al));
		System.out.println("LinkedList : " + remove_middle(ll));
		System.out.println();
		System.out.println("순차적으로 삭제한 경우 >>>");
		System.out.println("ArrayList : " + remove_order(al));
		System.out.println("LinkedList : " + remove_order(ll));
	} // main()

	//순차적으로 추가하기
	public static long add_order(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			list.add(i + "");
		long end = System.currentTimeMillis();
		return end - start;
	}

	//중간에 추가하기
	public static long add_middle(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}

	//순차적으로 삭제하기
	//순차적으로 삭제한다는 것은 마지막 데이터 부터 역순으로 삭제해 나간다는 것을 의미합니다.
	//ArrayList는 마지막 데이터 부터 삭제할 경우 각 요소들의 재배치가 필요하지않으므로 상당히 빠릅니다.
	//단, 마지막 요소 값을 null로만 바꾸면 됩니다.
	public static long remove_order(List list) {
		long start = System.currentTimeMillis();
		for (int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

	//중간에서 삭제하기
	public static long remove_middle(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}//class


// 출력결과
//순차적으로 추가한 경우 >>>
//ArrayList : 213
//LinkedList : 770
//
//중간에 추가한 경우 >>>
//ArrayList : 1876
//LinkedList : 12
//
//중간에서 삭제한 경우 >>>
//ArrayList : 1894
//LinkedList : 166
//
//순차적으로 삭제한 경우 >>>
//ArrayList : 6
//LinkedList : 37