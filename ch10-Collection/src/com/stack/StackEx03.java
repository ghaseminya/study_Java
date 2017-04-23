package com.stack;

import java.util.Stack;

public class StackEx03 {

	//웹브라우저의 뒤로, 앞으로 버튼의 기능을 구현하기 위해 2개의 Stack을 사용해야 합니다.
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		goURL("네이버");
		goURL("구글");
		goURL("다음");
		goURL("야후");

		printStatus();

		System.out.println("'뒤로가기' 버튼 클릭 >>> ");
		goBack();
		printStatus();

		System.out.println("'뒤로가기' 버튼 클릭 >>> ");
		goBack();
		printStatus();

		System.out.println("'앞으로 가기' 버튼 클릭 >>> ");
		goForward();
		printStatus();

		goURL("codedragon.tistory.com");
		System.out.println("새로운 URL주소로 이동 >>> ");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back: " + back);
		System.out.println("forward: " + forward);
		System.out.println("현재화면은 '" + back.peek() + "' 페이지입니다.");
		System.out.println();
	}

	//Stack에 데이터 추가
	public static void goURL(String url) {
		back.push(url);
		if (!forward.empty())
			forward.clear();
	}

	//앞으로 가기 처리
	public static void goForward() {
		if (!forward.empty())
			back.push(forward.pop());
	}

	//뒤로 가기 처리
	public static void goBack() {
		if (!back.empty())
			forward.push(back.pop());
	}
}
