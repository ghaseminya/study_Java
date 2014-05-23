/* Thread - Join()호출하여 특정스레드 우선 실행
 * 
 * class MyRunnableTwo implements Runnable{ } 생성
 * -@Override public void run(){ }
 * -public void first()
 * -public void second()
 * 객체 생성
 * join()메서드 호출
 * 
 * --------------------------------------------------------
 * 스레드 스케줄러에 의해 매번 수행할 때마다 실행순서 변경됨 확인 
 * join()메서드를 호출하여 특정 스레드 먼저 수행됨을 확인 
 * 
 * join()메서드를 호출해서 join()메서드를 호출한 스레드가 먼저 수행되도록하고 다른 스레드를 잠시 중지하게 하는 기법
 * 
 */
package com.basic;

class MyRunnableTwo implements Runnable{
	@Override
	public void run(){
		System.out.println("run");
		first();
	}
	
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
		//join()호출후 출력 테스트
//		System.out.println(Thread.currentThread().getName() + "\t첫번째 출력");
//		System.out.println(Thread.currentThread().getName() + "\t두번째 출력");
				
		//객체 생성
		MyRunnableTwo mrt = new MyRunnableTwo();
		//스레드에 run()있는 클래스 객체 등록
		Thread t = new Thread(mrt);
		t.start();
		
		//join()메서드를 호출해서 join()메서드를 호출한 스레드가 먼저 수행되도록하고 다른 스레드를 잠시 중지하게 하는 기법
		try{
			t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}		
		
		//join()호출후 출력 테스트
//		System.out.println(Thread.currentThread().getName() + "\t두번째 출력");
		
		//현재 스레드의 이름 반환하기
		System.out.println(Thread.currentThread().getName() + "\t첫번째 출력");
		System.out.println(Thread.currentThread().getName() + "\t두번째 출력");
	}
}
