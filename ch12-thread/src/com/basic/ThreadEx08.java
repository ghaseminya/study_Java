/*
멤버변수를 통한 Thread의 우선순위 지정

--------------------------------------------------------------------------
실행결과에서 보이듯이 쓰레드의 실행시간은 우선순위의 비율대로 나뉘어져 실행되지 않습니다. 
높은 우선순위의 쓰레드가 종료되어야 낮은 우선순위의 쓰레드가 실행됩니다.

*/
package com.basic;

public class ThreadEx08 {

	public static void main(String[] args) {
		ThreadPriority tr1 = new ThreadPriority("First", Thread.MAX_PRIORITY);
		ThreadPriority tr2 = new ThreadPriority("Second", Thread.NORM_PRIORITY);
		ThreadPriority tr3 = new ThreadPriority("Third", Thread.MIN_PRIORITY);
		
		//Thread.MAX_PRIORITY	스레드가 가질 수 있는 최대 우선순위값(10)
		//Thread.NORM_PRIORITY	스레드가 가질 수 있는 기본 우선순위(5)
		//Thread.MIN_PRIORITY	스레드가 가질 수 있는 최소 우선순위(1)
		
		tr1.start();
		tr2.start();
		tr3.start();
	}
}


class ThreadPriority extends Thread {
	String message;
	
	public ThreadPriority(String str, int priority) {
		message=str;
		setPriority(priority);
	}
	public void run() {
		for(int i=0; i<10; i++)
		//for(int i=0; i<10000; i++)
			System.out.println(message+"("+getPriority()+")");
	}	
}
