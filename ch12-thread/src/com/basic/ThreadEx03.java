/* Thread - 여러개의 Thread 생성
 *  
 * Runnable 구현한 클래스 객체 생성
 * 스레드 생성하면서 run()있는 클래스 객체 등록
 * start()
 * 
 * -----------------------------------------------------
 * 실행될 때마다 순서가 바뀌어서 실행되고 있음
 * 실행될 때마다 시스템마다 다르다 
 * 스케줄러가 매 순간 실행순서를 결정해주고 관리해 주고 있음
 * 
 */

package com.basic;

public class ThreadEx03 implements Runnable{

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
			System.out.println("스레드 이름: " + Thread.currentThread().getName() + "\t");	//현재 스레드의 객체 반환후 이름만 반환			
		}
	}
	
	public static void main(String[] args){
		//Runnable 구현한 클래스 객체 생성
		ThreadEx03 td = new ThreadEx03();
		
		//스레드 생성하면서 run()있는 클래스 객체 등록
		Thread t1 = new Thread(td, "첫번째 1111111");
		t1.start();	//start() -> run() 병렬 수행할수 있도록 호출
		//스레드 생성하면서 run()있는 클래스 객체 등록
		Thread t2 = new Thread(td, "두번째 2222222");
		t2.start();
		//스레드 생성하면서 run()있는 클래스 객체 등록
		Thread t3 = new Thread(td, "세번째 3333333");
		t3.start();
		//스레드 생성하면서 run()있는 클래스 객체 등록
		Thread t4 = new Thread(td, "네번째 4444444");
		t4.start();		
	}	
}