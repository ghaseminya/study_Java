/* Thread - Runnable 구현
 * 
 * implements Runnable
 * @Override public void run(){ }
 * Runnable이 구현된 클래스의 객체생성
 * 스레드에 run()있는 클래스를 등록
 * ---------------------------------------------------------
 * 스레드를 상속시킨것과 동일한 효과 확인하기
 * 스레드 생성, 스레드에 run()있는 클래스(Runnable이 구현된 객체)를 등록
 * 
 */

package com.basic;

public class ThreadEx02 implements Runnable{	
	
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
		//Runnable이 구현된 클래스의 객체생성
		ThreadEx02 td = new ThreadEx02();
		//Runnable이 구현된 객체를 Thread객체를 생성해서 등록
		//스레드 생성, 스레드에 run()있는 클래스 객체를 등록
		//Thread t = new Thread(td, "두번째");	
		Thread t = new Thread(td);	//Thead이름 미설정시 시스템에서 자동 부여됨
		//start() -> run() 병렬 수행할수 있도록 호출
		t.start();		
	}
}
