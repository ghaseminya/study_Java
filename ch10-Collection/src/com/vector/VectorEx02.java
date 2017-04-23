package com.vector;

// Vector의 용량(Capacity)와 크기(size) 살펴보기

import java.util.Vector;

public class VectorEx02 {

	public static void main(String[] args) {
		// 용량(capacity)이 5인 Vector를 생성한다.
		Vector v = new Vector(5);
		System.out.println("=== After Create ===");
		print(v);
		
		
		// 3개의 객체 저장
		v.add("10");
		v.add("20");
		v.add("30");
		System.out.println("=== After add() ===");
		print(v);

		
		// v.trimToSize() 호출하여 v의 빈 공간을 제거하여 size와 capacity를 같게 합니다.
		// 배열의 크기를 변경할 수 없기 때문에 새로운 배열을 생성해서 그 주소값을 v에 할당합니다.
		// 기존의 capacity 5인 Vector인스턴스는 더 이상 사용하지 않게 되어 이 후 가비지컬렉터(garbage collector)에 의해서 메로리에서 제거되어 집니다.
		v.trimToSize();	// 빈 공간을 없앤다.(용량과 크기가 같아진다.)
		System.out.println("=== After trimToSize() ===");
		print(v);

		
		// v.ensureCapacity(6): v의 capacity가 최소한 6이 되도록 합니다.
		// 만일 v의 capacity가 6이상이라면 아무일도 일어나지 않습니다.
		// 여기에서는 After trimToSize()후 capacity :3이므로 크기가 6인 배열을 생성해서 v의 내용을 복사하게 됩니다.
		// 여기서도 기존의 인스턴스를 사용하지 않고 새로운 크기의 인스턴스를 생성하여 사용하게 됩니다.
		v.ensureCapacity(6);
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);

		
		// v.setSize(7): v의 size가 7이 되도록 합니다.
		// 만일 v의 capacity가 충분하면 새로 인스턴스를 생성하지 않아도 되지만  After ensureCapacity(6) 후 capacity :6이므로 새로운 인스턴스를 생성하게 됩니다.
		// Vector는 capacity가 부족할 경우 자동적으로 기존의 크기보다 2배의 크기로 증가하게 됩니다.
		// 그래서 v의 capacity가 capacity :12 (6 *2배)가 됩니다.
		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		
		// v.clear(): v의 모든 요소를 삭제합니다.
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);
	}

	public static void print(Vector v) {
		System.out.println("v :" + v);
		System.out.println("size :" + v.size());
		System.out.println("capacity :" + v.capacity());
	}

}
