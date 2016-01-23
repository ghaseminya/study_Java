/*
//동기화 메소드를 가진 클래스

TODO : 실행 결과 확인
두 개의 스레드가 번갈아 가며 동기화 메소드를 수행하고 있으며
출력되고 있는 두 줄이 거의 동시에 1초 간격으로 출력이 되고 있습니다.

File Info
ThreadEx01.java	• 동기화 메소드를 가진 클래스
ThreadEx02.java	• 동기화 메소드에 접근하기 위해 만든 스레드 클래스
				• ThreadEx01클래스의 plus()메소드 호출
ThreadEx03.java	• 동기화 메소드에 접근하기 위해 만든 스레드 클래스
				• ThreadEx01클래스의 minus()메소드 호출

*/

package com.thread.sync;

public class ThreadEx01 {

	//멤버변수인 num 변수 선언. 이 변수는 하나의 자원 역할을 하게 됩니다.
	int money;
	
	//동기화 메소드로서 num 변수를 1 증가시키고 화면에 출력하는 역할
	public synchronized void plus(String tname){
		System.out.print(tname + " : " + money);
		money++;
		System.out.println(" >> 잔액 " + money + "증가");
	}
	
	//동기화 메소드로서 num 변수를 1 감소시키고 화면에 출력하는 역할
	public synchronized void minus(String tname){
		System.out.print(tname + " : " + money);
		money--;
		System.out.println(" >> 잔액" + money + "감소");
	}
	
	
	public static void main(String[] args) {
		ThreadEx01 system = new ThreadEx01();
		
		//ThreadEx02 클래스의 인스턴스를 생성, 이 클래스는 스레드로서 plus 메소드를 호출하도록 되어 있습니다.
		ThreadEx02 te1 = new ThreadEx02(system, "예금");
		
		//ThreadExam5 클래스(예제 Ⅲ)의 인스턴스를 생성, 이 클래스는 스레드로서 minus 메소드를 호출하도록 되어 있습니다.
		ThreadEx03 te2 = new ThreadEx03(system, "출금");
		
		//스레드 시작
		te1.start();
		te2.start();
		//te1 스레드가 동기화 메소드인 plus() 를 실행하는 동안 te2 스레드가 다른 동기화 메소드인 minus() 를 실행할 수 없게 된다. 
		//따라서, num 변수가 일관성을 유지할 수 있게 된다. 
		//즉, 예금 과정이 끝나야 출금 과정이 시작되거나, 출금 과정이 끝나야 예금 과정이 시작될 수 있게 된다
		
	}
}
