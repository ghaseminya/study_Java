package com.basic;
/* Thread 생성
별도의 쓰레드 생성을 위해서는 별도의 쓰레드 클래스를 정의해 야 합니다.


스레드의 생성 방법
*	• Thread 클래스를 상속 받아 run()메소드를 오버라이드하는 방법
	• Runnable 인터페이스를 구현하는 방법

//--------------------------------------------

Thread
	• 프로세스는 실행중인 프로그램을 의미하며 운영체제적으로는 스레드를 담는 그룻에 해당합니다.
	• 쓰레드는 프로세스 내에서 별도의 실행흐름을 갖는 대상이며 한 프로세스 내에서 둘 이상의 쓰레드를 생성하는 것도 가능합니다.
	• 쓰레드는 모든 일의 기본 단위이며,
	• main 메소드를 호출하는 것도 프로세스 생성시 함께 생성되는 main 쓰레드를 통해서 이루어집니다.



스레드 생성 순서
	TODO 1: Thread 상속
	TODO 2: 스레드 이름 지정
	TODO 3: 스레드의 run()를 재정의
	TODO 4: 스레드 객체 생성
	TODO 5: start(); 호출

*/

//extends Thread를 상속하는 클래스를 스레드 클래스라고 합니다.
//TODO 1: Thread 상속
public class ThreadEx01 extends Thread{
	
	//TODO 2: 스레드 이름 지정
	public ThreadEx01(String threadName){
		super(threadName);	//스레드이름 설정, 지정하지 않으면 시스템에서 자동적으로 숫자로 이름부여됨		
	}
	
	//TODO 3: 스레드의 run()를 재정의
	@Override
	public void run(){	//스레드의 main메소드가 run()
		for(int i=0; i<10; i++){
			
			try{
				//지정된 시간(밀리세컨드)만큼 수행을 멈춤
				sleep(1000);	//1초
			}catch(InterruptedException e){
				//오류메시지 출력: 오류내용, 오류난 줄수 표시
				e.printStackTrace();
			}
			
			//현재 스레드의 객체 반환후 이름만 반환
			System.out.print("스레드 이름: " + currentThread().getName() + "\t");
			System.out.println("temp value: "+ i);
		}
	}

	public static void main(String[] args) {		
		//TODO 4: 스레드 객체 생성
		ThreadEx01 td = new ThreadEx01("첫번째");
//		td.run(); 	//순차수행
		
		//TODO 5: start(); 호출
		//start()메소드가 호출되면 쓰레드  생성되고, 생성된 쓰레드는 run 메소드를 호출
		td.start();

	}
}


/*//출력결과
스레드 이름: 첫번째	temp value: 0
스레드 이름: 첫번째	temp value: 1
스레드 이름: 첫번째	temp value: 2
스레드 이름: 첫번째	temp value: 3
*/
