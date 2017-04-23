package com.list;
// 긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담은 다음 출력하기
// 단순히 문자열을 특정크기로 잘라서 출력한다면 charAt(int i)와 for반복문을 사용하면 됩니다.
// 하지만 ArrayList에 저장하면 ArrayList의 기능을 이용하여 다양한 작업을 할 수 있어 간단하게 처리할 수 있습니다.

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx08 {

	public static void main(String[] args) {
		final int LIMIT = 10;	// 자르고자 하는 글자의 개수를 지정한다.
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		int length = source.length(); 

		// ArrayList 생성할 때 저장할 요소의 개수를 고려하여 실제 저장할 개수보다 약간 여유있게 크기를  잡습니다.
		// 생성할 때 지정한 크기보다 더많은 객체를 저장하면 자동적으로 크기가 늘어나기는 하지만 이 과정에서 처리시간(자원; cost)이 많이 소요되기 때문입니다.
		List list = new ArrayList(length/LIMIT + 10); 

		for(int i=0; i < length; i+=LIMIT) { 
			if(i+LIMIT < length ) 
				list.add(source.substring(i, i+LIMIT)); 
			else 
				list.add(source.substring(i)); 
		} 

		for(int i=0; i < list.size(); i++) { 
			System.out.println(list.get(i)); 
		} 
	} // main()

}
