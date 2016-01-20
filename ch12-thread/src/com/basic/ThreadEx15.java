/*
2개의 쓰레드 생성하기 - Thread 클래스를 상속 받아 run()메소드를 오버라이드하는 방법
출력 순서는 자바가상머신에 의해 결정되어 집니다. 
두 개의 스레드가 번갈아가며 동시에 실행되고 있으며 2개의 스레드가 번갈아 가며 작업시간을 할당 받고 있습니다.



try – catch 구문
자바 프로그램이 실행 중에 예외가 발생될 경우 대책 없이 정지되는 것을 방지하기 위한 구문
예외는 프로그램 실행 중에 발생되는 에러로서 파일 입출력 시에 파일 읽기 오류 등이 이에 해당됩니다.

try{
	예외가 발생될 가능성이 있는 문장;
}catch(){
	예외 가 발생되었을 때 처리할 문장;
}

*/
package com.basic;

//Thread 클래스를 상속
public class ThreadEx15 extends Thread{
	//멤버 변수인 tname을 문자열 타입으로 선언
	String tname;
	
	public ThreadEx15(String name){
		//생성자에 의해 넘어온 문자열을 멤버변수에 저장
		tname = name;
	}
	
	

	@Override
	public void run() {
		super.run();
		
		while(true){
			
			try{
				//sleep() 메소드는 현재 실행중인 스레드를 지정된 시간 동안 쉬게 합니다.
				//단위는 1/1000 초이며 1000 일 경우 1초
				sleep(1000);
				
			}catch(Exception e){
				
			}
			System.out.println(tname);
		}
	}


	public static void main(String[] args) {		
		//4) 스레드 객체 생성
		ThreadEx15 td1 = new ThreadEx15("Thread1");
		ThreadEx15 td2 = new ThreadEx15("Thread2");
		//td.run(); 	//순차수행
		//5) start(); 호출
		td1.start(); 	//start()메소드가 호출되면 쓰레드  생성되고, 생성된 쓰레드는 run 메소드를 호출
		td2.start();
	}
}
