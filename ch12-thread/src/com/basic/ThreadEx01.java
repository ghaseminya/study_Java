/* Thread - Thread 상속
 * 
 * Thread 상속
 * 스레드 이름 지정
 * 스레드의 run()를 재정의
 * -sleep()
 * start();
 * 
 */

package com.basic;

public class ThreadEx01 extends Thread{
	
	//스레드 이름 지정
	public ThreadEx01(String threadName){
		super(threadName);	//스레드이름 설정, 지정하지 않으면 시스템에서 자동적으로 숫자로 이름부여됨		
	}
	
	//스레드의 run()를 재정의
	@Override
	public void run(){
		for(int i=0; i<10; i++){
			
			try{
				//지정된 시간(밀리세컨드)만큼 수행을 멈춤
				sleep(1000);	//1초
			}catch(InterruptedException e){
				//오류메시지 출력: 오류내용, 오류난 줄수 표시
				e.printStackTrace();
			}
			
			System.out.print("스레드 이름: " + currentThread().getName() + "\t");	//현재 스레드의 객체 반환후 이름만 반환
			System.out.println("temp value: "+ i);
		}
	}

	public static void main(String[] args) {		
		//스레드 객체 생성
		ThreadEx01 td = new ThreadEx01("첫번째");
		//td.run(); 	//순차수행
		td.start(); 	//start() -> run() 병렬 수행할수 있도록 호출
	}
}
