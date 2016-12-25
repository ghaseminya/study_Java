
package com.basic;
/* 
Runnable 구현 클래스를 통한 Thread생성


스레드의 생성 방법
	• Thread 클래스를 상속 받아 run()메소드를 오버라이드하는 방법
->	• Runnable 인터페이스를 구현하는 방법


//--------------------------------------------
스래드(Runnable구현) 생성방법
	TODO 1: implements Runnable
	TODO 2: @Override public void run(){ }
	TODO 3: Runnable이 구현된 클래스의 객체생성
	TODO 4: 스래드 생성시 스레드 생성자에 run()있는 클래스의 객체를 등록
	TODO 5: start();호출

//--------------------------------------------
Thread를 상속시킨것과 동일한 효과 확인하기
스레드 생성, 
스레드에 run()있는 클래스(Runnable이 구현된 객체)를 등록
 
*/


//TODO 1: implements Runnable
public class ThreadEx03 implements Runnable{	
	
	//TODO 2: @Override public void run(){ }
	@Override
	public void run(){
		for(int i=0; i<10; i++){

			try{
				//Static 메소드므로 객체생성없이 바로 호출가능
				//지정된 시간(밀리세컨드)만큼 수행을 멈춤
				Thread.sleep(1000);	//1초
			}catch(InterruptedException e){
				//오류메시지 출력: 오류내용, 오류난 줄수 표시
				e.printStackTrace();
			}
			//Static 메소드므로 객체생성없이 바로 호출가능
			System.out.print("스레드 이름: " + Thread.currentThread().getName() + "\t");	//현재 스레드의 객체 반환후 이름만 반환
			System.out.println("temp value: "+ i);
		}		
	}

	public static void main(String[] args) {
		//TODO 3: Runnable이 구현된 클래스의 객체생성
		ThreadEx03 td = new ThreadEx03();
		
		
		//TODO 4: 스래드 생성시 스레드 생성자에 run()있는 클래스의 객체를 등록
		//Runnable이 구현된 객체를 인자로 하여 Thread객체를 생성해서 등록
		//TODO: Thread이름 지정하여 생성
//		Thread t = new Thread(td, "두번째"); 
		//TODO : Thread이름 미설정시 시스템에서 자동 부여됨
		Thread t = new Thread(td);
		
		
		//TODO 5: start();호출
		//start() -> run() 병렬 수행할수 있도록 호출
		t.start();			
	}
}

/*//출력결과
//Thread이름 지정하여 생성한 결과 - TODO: Thread이름 지정하여 생성
스레드 이름: 두번째	temp value: 0
스레드 이름: 두번째	temp value: 1
스레드 이름: 두번째	temp value: 2
스레드 이름: 두번째	temp value: 3


//Thread이름 미설정시 시스템에서 자동 부여된 결과 - TODO : Thread이름 미설정시 시스템에서 자동 부여됨
스레드 이름: Thread-0	temp value: 0
스레드 이름: Thread-0	temp value: 1
스레드 이름: Thread-0	temp value: 2
스레드 이름: Thread-0	temp value: 3
스레드 이름: Thread-0	temp value: 4
*/