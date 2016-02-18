package com.basic;
/* 
Thread 우선순위 설정
  
TODO 1 : 기본우선순위 확인 -> 스레드 스케줄러에 의한 실행 순서 결과확인
TODO 2 : 우선순위 변경 -> 우선순위 설정후 실행 순서 결과확인

//----------------------------------
실행순서 확인 후
우선순위 설정없이 결과확인(우선순위와 관련해서 별도의 지시를 하지 않으면, 동일한 우선순위의 쓰레드들이 생성됩니다.)
우선순위 설정 후 결과확인(확률적으로 먼저 수행됨, 반드시 먼저 수행되는 것은 아님) 
섬세하게 실행순서를 제어할 수 는 없으며 실행순서보다는 데이터 처리에 집중하는 것이 더 의미있음.



스레드 스케줄링 방식
	• 선점형 스레드 스케줄링 방식은 스레드의 우선권을 가지고 우선순위가 높은 스레드를 먼저 수행시키는 방식이다.
	• 협력형 스레드 스케줄러는 실행중인 스레드가 CPU 사용권을 다른 스레드에게 넘길 때까지 기다리는 방식이다.
	• JVM은 우선순위에 따른 선점형 스레드 스케줄링 방식을 사용하고 있다.


스레드 스케줄러
	• 멀티 스레드가 수행될 때 어떤 스레드가 먼저 수행될지는 스레드 스케줄러가 결정하게 된다.
	• 자바 애플리케이션에서는 우선순위가 높은 선점형 스레드 스케줄러를 사용하고 있다.



스레드 우선순위
	• 우선순위가 높은 쓰레드의 실행을 우선시합니다.
	• 우선순위가 동일할 때는 CPU의 할당시간을 나누게 됩니다.
	• Thread 클래스에서는 스레드의 우선순위를 부여하는 setPriority(int newPriority) 메서드를 제공한다.


상수값							설명
static int MAX_PRIORITY		스레드가 가질 수 있는 최대 우선순위값(10)

static int NORM_PRIORITY	스레드가 가질 수 있는 기본 우선순위값(5)

static int MIN_PRIORITY		스레드가 가질 수 있는 최소 우선순위값(1)


*/


class ThreadTest01 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("-");
		}
	}	
}


class ThreadTest02 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("*");
		}		
	}
}

public class ThreadEx05 {
	public static void main(String[] args){
		ThreadTest01 th1 = new ThreadTest01();
		ThreadTest02 th2 = new ThreadTest02();

		//TODO 2: Thread 우선순위 7로 높이기, 1~10까지 설정가능
//		th1.setPriority(7);
//		th2.setPriority(7);
		
		//TODO 1: Thread 우선순위 확인, 
		//getPriority()의 반환값을 통해서 쓰레드의 우선순위를 확인 
		System.out.println("th1 (-): " + th1.getPriority());
		System.out.println("th2 (*): " + th2.getPriority());
		
		th1.start();
		th2.start();
	}
}
