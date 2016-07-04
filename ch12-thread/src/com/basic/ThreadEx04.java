package com.basic;
/*
//Thread - Join()호출하여 특정스레드 우선 실행되게 하기


//---------------------------------------------

join()메서드를 호출하여 특정 스레드 먼저 수행됨을 확인 

join()메서드를 호출해서 join()메서드를 호출한 스레드가 먼저 수행되도록하고 다른 스레드를 잠시 중지하게 하는 기법
*/


//쓰레드 클래스 정의
class MyRunnableTwo implements Runnable{
	@Override
	public void run(){
		System.out.println("run");
		first();
	}
	
	//멤버 함수
	public void first(){
		System.out.println("first");
		second();
	}
	
	public void second(){
		System.out.println("second");
	}
}

public class ThreadEx04 {
	
	public static void main(String[] args){
		//join()호출전 출력 테스트
		System.out.println(Thread.currentThread().getName() + "\t첫번째 출력");
		System.out.println(Thread.currentThread().getName() + "\t두번째 출력");
				
		//객체 생성
		MyRunnableTwo mrt = new MyRunnableTwo();
		
		//스레드에 run()있는 클래스 객체 등록
		Thread t = new Thread(mrt);
		t.start();
		
		//TODO 1: join 메소드 호출하는 try~catch구문이 없는 경우의 결과 확인
		//TODO 2: join 메소드 호출하는 try~catch구문이 있는 경우의 결과 확인
		
		//join()메서드를 호출해서 join()메서드를 호출한 스레드가 먼저 수행되도록하고 다른 스레드를 잠시 중지하게 하는 기법
//		try{
//			t.join();
//		}catch(InterruptedException e){
//			e.printStackTrace();
//		}		
		
		//join()호출후 출력 테스트
		//현재 스레드의 이름 반환하기
		System.out.println(Thread.currentThread().getName() + "\t세번째 출력");
		System.out.println(Thread.currentThread().getName() + "\t네번째 출력");
	}
}


/*//출력결과
//TODO 1: join 메소드 호출하는 try~catch구문이 없는 경우의 결과 확인
main	첫번째 출력
main	두번째 출력
main	세번째 출력
main	네번째 출력
run
first
second

//TODO 2: join 메소드 호출하는 try~catch구문이 있는 경우의 결과 확인
main	첫번째 출력
main	두번째 출력
run
first
second
main	세번째 출력
main	네번째 출력
*/
